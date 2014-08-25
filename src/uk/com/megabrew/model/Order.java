package uk.com.megabrew.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class Order {
	
	private long id;
	private List<Item> items;
	@XmlTransient
	private Customer customer;
	private double totalValue;
	
	public Order() {
		super();
	}
	
	public Order(long id, List<Item> items, Customer customer, double totalValue) {
		super();
		this.id = id;
		this.items = items;
		this.customer = customer;
		this.totalValue = totalValue;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
	

}
