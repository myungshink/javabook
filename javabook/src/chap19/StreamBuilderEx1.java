package chap19;

import java.util.stream.Stream;

public class StreamBuilderEx1 {
	public static void main(String[] args) {
		Stream<String> stream =  Stream.<String>builder().add("자바의").add("스트림을").add("배우자").build();
		stream.forEach(s->System.out.print(s + " "));
	}
}
