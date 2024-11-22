package model;

public class SaleManager {
	private Stock stock;
	private Sale sale;
	
	public SaleManager() {
		this.stock = new Stock();
	}
	
	public boolean addItem(String code, int qtd){
		if(sale == null) throw new IllegalArgumentException("Venda não aberta");
		
		Product p = new Product(code);
		if(stock.hasQuantity(p, qtd)) {			
			stock.debit(p, qtd);
			sale.createSaleItem(code, qtd);
			return true;
		}
		return false;
		
	}
	
	public void setPaymentMethod(String method) {
		if(sale == null) throw new IllegalArgumentException("Venda não aberta");
		
		sale.setPaymentMethod(method);
	}

	public void open() {
		sale = new Sale();
	}
	
	public void close() {
		sale = null;
	}
	
}
