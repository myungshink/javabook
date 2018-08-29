package chap16;

class Atm implements Runnable {
	private long money = 100000;

	@Override
	public void run() {
		synchronized (this) { // mother
			for (int i = 0; i < 10; i++) {
				if (money <= 0) {
					System.out.println("통장에 잔액이 없습니다.");
					break;
				}
				withDraw(10000);
				try {
					Thread.sleep((int) (Math.random() * 100));
				} catch (InterruptedException e) {
				}
			}
		} // 동기화 블럭 종료
	}

	private void withDraw(int m) {
		if (money <= 0)
			return;
		money -= m;
		System.out.println(Thread.currentThread().getName() + ", 잔액:" + money);
	}
}

public class ThreadEx11 {
	public static void main(String[] args) {
		Atm atm = new Atm();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		mother.start();
		son.start();
	}
}
