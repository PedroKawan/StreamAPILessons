package program;

import java.util.function.UnaryOperator;

public class Fc {
	
	// Transforms a String into a new, fully uppercase String
	public static UnaryOperator<String> upCase =
			x -> x.toUpperCase();
			
	// Get the first Letter of the String	
	public static UnaryOperator<String> fistLetter =
			x -> x.charAt(0) + "";
			
	// Remove all spaces in String
	public static UnaryOperator<String> removeSpaces =
			x -> x.replaceAll(" ", "");
	
}
