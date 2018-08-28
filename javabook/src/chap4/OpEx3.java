package chap4;

public class OpEx3 {
	public static void main(String[] args) {
		int x=5,y=5;
		System.out.println("(x++ + y--) =" + (x++ + y--));
		System.out.println("(x++ + y--) =" + (++x + --y));
		System.out.println("(x++ + y--) =" + (++x + y--)); 
		System.out.println("(x++ + y--) =" + (x++ + --y)); 
	}
}
