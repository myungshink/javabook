package chap16;

import java.io.IOException;

public class ProcessEx {
	public static void main(String[] args) {
		try {
			Process p1 = Runtime.getRuntime().exec("mspaint.exe");
			Process p2 = Runtime.getRuntime().exec("notepad.exe");
			p1.waitFor(); // p1 ���μ����� ����ñ��� ���
			p2.destroy();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
