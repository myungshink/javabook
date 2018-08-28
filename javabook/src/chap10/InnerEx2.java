package chap10;
//[예제 10-2]
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner{
		int iiv = outeriv;             //외부클래스의 private 멤버에 접근 가능
		int iiv2 = outercv;            //외부클래스의 private 멤버에 접근 가능
	}
	static class StaticInner  extends Object{
		int siv = new Outer2().outeriv; //외부클래스의 private 멤버에 접근 가능
		static int scv = outercv;       //외부클래스의 private 멤버에 접근 가능
	}
	static StaticInner cv = new StaticInner();
	InstanceInner iv = new InstanceInner();
	static InstanceInner cv2 = new Outer2().new InstanceInner();
	void method(int pv) {
		class LocalInner extends Object{  //지역내부클래스
			int liv = outeriv; //외부클래스의 private 멤버에 접근 가능
			int liv2 = outercv;//외부클래스의 private 멤버에 접근 가능
			void method() {
				//pv = 100; //error
				System.out.println("pv=" + pv );
				System.out.println(liv + "," + liv2);
				System.out.println(outeriv + "," + outercv);
			}
		}
		LocalInner ll = new LocalInner();
		ll.method();
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
		Outer2 outer=new Outer2();
		outer.method(1);
		Outer2.InstanceInner i2 = outer.new InstanceInner();
		System.out.println(i2.iiv);
		System.out.println(i2.iiv2);		
		Outer2.StaticInner inner3 = new Outer2.StaticInner();
		System.out.println(inner3.siv);
		System.out.println(Outer2.StaticInner.scv);
	}
}
