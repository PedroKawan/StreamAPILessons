package program;

import java.util.ArrayList;
import java.util.List;

public class Store {
	final List<Product> products = new ArrayList<>();
	
	public void put(String name, Double price){
		Product p = new Product(name, price);
		products.add(p);
	}
	
}
