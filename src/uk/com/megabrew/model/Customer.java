package uk.com.megabrew.model;

public class Customer {
	
	private int id;
	private String name;
	private String username;
	private String password;
	private int phone;
	
	public Customer() {
		super();
	}

	public Customer(int id, String name, String username, String password,
			int phone) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	
	
}
