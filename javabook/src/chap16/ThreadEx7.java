package chap16;

class DaemonThread extends Thread {
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx7 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		t1.setDaemon(true);//t1스레드를 데몬스레드로 설정
		t2.setDaemon(true);//t2스레드를 데몬스레드로 설정
		t1.start(); t2.start();
		Thread.sleep(2000);
		System.out.println("main 스레드 종료");
	}
}
