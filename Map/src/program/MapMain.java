package program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapMain {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("mazda ", "bmw " , "ferrari ", "porsche ", "chevolet"); 
		list.forEach(System.out::print);
		
		l();
		
		//.map -> return a stream from a Function<>
		Stream<String> brands = list.stream().map(n -> n.toUpperCase());
		brands.forEach(System.out::print);
		
		l();

		
		list.stream()
			.map(Fc.removeSpaces)
			.map(Fc.fistLetter)
			.map(Fc.upCase)
			.forEach(System.out::print);
		
	}
	
	public static void l() {
		System.out.println();
	}
}
