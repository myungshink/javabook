package chap12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//[���� 12-24]
public class ScannerEx1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = 	new Scanner(System.in);
		int sum = 0,cnt=0;
		System.out.println("���ڸ� �ڿ����� �Է��ϼ��� ����(0)");
		while(true) {
			int num = scan.nextInt();
			if(num < 1) break;
			sum += num;
			cnt++;
		}
		System.out.println("�Էµ����� �Ǽ�:"+cnt + ", �հ�:" + sum);
	}
}
