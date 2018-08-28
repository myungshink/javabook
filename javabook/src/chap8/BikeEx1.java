package chap8;
//[예제 8-4]
class Bike {
	int wheel;
	Bike(int wheel) {
		this.wheel = wheel;
	}
	String drive() {
		return "패달을 밟는다.";
	}
	String stop() {
		return "브레이크를 잡는다";
	}
}
class AutoBike extends Bike {
	AutoBike(int wheel) {
		super(wheel);
	}
	@Override
	String drive() {
		return "출발 버튼을 누른다";
	}
	@Override
	String stop() {
		return "정지 버튼을 누른다";
	}
}
public class BikeEx1 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println("바퀴" + ab.wheel + "개가 굴러간다.");
		System.out.println(ab.stop());
		System.out.println("천천히 멈춘다.");
	}
}
