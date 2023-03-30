package classes;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.Predicate;

public class Fc {
	//Price with discount
//	public static Function<Product, Double> priceDiscount = (x -> (1 - x.getDiscount()) * x.getPrice()); 
	public static Function<Product, Double> priceDiscount = x -> {
		BigDecimal discount = new BigDecimal(x.getDiscount().toString());
		discount = new BigDecimal("1").subtract(discount);
		
		BigDecimal price = new BigDecimal(x.getPrice().toString());
		
		return price.multiply(discount).doubleValue();
	}; 
	
	//Verify the discount
	public static Predicate<Product> discount = (x -> x.getDiscount() > 0);
	
	//Verify the freight
	public static Predicate<Product> freight = (x -> x.isFreight());
	
}
