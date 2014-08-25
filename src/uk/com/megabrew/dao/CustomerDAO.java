package uk.com.megabrew.dao;

import java.util.List;
import java.util.ArrayList;

import uk.com.megabrew.model.Customer;
import uk.com.megabrew.service.UserNotAuthorizedException;

public class CustomerDAO {
	
	public static List<Customer> customers = new ArrayList<Customer>();
	
	static {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setUsername("lucas@lucas.ninja");
		customer.setPassword("666TheNumberOfTheBeast");
		customers.add(customer);
	}
	
	public boolean auth(Customer customer) throws UserNotAuthorizedException {
		for (Customer c : customers) {
			if (c.getUsername().equals(customer.getUsername()) && c.getPassword().equals(customer.getPassword())) {
				return true;
			}
		}
		
		throw new UserNotAuthorizedException("Unable to authorize your login.");
	}
	
	public Customer searchCustomer(Customer customer) {
		return customer;
	}

}
