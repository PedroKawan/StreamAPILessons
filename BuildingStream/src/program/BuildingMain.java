package program;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class BuildingMain {
	public static void main(String[] args) {
		Consumer<Object> print = System.out::print;  
		Consumer<Object> printe = o -> System.out.print(o + " ");  
		
		// Building Stream using 'Stream.of'
		Stream<String> names =
				Stream.of("Pedro ", "Ana ", "João ", "Michael\n"); 
		names.forEach(print);
		
		
		l();
		
		Number[] n = {1.0, 5, 6.3, 2.1, 8};
		
		// Building Stream using 'Stream.of' and 'array'
		Stream<Number> numbers = Stream.of(n);
		numbers.forEach(printe);
		
		l();
		
		// Building Stream using 'Arrays.stream(x)'
		Stream<Number> numbers2 = Arrays.stream(n);
		numbers2.forEach(printe);
//		Arrays.stream(n).forEach(printe);
		 
		l();
		
		// Numbers between 'startInclusive' and 'endExclusive'
		Stream<Number> selectedNumbers =
				Arrays.stream(n, 3, n.length);
		selectedNumbers.forEach(printe);
		
		
		l();
		
		List<String> test =
				Arrays.asList("Test1 ", "Test2 ", "Test3 ");
		
		// Building Stream using 'Collections'
		Stream<String> streamTest = test.stream();
		streamTest.forEach(printe);
		
		l();
		// Run in parallel
		test.parallelStream().forEach(printe);;
		
		// Generate
		Stream<String> other = Stream.generate(() -> "Why?");
//					other.forEach(BuildingMain::l);
		
		BigDecimal big = new BigDecimal("0");
		Stream<Double> other2 =
				Stream.iterate(0.0, x -> {
						BigDecimal value = new BigDecimal(x.toString());
						BigDecimal sum = new BigDecimal("0.1");
						return value.add(sum).doubleValue();
					});
				
		
		
		other2.forEach(BuildingMain::l);
	}
	
	private static void l() {
		System.out.println();
	}
	private static void l(Object o) {
		System.out.println(o);
	}
}
