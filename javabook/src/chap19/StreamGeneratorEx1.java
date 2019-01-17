package chap19;

import java.util.stream.Stream;

public class StreamGeneratorEx1 {
	public static void main(String[] args) {
		Stream<String > stream = Stream.generate(()->"½ºÆ®¸²").limit(5);
		stream.forEach(s->System.out.println(s));
	}
}
