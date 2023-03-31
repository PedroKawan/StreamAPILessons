package program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxMain {
	
	//Comparator Used
	static Comparator<Students> bestGrade = (x1, x2) -> {
		if(x1.getGrade() > x2.getGrade()) return 1;
		if(x1.getGrade() < x2.getGrade()) return -1;
		return 0;
	};
	
	public static void main(String[] args) {
		Students s1 = new Students("Pedro", 18, 1.5);
		Students s2 = new Students("Ana", 15, 1.5);
		Students s3 = new Students("Gui", 16, 2.5);
		Students s4 = new Students("Paula", 19, 1.0);
		Students s5 = new Students("Joao", 16, 1.3);
		
		List<Students> list = Arrays.asList(s1, s2, s3, s4, s5);
		
		// To understand better;  
		Comparator<Students> bestGradeU = (x1, x2) -> {
			int v = 0;
			if(x1.getGrade() > x2.getGrade()) v = 1;
			if(x1.getGrade() < x2.getGrade()) v = -1;
			System.out.println(v);
			return v;
		};
		
		list.stream().max(bestGradeU);
		/*  Pedro & Ana  -> 0
		 *  Ana & Gui    -> -1
		 *  Gui & Paula  -> 1
		 *  Paula & Joao -> 1
		 */
		
		// maximum grade
		System.out.println(list.stream().max(bestGrade).get());
		// minimum grade
		System.out.println(list.stream().min(bestGrade).get());
	}
}
