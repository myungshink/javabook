package chap19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapEx1 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("자바 8버전에 ", "추가된 스트림을","열심히 공부하자");
		list1.stream().flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(word -> System.out.println(word));
		System.out.println();
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		IntStream isr = list2.stream().flatMapToInt(data -> {
				String[] strArr = data.split(",");
				int[] intArr = new int[strArr.length];
				for(int i=0; i<strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
			});
		isr.forEach(n -> System.out.println(n));
	}
}
