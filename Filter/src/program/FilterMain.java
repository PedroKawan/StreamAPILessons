package program;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterMain {
	
	static Predicate<Students> approved = x -> x.getGrade() >= 6;
	static Predicate<Students> disapproved = x -> x.getGrade() < 6;
	
	public static void main(String[] args) {
		//Students
		List<Students> list =
				Arrays.asList(new Students("Pedro", 18, 8.5),
				new Students("Ana", 16, 7.2),
				new Students("João", 15, 5.5),
				new Students("Gui", 19, 4.0));
		
		list.forEach(System.out::print);
		
		l();
		
		//Filter only the students with a grade greater than 6
		list.stream()
			.filter(x -> x.getGrade() >= 6)
			.map(x -> x + " was approved!!")
			.forEach(System.out::println);
			
		l();
		
		//Also filter only the students with a grade greater than 6
		Stream<Students> approveds = list.stream().filter(approved);
		approveds.forEach(System.out::print);
		
		l();
		
		//Filter only the students with a grade less than 6
		Stream<Students> disapproveds = list.stream().filter(disapproved);
		disapproveds.forEach(System.out::print);
		
	}
	
	private static void l() {
		System.out.println();
	}
}
