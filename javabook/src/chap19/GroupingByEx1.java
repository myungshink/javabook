package chap19;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByEx1 {
	public static void main(String[] args) {
		List<Figure2> list = Arrays.asList(new Rectangle2(10,3),new Circle2(10),new Rectangle2(2,3),new Circle2(5));
		Map<String,List<Figure2>> map = list.stream().collect(Collectors.groupingBy(f->f.type));
		System.out.println("사각형 출력 :");
		map.get("사각형").stream().forEach(f->System.out.println(f));
		System.out.println("원 출력 :");
		map.get("원").stream().forEach(f->System.out.println(f));
	}
}
