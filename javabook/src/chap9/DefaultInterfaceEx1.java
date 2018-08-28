package chap9;
//[예제 9-5]
interface MyInterface1 {
	default void method1() {
		System.out.println("MyInterface1 의 디폴트 메서드 : method1() ");
	}
	static void staticMethod() {
		System.out.println("MyInterface1 의 static 메서드 : staticMethod() ");
	}
}
interface MyInterface2 {
	default void method1() {
		System.out.println("MyInterface2 의 디폴트 메서드 : method1() ");
	}
	static void staticMethod() {
		System.out.println("MyInterface2 의 static 메서드 : staticMethod() ");
	}
}
class Parent {
	public void method2() {
		System.out.println("Parent 클래스의 멤버 메서드 : method1() ");
	}
}
class Child extends Parent implements MyInterface1,MyInterface2{
	@Override
	public void method1() {
		System.out.println("Child 클래스의 멤버 메서드 : method1() ");
		MyInterface1.super.method1();
		MyInterface2.super.method1();
	}	
}
        
public class DefaultInterfaceEx1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.method2();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}
}
