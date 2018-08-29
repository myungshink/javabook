package chap16;

class Runnable1 implements Runnable {// Thread 아님
	@Override
	public void run() { // Running 상태
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
		System.out.println("main 스레드 시작");
		Runnable1 r = new Runnable1();
		// run()메서드는 r의 run()메서드 호출
		Thread t1 = new Thread(r, "First"); // New상태
		Thread t2 = new Thread(r, "Second");// New상태
		// t1.start(); t2.start(); //Runnable 상태
		t1.run();
		t2.run();
		System.out.println("main 스레드 종료");
	}
}
