package chap19;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStreamEx1 {
	public static void main(String[] args) {
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s->System.out.print(s+"\t"));
		System.out.println();
		Stream<String> stream2 = Arrays.stream(arr, 1, 3); // 1~2 ¿ä¼Ò [b, c]
		stream2.forEach(s->System.out.print(s+"\t"));
	}
}
