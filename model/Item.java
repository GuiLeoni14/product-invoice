package model;

public class Item {
	private Double price;
	private String name;
	
	public Item(Double price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}
