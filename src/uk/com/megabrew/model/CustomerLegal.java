package uk.com.megabrew.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

public class CustomerLegal extends Customer {
	
	private String cnpj;
	
	@XmlEnum
	@XmlType(name = "locationtype")
	public enum locationType {
		
		@XmlEnumValue("bar")
		BAR,
		
		@XmlEnumValue("pub")
		PUB,
		
		@XmlEnumValue("restaurant")
		RESTAURANT,
		
		@XmlEnumValue("cafeteria")
		CAFETERIA,
		
	}

	public CustomerLegal() {
		super();
	}

	public CustomerLegal(long id, String name, String username,
			String password, int phone) {
		super(id, name, username, password, phone);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public CustomerLegal(String cnpj) {
		super();
		this.cnpj = cnpj;
	}
	

}
