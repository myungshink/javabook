package chap10;
//[예제 10-1]
class Outer1 {
	class InstanceInner { //인스턴스 내부클래스
		int iv = 100;
		//static int cv = 10; //클래스 멤버는 소유 불가능
		final static int MAX = 200;
	}
	static class StaticInner { //static 내부 클래스
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() {
		class LocalInner { //지역 내부 클래스
			int iv = 600;
			//static int cv = 700; //error 클래스 멤버 불가능
			final static int MAX = 700;
		}
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv);
		System.out.println(lc.MAX);
	}
	void method2() {
		//LocalInner lc = new LocalInner(); //error
	}

}
public class InnerEx1 {
	public static void main(String[] args) {
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println(si.iv);
		System.out.println(Outer1.StaticInner.cv);
		System.out.println(Outer1.StaticInner.MAX);
		Outer1.InstanceInner ii = new Outer1().new InstanceInner();
		Outer1 outer = new Outer1();
		Outer1.InstanceInner ii2=outer.new InstanceInner();
		System.out.println(ii2.iv);
		System.out.println(Outer1.InstanceInner.MAX);
		outer.method();
	}
}
