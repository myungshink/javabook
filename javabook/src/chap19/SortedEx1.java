package chap19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","ÀÓ²©Á¤");
		System.out.println("±âº» Á¤·Ä");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("±âº»ÀÇ ¿ª¼ø Á¤·Ä");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
