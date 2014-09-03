package uk.com.megabrew.model;

public class CustomerNormal extends Customer {
	
	private String cpf;

	public CustomerNormal() {
		super();
	}

	public CustomerNormal(long id, String name, String username,
			String password, int phone) {
		super(id, name, username, password, phone);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	

}
