package program;

import java.util.UUID;

public class Product {
	private final String ID = UUID.randomUUID().toString();
	private final String name;
	private final Double price;
	
	Product(String name, Double price){
		this.name = name;
		this.price = price;
	}

	public String getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}
	
	
}
