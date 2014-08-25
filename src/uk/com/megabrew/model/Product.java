package uk.com.megabrew.model;

public class Product {
	
	private long id;
	private String name;
	private String description;
	private String unitMeasure;
	private String volume;
	private int amount;
	private Double price;
	
	public Product() {
		super();
	}
	
	public Product(String name, String description, String unitMeasure, String volume, int amount, Double price) {
		super();
		this.name = name;
		this.description = description;
		this.unitMeasure = unitMeasure;
		this.volume = volume;
		this.amount = amount;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUnitMeasure() {
		return unitMeasure;
	}

	public void setUnitMeasure(String unitMeasure) {
		this.unitMeasure = unitMeasure;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


}
