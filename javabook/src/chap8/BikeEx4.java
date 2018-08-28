package chap8;
//[예제 8-7]
class Bike4 {
	int wheel;
	int price = 10;
	Bike4(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println(price + "만원짜리 자전거의 패달을 밟는다.");
	}
	void stop() {
		System.out.println(price + "만원짜리 자전거의 브레이크를 잡는다");
	}
}
class AutoBike4 extends Bike4 {
	boolean power;
	int price = 200;
	AutoBike4(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
		if(power) {
			System.out.println("전원이 켜졌습니다.");
		} else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	@Override
	void drive() {
		if(!power) {
			power();
		}
	    System.out.println(price + "만원짜리 자전거의 출발 버튼을 누른다"); 
	}
	@Override
	void stop() {
		if(power) { 
		  System.out.println(price + "만원짜리 자전거의 정지 버튼을 누른다");
		} else {
		  System.out.println("전원이 꺼졌습니다. 멈출수 없습니다.");	
		}
	}
}
public class BikeEx4 {
	public static void main(String[] args) {
		AutoBike4 auto = new AutoBike4(2);
		System.out.println("가격은 " + auto.price + "만원 입니다.");
		auto.power();
		auto.drive();
		auto.stop();
		Bike4 bike = auto;
		System.out.println("가격은 " + bike.price + "만원 입니다.");
		bike.drive();
		bike.stop();
	}
}
