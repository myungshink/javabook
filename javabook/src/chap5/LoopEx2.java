package chap5;

public class LoopEx2 {
	public static void main(String[] args) {
		int sum=0, i=1;
		System.out.println("for구문을 이용한 합 구하기");
		for(i=1;i<=100;i++) {
			sum += i; //반복문장이 1개인 경우 {} 생략 가능
		}
		System.out.println("for를 이용한 합계:" + sum);
		System.out.println("while구문을 이용한 합 구하기");
		sum=0;
		i=1;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("while를 이용한 합계:" + sum);
		System.out.println("do while구문을 이용한 합 구하기");
		sum=0;
		i=1;
		do {
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println("dowhile를 이용한 합계:"+sum);

	}

}
