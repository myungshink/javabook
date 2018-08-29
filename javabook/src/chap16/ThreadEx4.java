package chap16;

class InterruptThread extends Thread {
	public void run() {
		System.out.println("지금부터 1000초 동안 sleep 합니다.");
		System.out.println("1000초 후에 봅시다");
		try {
			sleep(1000000);
		} catch (InterruptedException e) {
			System.out.println("1000초 sleep을 못했습니다.");
		}
	}
}

public class ThreadEx4 {
	public static void main(String[] args) {
		InterruptThread t = new InterruptThread();
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		t.interrupt();
	}
}
