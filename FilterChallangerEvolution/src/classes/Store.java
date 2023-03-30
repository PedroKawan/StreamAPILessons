package classes;

import java.util.ArrayList;
import java.util.List;

public class Store {
	//Products list
	final List<Product> products = new ArrayList<>();
	
	public void put(String name, Double price, Double discount, boolean freight){
		Product p = new Product(name, price, discount, freight);
		products.add(p);
	}
	
	public List<Product> getProductList() {
		return products;
	}
}
