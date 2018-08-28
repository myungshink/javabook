package chap5;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt(); 
		if(score >= 60) {
			System.out.println("합격을 축하합니다.");
        }
	}

}
