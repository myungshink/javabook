package chap18;
/*
 * 람다객체 내부의 this, 지역변수처리
 */
interface LambdaInterface5 {
	void method();
}
class Outer { 
	public int iv = 10;
	void method() {
		final  int iv =40;
		LambdaInterface5 f5 = () -> {
			System.out.println("Outer.this.iv:" + Outer.this.iv);
			System.out.println("this.iv:" + this.iv);
			System.out.println("iv:" + iv);
		};
		f5.method();
	}
}
public class LambdaEx5 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}
