package chap18;

interface LambdaInterface4 {
	int method(int x, int y);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		LambdaInterface4 f3 = (x,y) -> {
			return x * y;
		};
		System.out.println("두수의 곱 :" + f3.method(2, 5));
		f3 = (x,y)-> x + y;
		System.out.println("두수의 합 :" + f3.method(2, 5)); 
		f3 = (x,y)-> { return x/y; };
		System.out.println("두수의 몫 :" + f3.method(5, 2)); 
		f3 = (x,y)-> x%y;
		System.out.println("두수의 나머지 :" + f3.method(5, 2)); 
		f3 = (x,y)-> sum(x,y);
		System.out.println("두수의 합 :" + f3.method(2, 5)); 
	}
	static int sum (int x, int y) {
		return x+y;
	}
}