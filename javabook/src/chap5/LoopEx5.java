package chap5;

public class LoopEx5 {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++) { 
			System.out.println("\n"+ i + "´Ü");
			for(int j=2; j <=9 ; j++) {
				if(j==5) continue;
				System.out.println(i + "*" + j + "=" +(i*j));
			}
		}

	}

}
