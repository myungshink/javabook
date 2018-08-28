package chap10;
//[예제 10-3]
class Outer3 {
	int iv =10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method1() {
			int iv =300;
			System.out.println("iv=" + iv);
			//InstanceInner 객체의 멤버변수 iv 출력
			System.out.println("this.iv=" + this.iv);
			//Outer 클래스의 멤버변수 iv 출력 : 외부클래스명.this.멤버변수명 : 외부클래스의  인스턴스멤버 호출함.
			System.out.println("Outer.this.iv=" + Outer3.this.iv);
		}
	}
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	void outMethod() {
		class LocalInner {
			int iv = 400;
		}
		LocalInner ll = new LocalInner();
		System.out.println(ll.iv);
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.outMethod();
		//내부클래스의 자료형의 이름은 외부클래스명.내부클래스명임
		Outer3.InstanceInner ii =out.new InstanceInner();
		ii.method1();

	}
}
