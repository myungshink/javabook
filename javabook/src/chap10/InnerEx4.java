package chap10;
//[���� 10-4]
interface I {
	void test();
}
abstract class Abs {
	int x;
	abstract void testmethod() ;
}

public class InnerEx4 {
	public static void main(String[] args) {
		I i = new I(){  //�̸����� ���� Ŭ����
			@Override
			public void test() {
				System.out.println("test �޼��� ������");
			}
		};
		i.test();
		Abs a = new Abs(){
			@Override
			void testmethod() {
				System.out.println("testmethod ������");
			}
		};
		a.testmethod();

	}
}
