package chap8;
//[���� 8-4]
class Bike {
	int wheel;
	Bike(int wheel) {
		this.wheel = wheel;
	}
	String drive() {
		return "�д��� ��´�.";
	}
	String stop() {
		return "�극��ũ�� ��´�";
	}
}
class AutoBike extends Bike {
	AutoBike(int wheel) {
		super(wheel);
	}
	@Override
	String drive() {
		return "��� ��ư�� ������";
	}
	@Override
	String stop() {
		return "���� ��ư�� ������";
	}
}
public class BikeEx1 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println("����" + ab.wheel + "���� ��������.");
		System.out.println(ab.stop());
		System.out.println("õõ�� �����.");
	}
}
