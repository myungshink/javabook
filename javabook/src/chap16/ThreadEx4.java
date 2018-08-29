package chap16;

class InterruptThread extends Thread {
	public void run() {
		System.out.println("���ݺ��� 1000�� ���� sleep �մϴ�.");
		System.out.println("1000�� �Ŀ� ���ô�");
		try {
			sleep(1000000);
		} catch (InterruptedException e) {
			System.out.println("1000�� sleep�� ���߽��ϴ�.");
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
