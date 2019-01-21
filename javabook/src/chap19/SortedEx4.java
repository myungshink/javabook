package chap19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx4 {
	public static void main(String[] args) {
		List<Figure2> list = Arrays.asList(new Rectangle2(8,8),new Circle2(5),new Rectangle2(2,3));
		System.out.println("넓이순으로 정렬 하여 출력하기");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("둘레순으로 정렬하여 출력하기");
		list.stream().sorted(new Comparator<Figure2>() {
			@Override
			public int compare(Figure2 o1, Figure2 o2) {
				return (int)Math.floor(o1.length() - o2.length());
			}
		}).forEach(System.out::println);
		System.out.println("람다식을 이용하여 둘레순 정렬 하여 출력하기");
		list.stream().sorted((a,b)->(int)Math.floor(a.area() - b.area())).forEach(System.out::println);
	}
}
