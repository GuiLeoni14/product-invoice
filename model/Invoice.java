package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Invoice {
	ArrayList<Item> itens;
	ArrayList<String> names = new ArrayList<String>();
	
	public Invoice(ArrayList<Item> itens) {
		this.itens = itens;
	}
	
	public Double calculeteTotalPrice() {
		Double total = null;
		for (Item item : itens) {
			total += item.getPrice();
		}
		
		return total;
	}
	
	
	public void calculeteProductLinePerType() {
		for (Item item : itens) {
			if(!names.contains(item.getName())){
				this.names.add(item.getName());
			}
		}
		
		for (String productName : names) {
			Integer quantityPerProductType = 0;
			Double pricePerProductType = 0.0;
			Double productPrice = 0.0;
			for (Item item : itens) {
				if(item.getName() == productName) {
					quantityPerProductType+=1;
					pricePerProductType+= item.getPrice();
					productPrice = item.getPrice();
				}
			}	
			System.out.print("\n Quantidade de " + productName + "(s): " + quantityPerProductType + " item(s) " 
			+ "á " + productPrice + " ----- total: " + pricePerProductType + "");
		}
	}
	
	public void calculuteInvoiceTotalCost() {
		Double totalCost = 0.0;
		for (Item item : itens) {
			totalCost+= item.getPrice();
		}
	}
	
	public void execute() {
		this.calculeteProductLinePerType();
		this.calculuteInvoiceTotalCost();
	}
}
