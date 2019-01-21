package chap19;

import java.util.Arrays;
import java.util.List;

public class MapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿��","������","�����","����ġ��","�羾������");
		System.out.println();
		list.stream().mapToInt(String::length).forEach(len -> System.out.println(len));
		System.out.println();
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));
	}
}
