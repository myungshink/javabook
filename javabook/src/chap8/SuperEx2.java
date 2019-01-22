package chap8;
//[예제 8-3]
class Parent2 {
	int x = 10;
	Parent2(int x) {	
     this.x = x;
	}
}
class Child2 extends Parent2 {
	int x = 20;
	Child2() {
		super(10);   //생략 불가
	}
	void method() {
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}

public class SuperEx2 {

	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.method();
	}
}
