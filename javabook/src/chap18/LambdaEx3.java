package chap18;

@FunctionalInterface
interface LambdaInterface3 {
	void method(int x);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		LambdaInterface3 f2;
		f2 = (x)-> {
			System.out.println(x * 5);
		};
		f2.method(2); //10
		f2.method(20);//100
		f2 = x-> System.out.println(x * 5);
		f2.method(30);//150
	}
}
