package view;

import model.Sale;

public class Main {

	public static void main(String[] args) {
		
		Sale sale = new Sale();
		sale.createSaleItem("at", 2);
		sale.createSaleItem("ff", 1);
		sale.createSaleItem("msa", 2);
		
		for (String item : sale.getItems()) {
			System.out.print(item);
		}
	}

}
