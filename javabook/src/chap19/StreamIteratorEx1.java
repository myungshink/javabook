package chap19;

import java.util.stream.Stream;

public class StreamIteratorEx1 {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.iterate(30, n -> n + 2).limit(10);
		stream.forEach(s->System.out.println(s));
	}
}
