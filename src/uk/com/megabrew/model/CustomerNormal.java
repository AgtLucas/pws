package uk.com.megabrew.model;

public class CustomerNormal extends Customer {
	
	private String cpf;

	public CustomerNormal() {
		super();
	}

	public CustomerNormal(String cpf) {
		super();
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	
	

}
