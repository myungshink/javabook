package chap16;

class Runnable1 implements Runnable {// Thread �ƴ�
	@Override
	public void run() { // Running ����
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "=" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println("main ������ ����");
		Runnable1 r = new Runnable1();
		// run()�޼���� r�� run()�޼��� ȣ��
		Thread t1 = new Thread(r, "First"); // New����
		Thread t2 = new Thread(r, "Second");// New����
		// t1.start(); t2.start(); //Runnable ����
		t1.run();
		t2.run();
		System.out.println("main ������ ����");
	}
}
