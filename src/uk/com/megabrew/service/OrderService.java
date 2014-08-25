package uk.com.megabrew.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import uk.com.megabrew.model.*;
import uk.com.megabrew.dao.CustomerDAO;
import uk.com.megabrew.dao.OrderDAO;
import uk.com.megabrew.dao.ProductDAO;

@WebService
public class OrderService {
	
	private ProductDAO productDAO = new ProductDAO();
	private CustomerDAO customerDAO = new CustomerDAO();
	
	public List<Product> listProducts() {
		return productDAO.getProducts();
	}
	
	OrderDAO orderDAO = new OrderDAO();
	
	@WebResult(name = "pedido")
	public List<Order> createOrder(@WebParam(name = "pedido") Order order, @WebParam(name = "usuario", header = true) Customer customer)
		throws UserNotAuthorizedException {
		
		if (customerDAO.auth(customer)) {
			processOrder(order, customer);
			orderDAO.createOrder(order);
			return orderDAO.getOrder();
		}
		return null;
	}
	
	private void processOrder(Order order, Customer customer) {
		Customer c = customerDAO.searchCustomer(customer);
		order.setCustomer(c);
		for (Item item : order.getItems()) {
			Product p = productDAO.searchProduct(item.getProduct());
			item.setProduct(p);
		}
	}
	
	public static void main (String[] args) {
		Endpoint.publish("http://localhost.8180/products", new OrderService());
		System.out.println("Go!");
	}

}
