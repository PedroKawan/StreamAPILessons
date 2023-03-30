package program;

import java.util.function.UnaryOperator;

public class Fc {
	
	public static UnaryOperator<String> upCase =
			x -> x.toUpperCase();
			
	public static UnaryOperator<String> fistLetter =
			x -> x.charAt(0) + "";
			
	public static UnaryOperator<String> removeSpaces =
			x -> x.replaceAll(" ", "");
	
}
