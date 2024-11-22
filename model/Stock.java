package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Stock {
	private List<StockItem> stockItems = new ArrayList<>();

	public Stock() {
		Map<String, String[]> stocks = Database.selectAllStockItems();
		for (String code : stocks.keySet()) {
			Product p = new Product(code);
			p.setDescription(stocks.get(code)[0]);

			int qtd = Integer.parseInt( stocks.get(code)[1]);
			StockItem item = new StockItem(p, qtd);
			
			stockItems.add(item);
		}
	}

	public boolean hasQuantity(Product p, int qtd) {
		StockItem item = null;
		for (StockItem stockItem : stockItems) {
			if(stockItem.getProduct().getCode().equals(p.getCode())) {
				item = stockItem;
				break;
			}
		}
		
		if(item == null) {
			return false;
		}
		
		return item.getQuantity() >= qtd;
	}

	public void debit(Product p, int qtd) {
		StockItem item = null;
		for (StockItem stockItem : stockItems) {
			if(stockItem.getProduct().getCode().equals(p.getCode())) {
				item = stockItem;
				break;
			}
		}
		
		if(item == null) {
			return;
		}
		
		if(item.getQuantity() < qtd) {
			return;
		}
		
		item.setQuantity(item.getQuantity() - qtd);
	}
}
