package chap18;

public class LambdaEx2 {
	public static void main(String[] args) {
		System.out.println("main 시작");
		Runnable r = () -> {
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum += i;
			}
			System.out.println("100까지의 합:" + sum);
		};
		Thread t = new Thread(r);
		t.start();
		System.out.println("main 종료");
	}
}
