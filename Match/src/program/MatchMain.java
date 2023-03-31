package program;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchMain {
	//Match
	//PT-BR -> Corresponde, combinar, igualar.
	public static void main(String[] args) {
		Students s1 = new Students("Pedro", 18, 1.5);
		Students s2 = new Students("Ana", 15, 1.5);
		Students s3 = new Students("Gui", 16, 2.5);
		Students s4 = new Students("Paula", 19, 1.0);
		Students s5 = new Students("Joao", 16, 1.0);
		
		List<Students> list = Arrays.asList(s1, s2, s3, s4, s5);
		
		Predicate<Students> approve = x -> x.getGrade() >= 6;
		Predicate<Students> disapprove = x -> x.getGrade() < 6;
		
		// if all match the predicate | if all students pass
		print(list.stream().allMatch(approve));
		print(list.stream().allMatch(disapprove));
		
		// if any match the predicate | if any student pass
		print(list.stream().anyMatch(approve));
		print(list.stream().anyMatch(disapprove));
		
		// if none match the predicate | if none student pass
		print(list.stream().noneMatch(approve));
		print(list.stream().noneMatch(disapprove));
	}
	
	private static void print(Object o) {
		System.out.println(o);
	}
}
