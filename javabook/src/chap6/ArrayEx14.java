package chap6;

import java.util.Arrays;

public class ArrayEx14 {

	public static void main(String[] args) {
		int score[] = {90,80,70};
		int score2[] = null;
		score2 = Arrays.copyOf(score, 5);
		for(int s : score2) {
			System.out.println(s);
		}

	}

}
