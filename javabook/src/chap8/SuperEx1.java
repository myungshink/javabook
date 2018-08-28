package chap8;
//[¿¹Á¦ 8-2]
class Parent {
	int x = 10;
}
class Child extends Parent {
	int x = 20;
	void method() {
		int x = 30;
		System.out.println(x);   //30
		System.out.println(this.x);//20
		System.out.println(super.x);//10
	}
}
public class SuperEx1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
