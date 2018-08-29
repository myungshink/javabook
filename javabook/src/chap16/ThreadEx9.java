package chap16;

class PrintThread2 extends Thread {
	char ch;

	PrintThread2(char ch) {
		this.ch = ch;
	}

	static Integer lock = new Integer(1);

	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized (lock) { // ����ȭ ����. �Ӱ迵��
				for (int j = 0; j < 80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			} // ����ȭ ���� ����
		}
	}
}

public class ThreadEx9 {
	public static void main(String[] args) {
		Thread t1 = new PrintThread2('A');
		Thread t2 = new PrintThread2('B');
		Thread t3 = new PrintThread2('C');
		t1.start();
		t2.start();
		t3.start();
	}
}