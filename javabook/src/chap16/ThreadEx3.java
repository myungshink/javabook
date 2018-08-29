package chap16;

class ThreadPriority extends Thread {
	ThreadPriority(String name, int p) {
		super(name);
		setPriority(p); //우선순위 설정
	}
	public void run() {
		try {
			sleep(20);
		}catch (InterruptedException e) { }
		for(int i=0;i<50;i++) {
			System.out.println(this);
		}
	}
}
public class ThreadEx3 {
public static void main(String[] args) {
	System.out.println("높은 우선 순위 : " + Thread.MAX_PRIORITY);
		System.out.println("낮은 우선 순위 : " + Thread.MIN_PRIORITY);
		System.out.println("기본 우선 순위 : " + Thread.NORM_PRIORITY);
		Thread t1 = new ThreadPriority("First", 5);
		Thread t2 = new ThreadPriority("Second", 1);
		Thread t3 = new ThreadPriority("Third", 10);
		t1.start(); t2.start(); t3.start();
	}
}
