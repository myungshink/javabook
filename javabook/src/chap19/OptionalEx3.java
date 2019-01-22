package chap19;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalEx3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		long count =list.stream().count();
		System.out.println("��ҵ��� ���� : " + count);
		int sum =list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("��ҵ���  �� : " + sum);

		OptionalDouble avg =list.stream().mapToInt(Integer::intValue).average();
		System.out.println("��ҵ���  ��� : " + avg.getAsDouble());

		OptionalInt max =list.stream().mapToInt(Integer::intValue).max();
		System.out.println("��ҵ� �� �ִ� �� : " + max.getAsInt());

		OptionalInt min =list.stream().mapToInt(Integer::intValue).min();
		System.out.println("��ҵ� �� �ּ� �� : " + min.getAsInt());

		OptionalInt first =list.stream().mapToInt(Integer::intValue).findFirst();
		System.out.println("��ҵ� �� ù��° �� : " + first.getAsInt());

	}
}
