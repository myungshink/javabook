package chap16;

class PrintThread3 extends Thread {
	Printer ptr;
	char ch;

	PrintThread3(char ch, Printer ptr) {
		this.ch = ch;
		this.ptr = ptr;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			ptr.printChar(ch);
		}
	}

	synchronized void printChar(char ch) {
		for (int i = 0; i < 80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

}

class Printer { // 공유객체
	// 동기화 메서드 : 임계영역
	synchronized void printChar(char ch) {
		for (int i = 0; i < 80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}

public class ThreadEx10 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		PrintThread3 t1 = new PrintThread3('A', ptr);
		PrintThread3 t2 = new PrintThread3('B', ptr);
		PrintThread3 t3 = new PrintThread3('C', ptr);
		t1.start();
		t2.start();
		t3.start();
	}
}
