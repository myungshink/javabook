package chap6;

public class ArrayEx13 {

	public static void main(String[] args) {
		int score[] = {90,80,70};
		int score2[] = new int[5];
		System.arraycopy(score, 0, score2, 1, score.length);
		for(int s : score2) {
			System.out.println(s);
		}

	}

}
