package chap10;
//[���� 10-3]
class Outer3 {
	int iv =10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method1() {
			int iv =300;
			System.out.println("iv=" + iv);
			//InstanceInner ��ü�� ������� iv ���
			System.out.println("this.iv=" + this.iv);
			//Outer Ŭ������ ������� iv ��� : �ܺ�Ŭ������.this.��������� : �ܺ�Ŭ������  �ν��Ͻ���� ȣ����.
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
		//����Ŭ������ �ڷ����� �̸��� �ܺ�Ŭ������.����Ŭ��������
		Outer3.InstanceInner ii =out.new InstanceInner();
		ii.method1();

	}
}
