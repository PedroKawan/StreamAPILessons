package classes;

import java.util.UUID;

public class Product {

	private final String ID = UUID.randomUUID().toString();
	private final String name;
	private final Double price;
	private Double discount;
	private boolean freight;

	Product(String name, Double price, Double discount, boolean freight){
		this.name = name;
		this.price = price;
		this.setDiscount(discount);
		this.setFreight(freight);
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
	
	public Double getDiscount() {
		return discount;
	}
	
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	public boolean isFreight() {
		return freight;
	}
	
	public void setFreight(boolean freight) {
		this.freight = freight;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}
