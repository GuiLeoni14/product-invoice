package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<SaleItem> items = new ArrayList<SaleItem>();
	
	public void addSaleItem(SaleItem saleItem) {
		this.items.add(saleItem);
	}
	
	public double getTotal() {
		double total = 0;
		for (SaleItem saleItem : items) {
			total += saleItem.getSubtotal();
		}
		return total;
	}
}
