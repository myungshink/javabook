package chap8;
//[예제 8-5]
class Bike2 {
	int wheel;
	Bike2(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("움직인다"); 
	}
	void stop() {
		System.out.println("멈춘다"); 
	}
}
class AutoBike2 extends Bike2 {
	boolean power;
	
	AutoBike2(int wheel) {
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
}
public class BikeEx2 {
	public static void main(String[] args) {
		AutoBike2 auto1 = new AutoBike2(2);
		AutoBike2 auto2;
		Bike2 bike; 
		auto1.power();
		auto1.drive();
		System.out.println("바퀴" + ab.wheel + "개가 굴러간다.");
		auto1.stop();
		bike = auto1;
		bike.power(); //오류발생
		bike.drive();
		auto2 = (AutoBike2)bike;
		auto2.power();
		auto2.drive();
		auto2.stop();
	}
}
