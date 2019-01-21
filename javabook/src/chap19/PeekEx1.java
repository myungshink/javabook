package chap19;

import java.util.Arrays;
import java.util.List;

public class PeekEx1 {
	public static void main(String[] args) {
		List<Figure2> list = Arrays.asList(new Rectangle2(8,8),new Circle2(5),new Rectangle2(2,3));
		System.out.println("결과 출력 없음");
		list.stream().mapToDouble(a->a.area()).peek(a->System.out.println(a)); //결과 출력 없음
		System.out.println("결과 출력 하기");
		double totSum = list.stream().mapToDouble(a->a.area()).peek(a->System.out.println(a)).sum();
		System.out.println("도형 면적의 합:" + totSum);

	}
}
