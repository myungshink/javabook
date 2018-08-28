package chap7;
//[예제 7-14]
class Number1 {
	int num;
}
class Number2 {
	int num;
	Number2(int x) {
		num = x;
	}
}

public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		n1.num = 10;
		Number2 n2 = new Number2(20); //error 
		System.out.println("Number1클래스의 num=" + n1.num);
		System.out.println("Number2클래스의 num=" + n2.num);
	}
}
