package chap19;

import java.util.Arrays;
import java.util.List;

public class FilterStreamEx1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("È«±æµ¿", "±è»ñ°«", "È«±æµ¿", "ÀÓ²©Á¤", "È«±æµ¿");
		
		list.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		list.stream()
			.filter(n -> n.startsWith("È«"))
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		list.stream()
			.distinct()
			.filter(n -> n.startsWith("È«"))
			.forEach(n -> System.out.println(n));		

	}

}
