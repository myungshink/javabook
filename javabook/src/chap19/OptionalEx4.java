package chap19;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalEx4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		long count =list.stream().count();
		System.out.println("��ҵ��� ���� : " + count);
		int sum =list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("��ҵ���  �� : " + sum);

		OptionalDouble avg =list.stream().mapToInt(Integer::intValue).average();
		if(avg.isPresent()) {
		   System.out.println("��ҵ���  ��� : " + avg.getAsDouble());
		}

		int max =list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("��ҵ� �� �ִ� �� : " + max);

		list.stream().mapToInt(Integer::intValue).findFirst()
				     .ifPresent(a->System.out.println("��ҵ� �� ù��° �� : " + a));

	}
}
