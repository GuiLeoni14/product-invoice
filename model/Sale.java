package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<SaleItem> items = new ArrayList<SaleItem>();
	
	public void pay(PaymentMethod paymentMethod) {
		paymentMethod.pay(this.getTotal());	
		paymentMethod.describeMethod();
		
	}
	
	public void createSaleItem(String code, int quantity) {
		SaleItem item = new SaleItem();
		item.createProduct(code, quantity);
		
		items.add(item);
	}
	
	public double getTotal() {
		double total = 0;
		for (SaleItem saleItem : items) {
			total += saleItem.getSubtotal();
		}
		return total;
	}
	
	public List<String> getItems(){
		List<String> itemsStr = new ArrayList<>();
		
		for (SaleItem salteItem : items) {
			System.out.print(salteItem);
		}
		
		return itemsStr;
	}
}
