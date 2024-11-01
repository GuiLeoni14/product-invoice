package view;

import model.Product;
import model.Sale;
import model.SaleItem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product rice = new Product();
		rice.setDescription("Arroz Tatiana");
		rice.setPrice(30);
		
		Product beans = new Product();
		rice.setDescription("Feijão Feijó");
		rice.setPrice(20);
		
		SaleItem itemRice = new SaleItem();
		itemRice.setProduct(rice);
		itemRice.setQuantity(2);
		
		SaleItem itemBens = new SaleItem();
		itemBens.setProduct(beans);
		itemBens.setQuantity(3);
		
		Sale sale = new Sale();
		sale.addSaleItem(itemRice);
		sale.addSaleItem(itemBens);
	}

}
