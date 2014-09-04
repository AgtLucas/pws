package uk.com.megabrew.model;

public class CustomerLegal extends Customer {
	
	private String cnpj;
	
	private CustomerType customerType = CustomerType.PUB;

	public CustomerLegal() {
		super();
	}

	public CustomerLegal(int id, String name, String username, String password,
			int phone) {
		super(id, name, username, password, phone);
	}

	public CustomerLegal(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
	

}
