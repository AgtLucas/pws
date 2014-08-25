package uk.com.megabrew.dao;

import java.util.List;
import java.util.ArrayList;

import uk.com.megabrew.model.Order;

public class OrderDAO {
	
	private static List<Order> o = new ArrayList<Order>();
	
	public List<Order> getOrder() {
		return o;
	}
	
	public void createOrder(Order order) {
		o.add(order);
	}

}
