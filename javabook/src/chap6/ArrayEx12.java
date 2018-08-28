package chap6;

public class ArrayEx12 {

	public static void main(String[] args) {
		int score[] = {90,80,70};
		int score2[] = new int[5];
		for(int i=0; i<score.length;i++) {
			score2[i] = score[i];
		}
		for(int s : score2) {
			System.out.println(s);
		}

	}

}
