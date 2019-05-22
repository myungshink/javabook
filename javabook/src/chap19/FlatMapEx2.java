package chap19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapEx2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50,60);
		
		Stream<String> sr =  (Stream<String>) list.stream().flatMap(data -> {
			List<String> lstr = new ArrayList<String>();
			lstr.add(data * 10 + "°³");
			return lstr.stream();
		});
		sr.forEach(n -> System.out.println(n));
	}
}
