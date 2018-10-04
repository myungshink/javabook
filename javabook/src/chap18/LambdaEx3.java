package chap18;

@FunctionalInterface
interface LambdaInterface3 {
	void method(int x);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		LambdaInterface3 f3;
		f3 = (x)-> {
			System.out.println(x * 5);
		};
		f3.method(2); //10
		f3.method(20);//100
		f3 = x-> System.out.println(x * 5);
		f3.method(30);//150
	}
}
