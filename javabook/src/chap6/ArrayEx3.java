package chap6;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		//1~45까지 숫자를 배열에 저장
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1;
		}
		//번호를 섞기
		for(int i=0; i<1000; i++) {
			int f = (int)(Math.random() * 45);
			int t = (int)(Math.random() * 45);
			int tmp = balls[f];
			balls[f] = balls[t];
			balls[t] = tmp;
		}
		//0~ 5번까지 선택
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = balls[i];
		}
		//정렬하기
		for(int i=0;i<lotto.length;i++) {
			boolean change = false;
			for(int j=0;j<lotto.length-1-i;j++) {
				if(lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
					change = true;
				}
			}
			if(!change) break;
		}
                //출력하기	
		System.out.print("선택된 번호 :");
		for(int l : lotto) {
			System.out.print(l + "  ");
		}
		System.out.println();

	}
}
