package program;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Fc {
	//Convert a Integer number to Binary (0 | 1)
	public static Function<Integer,String> toBinary =
			x -> Integer.toBinaryString(x);
			
	//StringBuilder -> inverse the String
	public static UnaryOperator<String> inverse = x -> {
		return new StringBuilder(x).reverse().toString();
	};
	
	//Convert a Binary number to Integer
	public static Function<String,Integer> toInteger = x -> {
		String s = inverse.apply(x);
		int number = 0;
		
		for (int i = 0; i < x.length(); i++) {
			if (s.charAt(i) == '1')
				number += (int) Math.pow(2,i);
		}
		
		return number;
	};
			
	
}

//Flawed function
/*	
public static Function<String,String> inverse = x -> { 
	String inverse = "";
	
	for (int i = x.length() - 1; i >= 0; i--) {
		inverse += x.charAt(i) + "";
	}
	
	return inverse;
};
*/	
