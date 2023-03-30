package program;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ISMain {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ana", "Bia", "João", "Pedro");
		names.forEach(System.out::println);
		
		print("-");
		
		//Use the 'has next?' method! to get the next element in list
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		
		
		Stream<String> stream = names.stream();
		
		// Parallel Run.
		Stream<String> stream2 = names.parallelStream();
		
		print("-");
		
		stream.forEach(System.out::println);
		
		print("-");
		
		stream2.forEach(System.out::println);
	}
	
	private static void print(Object o) {
		System.out.println("-> " + o);
	}
}
