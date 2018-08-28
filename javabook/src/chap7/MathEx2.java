package chap7;
//[¿¹Á¦ 7-8]
class Math2 {
	int a,b;
	int add1() {
		return a + b;
	}
	static int add2(int a, int b) {
		return a + b;
	}
}
public class MathEx2 {
	public static void main(String[] args) {
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		System.out.println(m.add1());
		System.out.println(Math2.add2(100, 200));
	}
}
