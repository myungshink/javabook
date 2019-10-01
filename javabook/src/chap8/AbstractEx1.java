package chap8;
//[¿¹Á¦ 8-9]
abstract class Abs1 {
	int a = 10;
	abstract int getA();
}
abstract class Abs2 extends Abs1{
	int b = 20;
	abstract int getB();
}
class Normal extends Abs2 {
	@Override
	int getB() {	return b;	}
	@Override
	int getA() {	return a;	}
	
}
public class AbstractEx1 {
	public static void main(String[] args) {
		Normal n = new Normal();
		System.out.println(n.a);//10
		System.out.println(n.getA());//10
		System.out.println(n.b);//20
		System.out.println(n.getB());//20
		Abs2 a2 = n;
		System.out.println(a2.getA());//10
		System.out.println(a2.getB());//20
		Abs1 a1 = n;
		System.out.println(a1.a);//10
		System.out.println(a1.getA());//10
	}
}

