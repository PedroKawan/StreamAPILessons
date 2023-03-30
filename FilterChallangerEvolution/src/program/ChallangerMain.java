package program;

import java.util.List;

import classes.Fc;
import classes.Product;
import classes.Store;

public class ChallangerMain {

	public static void main(String[] args) {
		Store store = new Store();
		store.put("Backpack", 84.95, 0.05, true);
		store.put("Notebook", 2500.00, 0.30, false);
		store.put("Keyboard", 300.0, 0.20, false);
		store.put("Mouse", 250.0, 0.10, true);
		store.put("MousePad", 50.0, 0.0, false);
		store.put("Book", 100.0, 0.20, false);
		
		// Print price
//		store.getProductList().forEach(x -> System.out.println(x.getPrice()));
		
		System.out.println();
		
		// Print price with discount
//		store.getProductList().forEach(x -> System.out.println(Fc.priceDiscount.apply(x)));
		
		
		//Filters the products, only those with discount and without freight
		List<Product> special =
				store.getProductList().stream()
				.filter(Fc.discount)
				.filter(Fc.freight.negate())
				.toList();
		
		special.forEach(System.out::println);
	}
}
