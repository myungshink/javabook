package chap16;

class Thread1 extends Thread {
	Thread1(String name) {
		super(name);
	}

	@Override
	public void run() { // Runnaing ���� : �������
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "=" + getName());
			try {
				sleep(1000); // 1�ʴ��. ������
			} catch (InterruptedException e) {
			}
		}
	} // Dead ����. �������
}

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main ������ ����");
		Thread1 t1 = new Thread1("First");// NEW ����
		Thread1 t2 = new Thread1("Second");// NEW ����
		t1.start();
		t2.start();
		System.out.println("main ������ ����");
	}
}
