package chap16;

class MyThread extends Thread {
	MyThread(ThreadGroup tg, String name) {
		super(tg, name);
	}

	public void run() {
		while (true) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
			}
			System.out.println(this + "=>" + this.getThreadGroup().getName());
		}
	}
}

public class ThreadEx6 {
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup tg = new ThreadGroup("Group1");
		Thread t1 = new MyThread(tg, "First");
		Thread t2 = new MyThread(tg, "Second");
		Thread t3 = new MyThread(tg, "Third");
		Thread t4 = new MyThread(Thread.currentThread().getThreadGroup(), "Four");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		Thread.sleep(2000);
		tg.stop(); // tg에 속한 스레드를 강제 종료
	}
}
