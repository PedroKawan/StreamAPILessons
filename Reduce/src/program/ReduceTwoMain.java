package program;

import java.util.Arrays;
import java.util.List;

public class ReduceTwoMain {
	
	public static void main(String[] args) {
		Students s1 = new Students("Pedro", 18, 8.5);
		Students s2 = new Students("Ana", 15, 7.5);
		Students s3 = new Students("Gui", 16, 2.5);
		Students s4 = new Students("Paula", 19, 10.0);
		Students s5 = new Students("Joao", 16, 1.0);
		
		List<Students> list = Arrays.asList(s1, s2, s3, s4, s5);
		
		list.stream()
			.filter(x -> x.getGrade() >= 6) // If it is grade greater than 6
			.map(x -> x.getGrade())	// Return the grade
			.reduce((x, y) -> x  + y) // Sum all grades
			.ifPresent(x -> System.out.println("<>" + x)); // Print the totalSum
		
		
	}
}
