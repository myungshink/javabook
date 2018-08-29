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
			t1.join(); // t1�����尡 ����ñ��� main���
			t2.join(); // t2�����尡 ����ñ��� main���
		} catch (InterruptedException e) {
		}
		System.out.println("1����100������ �ι��� ��:" + (t1.sum + t2.sum));
	}
}
