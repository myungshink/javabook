package chap4;

import java.util.Scanner;

public class OpEx10 {

	public static void main(String[] args) {
		System.out.println("점수를  입력하세요(0~100)");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String result = (score>=60)?"합격":"불합격";
		System.out.println(score + ":" + result);
		System.out.println( score + ":" + ((score%2==0)?"짝수":"홀수"));

	}

}
