package chap19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapEx2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50,60);
		
		IntStream isr =  (IntStream) list.stream().flatMap(data -> {
			int[] intArr = new int[6];
			for(int i=0; i<intArr.length; i++) {
				intArr[i] = data * 10;
			}
			return ;
		});
		isr.forEach(n -> System.out.println(n));
	}
}
