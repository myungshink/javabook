package chap5;

public class LoopEx4 {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++) { //i=2
			System.out.println("\n"+ i + "´Ü");
			for(int j=2; j <=9 ; j++) { //j=5
				if(j==5) break;
				System.out.println
				(i + "*" + j + "=" +(i*j));
			}
		}

	}

}
