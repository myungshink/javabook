package chap6;

import java.util.Scanner;

public class ArrayEx5 {
	public static void main(String[] args) {
		int digit[] = {2,8,10,16};
		char arr[] = new char[32];
		char data[] = {'0','1','2','3','4','5','6',
			'7','8','9','A','B','C','D','E','F'};
		Scanner scan = new Scanner(System.in);
		System.out.println("변환할 10진수를 입력하세요");
		int num = scan.nextInt();
		int divnum = num, index=0;
		for(int dig : digit) {
			divnum = num;
			index = 0;
			while(divnum != 0) {
				arr[index++]=data[divnum%dig];
				divnum /=dig;
			}
			System.out.print(num+"의 "+dig+"진수 :");
			for(int i=index-1;i>=0;i--){
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}

}
