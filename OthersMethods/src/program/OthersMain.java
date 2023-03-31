package program;

import java.util.Arrays;
import java.util.List;

public class OthersMain {
	
	public static void main(String[] args) {
		Students s1 = new Students("Pedro", 18, 8.5);
		Students s2 = new Students("Ana", 15, 3.5);
		Students s3 = new Students("Gui", 16, 7.5);
		Students s4 = new Students("Paula", 19, 5.0);
		Students s5 = new Students("Joao", 16, 4.3);
		Students s6 = new Students("Emy", 18, 9.5);
		Students s7 = new Students("Ana", 15, 1.5);
		Students s8 = new Students("Paulo", 16, 2.5);
		Students s9 = new Students("Jorge", 19, 1.0);
		Students s10 = new Students("Joao", 16, 1.3);
		
		List<Students> list =
				Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		
		print("-- distinct --");
		list.stream().distinct().forEach(OthersMain::print);
		
		print("\n-- Skip / limit --");
		list.stream().distinct()
			.skip(2)
			.limit(4)
			.forEach(OthersMain::print);
		
		print("\n-- takeWhile --");
		list.stream().distinct()
			.skip(2)
/*while*/	.takeWhile(x -> x.getGrade() < 9) //if predicate is true -> stop
			.forEach(OthersMain::print);
	}
	
	private static void print(Object o) {
		System.out.println(o);
	}
}
