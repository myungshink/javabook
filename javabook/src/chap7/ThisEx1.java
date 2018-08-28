package chap7;
//[¿¹Á¦ 7-16]
class Car2 {
	String color;
	int number;

	Car2(String color, int number) {
		this.color = color;
		this.number = number;
	}
	Car2() {
		this("white",1234);
	}
	Car2(String color) {
		this(color,1234);
	}
	Car2(int number) {
		this("white",number);
	}
	Car2(Car2 c) {
		this(c.color,c.number);
	}
	
	public String toString() {
		return color + "," + number;
	}
}

public class ThisEx1 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue",1234);
		Car2 c3 = new Car2("red");
		Car2 c4 = new Car2(5678);
		Car2 c5 = new Car2(c1);
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
	}
}