package view;

import java.util.ArrayList;
import java.util.List;

import model.Invoice;
import model.Item;

public class Main {
	public static void main(String[] args) {
		ArrayList<Item> caixa = new ArrayList<>(); 
		
		caixa.add(new Item(12.0, "Manteiga"));
		caixa.add(new Item(2.0, "Morango"));
		caixa.add(new Item(12.0, "Manteiga"));
		caixa.add(new Item(2.0, "Morango"));
		caixa.add(new Item(12.0, "Manteiga"));
		caixa.add(new Item(2.0, "Tomate"));
		caixa.add(new Item(32.0, "Nutela"));
		caixa.add(new Item(32.0, "Tomate"));

		Invoice invoice = new Invoice(caixa);
		
		invoice.execute();
	}
}
