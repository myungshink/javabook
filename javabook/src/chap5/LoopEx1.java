package chap5;

public class LoopEx1 {

	public static void main(String[] args) {
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5);
		System.out.println(" for ������ 1 ~ 5 ���");
		int i=0;
		for(i=1;i<=5;i++) {
			System.out.print(i);
		}
		System.out.println("\n while ������ 1 ~ 5 ���");
		i=1;
		while(i<=5) {
			System.out.print(i);
			i++;
		}
		System.out.println("\n do while ������ 1 ~ 5 ���");
		i=1;
		do {
			System.out.print(i);
			i++;
		}while(i<=5);
		
	}

}
