package chap19;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectEx1 {
	public static void main(String[] args) {
		List<Figure2> list = Arrays.asList(new Rectangle2(10,3),new Circle2(10),new Rectangle2(2,3));
		List<Figure2> rectList = list.stream().filter(s-> s.type.equals("사각형")).collect(Collectors.toList());
		rectList.stream().forEach(f->System.out.println(f));
		System.out.println();
		Set<Figure2> rectSet = list.stream().filter(s-> s.type.equals("사각형")).collect(Collectors.toSet());
		rectSet.stream().forEach(f->System.out.println(f));
	}
}
