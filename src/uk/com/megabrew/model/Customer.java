package uk.com.megabrew.model;

public class Customer {
	
	private String name;
	private int phone;
	
	public Customer() {
		super();
	}
	
	public Customer(long id, String name, String username, String password, int phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	

}
