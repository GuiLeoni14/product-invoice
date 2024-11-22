package model;

public class Product {
	private String code;
	private String description;
	private double price;
	
	public Product(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}
	
	public String getCode() {
		return code;
	}
}
