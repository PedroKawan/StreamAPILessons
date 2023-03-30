package program;

import java.util.Arrays;
import java.util.List;

public class ChallangeMain {
	/*
	 * 1. Number to binary string...
	 * 2. Reverse the string...
	 * 3. Binary string to Number(Integer)...
	 */
	
	public static void main(String[] args) {
		List<Integer> list = 
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
		
		list.stream()
			.map(Integer::toBinaryString)
			.forEach(System.out::println);
		
		//Convert to binary, and then, to Integer.
		list.stream()
		.map(Fc.toBinary)
		.map(Fc.toInteger)
		.forEach(System.out::println);
		
		System.out.println();
		
		list.stream()
		.map(Fc.toBinary)
		.map(Fc.inverse)
//		.map(Fc.toInteger)
		.forEach(System.out::println);

		//StringBuilder
		System.out.println(Fc.inverse.apply("\uD835\uDD38BC"));
	}
}
