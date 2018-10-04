package chap18;

public class LambdaEx2 {
	public static void main(String[] args) {
		System.out.println("main ����");
		Runnable r = () -> {
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum += i;
			}
			System.out.println("100������ ��:" + sum);
		};
		Thread t = new Thread(r);
		t.start();
		System.out.println("main ����");
	}
}
