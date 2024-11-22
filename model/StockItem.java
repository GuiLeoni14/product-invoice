package model;

public class StockItem {
	private Product product;
	private int quantity;
	
	public StockItem(Product p, int qtd) {
		this.product = p;
		this.quantity = qtd;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public Product getProduct() {
		return product;
	}
}
