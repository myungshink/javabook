package chap10;
//[���� 10-2]
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner{
		int iiv = outeriv;             //�ܺ�Ŭ������ private ����� ���� ����
		int iiv2 = outercv;            //�ܺ�Ŭ������ private ����� ���� ����
	}
	static class StaticInner  extends Object{
		int siv = new Outer2().outeriv; //�ܺ�Ŭ������ private ����� ���� ����
		static int scv = outercv;       //�ܺ�Ŭ������ private ����� ���� ����
	}
	static StaticInner cv = new StaticInner();
	InstanceInner iv = new InstanceInner();
	static InstanceInner cv2 = new Outer2().new InstanceInner();
	void method(int pv) {
		class LocalInner extends Object{  //��������Ŭ����
			int liv = outeriv; //�ܺ�Ŭ������ private ����� ���� ����
			int liv2 = outercv;//�ܺ�Ŭ������ private ����� ���� ����
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
