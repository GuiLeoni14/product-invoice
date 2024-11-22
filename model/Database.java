package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
	private static Map<String, String[]> products = new HashMap<String, String[]>();
	private static Map<String, String[]> stocks = new HashMap<String, String[]>();
	
	static {
		products.put("at", new String[] {"Arroz tatiana", "30"});
		products.put("ff", new String[] {"Feijão feijó", "20"});
		products.put("msa", new String[] {"Macarrão Santa Amália", "15"});
		
		stocks.put("at",  new String[] {"Arroz tatiana", "2"});
		stocks.put("ff", new String[] {"Feijão feijó", "3"});
		stocks.put("msa", new String[] {"Macarrão Santa Amália", "5"});
	}
	
	
	public static String[] selectProduct(String code) {
		return products.get(code);
	}
	
	public static String[] selectStockItem(String code) {
		return stocks.get(code);
	}
	
	public static Map<String, String[]> selectAllStockItems() {
		return stocks;
	}
}
