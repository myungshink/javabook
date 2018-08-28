package chap5;

import java.util.Scanner;

public class SwitchEx2{
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade;
		switch(score/10) {
		  case 10:
		  case 9 : grade="A";break;
		  case 8 : grade="B";break;
		  case 7 : grade="C";break;
		  case 6 : grade="D";break;
		  default : grade="F";break;
		}
		System.out.println (score + "점수는 " + grade + "학점입니다.");
	}
}
