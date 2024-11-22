package view;

import model.Sale;
import model.SaleManager;

public class Main {

	public static void main(String[] args) {
		
		SaleManager saleManager = new SaleManager();	
		saleManager.addItem("at", 2);
		saleManager.addItem("ff", 1);
		saleManager.addItem("msa", 2);

	}

}
