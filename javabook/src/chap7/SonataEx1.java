package chap7;
//[예제 7-5]
class Sonata {
	String color;  //인스턴스변수
	int number;   //인스턴스변수
	static int width = 250; //클래스변수
	static int height = 150;//클래스변수
	public String toString() {
		return color + ":" + number + "(" + width + "," + height + ")";
	}
}
public class SonataEx1 {
	public static void main(String[] args) {
		System.out.println ("자동차 크기:" + Sonata.width + "," + Sonata.height);
		Sonata car1 = new Sonata(); //car1변수는 지역변수
		car1.color = "white";
		car1.number = 1234;
		System.out.println("car1:" + car1);
		Sonata car2 = new Sonata();//car2변수는 지역변수
		car2.color = "black";
		car2.number = 2345;
		System.out.println("car2:" + car2);
		car1.width = 300;
		car1.height = 200;
		System.out.println("car1:" + car1);
		System.out.println("car2:" + car2);
	}
}
