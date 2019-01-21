package chap19;

import java.util.Arrays;
import java.util.List;

public class MatchEx1 {
	public static void main(String[] args) {
		List<Figure> list = Arrays.asList(new Rectangle(8,8),new Circle(5),new Rectangle(2,3));
		boolean result = list.stream().allMatch(a-> (a instanceof Figure));
		System.out.println("list ������ ��Ҵ� ��� Figure ��ü�ΰ�? " + result);
		result = list.stream().anyMatch(a-> (a instanceof Circle));
		System.out.println("list ������ ��ҿ� Circle ��ü�� �����ϴ°�? " + result);
		result = list.stream().noneMatch(a-> (a instanceof Rectangle));
		System.out.println("list ������ �����  ��ü�� Rectangle ��ü�� �ƴѰ�? " + result);
	}
}
