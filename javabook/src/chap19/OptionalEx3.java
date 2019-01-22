package chap19;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalEx3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		long count =list.stream().count();
		System.out.println("요소들의 갯수 : " + count);
		int sum =list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("요소들의  합 : " + sum);

		OptionalDouble avg =list.stream().mapToInt(Integer::intValue).average();
		System.out.println("요소들의  평균 : " + avg.getAsDouble());

		OptionalInt max =list.stream().mapToInt(Integer::intValue).max();
		System.out.println("요소들 중 최대 값 : " + max.getAsInt());

		OptionalInt min =list.stream().mapToInt(Integer::intValue).min();
		System.out.println("요소들 중 최소 값 : " + min.getAsInt());

		OptionalInt first =list.stream().mapToInt(Integer::intValue).findFirst();
		System.out.println("요소들 중 첫번째 값 : " + first.getAsInt());

	}
}
