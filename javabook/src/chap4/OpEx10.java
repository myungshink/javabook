package chap4;

import java.util.Scanner;

public class OpEx10 {

	public static void main(String[] args) {
		System.out.println("������  �Է��ϼ���(0~100)");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String result = (score>=60)?"�հ�":"���հ�";
		System.out.println(score + ":" + result);
		System.out.println( score + ":" + ((score%2==0)?"¦��":"Ȧ��"));

	}

}
