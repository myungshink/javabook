package chap19;

import java.util.Arrays;
import java.util.List;

public class MapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("È«±æµ¿Àü","ÃáÇâÀü","±¸¿î¸ù","Àü¿ìÄ¡Àü","»ç¾¾³²Á¤±â");
		System.out.println();
		list.stream().mapToInt(String::length).forEach(len -> System.out.println(len));
		System.out.println();
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));
	}
}
