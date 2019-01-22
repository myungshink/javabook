package chap19;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalEx4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		long count =list.stream().count();
		System.out.println("요소들의 갯수 : " + count);
		int sum =list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("요소들의  합 : " + sum);

		OptionalDouble avg =list.stream().mapToInt(Integer::intValue).average();
		if(avg.isPresent()) {
		   System.out.println("요소들의  평균 : " + avg.getAsDouble());
		}

		int max =list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("요소들 중 최대 값 : " + max);

		list.stream().mapToInt(Integer::intValue).findFirst()
				     .ifPresent(a->System.out.println("요소들 중 첫번째 값 : " + a));

	}
}
