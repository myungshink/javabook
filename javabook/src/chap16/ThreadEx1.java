package chap16;

class Thread1 extends Thread {
	Thread1(String name) {
		super(name);
	}

	@Override
	public void run() { // Runnaing 상태 : 실행상태
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "=" + getName());
			try {
				sleep(1000); // 1초대기. 대기상태
			} catch (InterruptedException e) {
			}
		}
	} // Dead 상태. 종료상태
}

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Thread1 t1 = new Thread1("First");// NEW 상태
		Thread1 t2 = new Thread1("Second");// NEW 상태
		t1.start();
		t2.start();
		System.out.println("main 스레드 종료");
	}
}
