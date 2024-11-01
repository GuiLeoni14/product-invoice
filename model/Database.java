package model;

import java.util.HashMap;
import java.util.Map;

public class Database {
	private static Map<String, String[]> products = new HashMap<String, String[]>();
	
	static {
		products.put("at", new String[] {"Arroz tatiana", "30"});
		products.put("ff", new String[] {"Feijão feijó", "20"});
		products.put("msa", new String[] {"Macarrão Santa Amália", "15"});
	}
	
	public static String[] selectProduct(String code) {
		return products.get(code);
	}
}
