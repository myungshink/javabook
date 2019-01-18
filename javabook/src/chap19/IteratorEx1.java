package chap19;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[]{"È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","¼ºÃáÇâ","ÀÓ²©Á¤","Çâ´ÜÀÌ"});
		System.out.println("¿ÜºÎ ¹İº¹ÀÚ ÀÌ¿ë ");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\n³»ºÎ ¹İº¹ÀÚ ÀÌ¿ë ");
		list.stream().forEach(s->System.out.println(s));
	}
}
