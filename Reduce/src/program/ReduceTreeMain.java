package program;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ReduceTreeMain {
	
	public static void main(String[] args) {
		Students s1 = new Students("Pedro", 18, 8.5);
		Students s2 = new Students("Ana", 15, 7.5);
		Students s3 = new Students("Gui", 16, 2.5);
		Students s4 = new Students("Paula", 19, 10.0);
		Students s5 = new Students("Joao", 16, 1.0);
		
		List<Students> list = Arrays.asList(s1, s2, s3, s4, s5);
		
		BiFunction<Students, Double, Students> doubleGrade = (s, g) -> {
			s.setGrade(s.getGrade() + g);
			return s;
		};
		
		BinaryOperator<Students> newGrade = (s, os) -> os;
		
			list.stream()
				.map(x -> x.getGrade())
				.reduce((x, y) -> x + y)
				.ifPresent(System.out::println);;
		
		System.out.println(list.stream()
			.map(x -> x.getGrade())
			.reduce(s1, doubleGrade, newGrade).getGrade());
		
			
	}
}
