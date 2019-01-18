package chap19;

import java.util.stream.IntStream;

public class CharToStreamEx1 {
	public static void main(String[] args) {
		IntStream csr =  "Stream을 배우자".chars(); // [83, 116, 114, 101, 97, 109]
		csr.forEach(s->System.out.print((char)s));
	}
}
