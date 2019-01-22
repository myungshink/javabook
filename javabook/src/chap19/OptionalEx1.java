package chap19;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalEx1 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i=1;i<=100;i++) {
			arr[i-1] = i;
		}
		long count =Arrays.stream(arr).count();
		System.out.println("요소들의 갯수 : " + count);
		int sum =Arrays.stream(arr).sum();
		System.out.println("요소들의  합 : " + sum);

		OptionalDouble avg =Arrays.stream(arr).average();
		System.out.println("요소들의  평균 : " + avg.getAsDouble());

		OptionalInt max =Arrays.stream(arr).max();
		System.out.println("요소들 중 최대 값 : " + max.getAsInt());

		OptionalInt min =Arrays.stream(arr).min();
		System.out.println("요소들 중 최소 값 : " + min.getAsInt());

		OptionalInt first =Arrays.stream(arr).findFirst();
		System.out.println("요소들 중 첫번째 값 : " + first.getAsInt());

	}
}
