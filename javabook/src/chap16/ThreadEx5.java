package chap16;

class Thread100 extends Thread {
	int sum = 0;

	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

public class ThreadEx5 {
	public static void main(String[] args) {
		Thread100 t1 = new Thread100();
		Thread100 t2 = new Thread100();
		t1.start();
		t2.start();
		try {
			t1.join(); // t1스레드가 종료시까지 main대기
			t2.join(); // t2스레드가 종료시까지 main대기
		} catch (InterruptedException e) {
		}
		System.out.println("1부터100까지의 두번의 합:" + (t1.sum + t2.sum));
	}
}
