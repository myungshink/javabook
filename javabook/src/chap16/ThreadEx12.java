package chap16;

class Atm2 implements Runnable {
	private long money = 100000;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				if (money <= 0) {
					System.out.println("잔액이 없습니다.");
					notify();
					break;
				}
				withDraw(10000);
				if (money % 20000 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
					}
				} else {
					notify();
				}
			}
		} // 동기화 블럭 종료
	}

	private void withDraw(int m) {
		if (money <= 0)
			return;
		money -= m;
		System.out.println(Thread.currentThread().getName() + ",잔액:" + money);
	}
}

public class ThreadEx12 {
	public static void main(String[] args) {
		Atm2 atm = new Atm2();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		mother.start();
		son.start();
	}
}
