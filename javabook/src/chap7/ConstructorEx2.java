package chap7;
//[¿¹Á¦ 7-15]
class Car {
	String color;
	int number;
	Car(String c, int n) {
		color = c;
		number = n;
	}
	Car(String c) {
		color = c;
		number = 1;
	}
	Car(int n) {
		color = "white";
		number = n;
	}
	Car(Car c) {
		color = c.color;
		number = c.number;
	}
	
	public String toString() {
		return color + "," + number;
	}
}

public class ConstructorEx2 {
	public static void main(String[] args) {
		Car c1 = new Car("blue",1234);
		Car c2 = new Car("red");
		Car c3 = new Car(5678);
		Car c4 = new Car(c1);
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
	}
}
