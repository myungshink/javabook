package chap19;

import java.util.Arrays;
import java.util.List;

public class MatchEx1 {
	public static void main(String[] args) {
		List<Figure> list = Arrays.asList(new Rectangle(8,8),new Circle(5),new Rectangle(2,3));
		boolean result = list.stream().allMatch(a-> (a instanceof Figure));
		System.out.println("list 내부의 요소는 모두 Figure 객체인가? " + result);
		result = list.stream().anyMatch(a-> (a instanceof Circle));
		System.out.println("list 내부의 요소에 Circle 객체가 존재하는가? " + result);
		result = list.stream().noneMatch(a-> (a instanceof Rectangle));
		System.out.println("list 내부의 요소의  객체는 Rectangle 객체가 아닌가? " + result);
	}
}
