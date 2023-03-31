package program;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceMain {
	
	static BinaryOperator<Integer> sum = (accu, x) -> accu + x; 
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); 
		
		// Initial value is undefined.
		Integer total1 = list.stream().reduce(sum).get();
		System.out.println(total1);
		
		Integer total2 = list.stream().reduce(100, sum);
		
		//The initial value for each function.
		Integer totalParallel = list.parallelStream().reduce(100, sum);
		
		System.out.println(total2);
		System.out.println(totalParallel);
		
		list.stream()
			.filter(x -> x < 5)
			.reduce(sum)
			.ifPresent(x -> System.out.println("." + x)); // if it has any value: run Consumer<T>
	}
}
