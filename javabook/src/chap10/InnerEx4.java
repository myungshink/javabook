package chap10;
//[예제 10-4]
interface I {
	void test();
}
abstract class Abs {
	int x;
	abstract void testmethod() ;
}

public class InnerEx4 {
	public static void main(String[] args) {
		I i = new I(){  //이름없는 내부 클래스
			@Override
			public void test() {
				System.out.println("test 메서드 구현함");
			}
		};
		i.test();
		Abs a = new Abs(){
			@Override
			void testmethod() {
				System.out.println("testmethod 구현함");
			}
		};
		a.testmethod();

	}
}
