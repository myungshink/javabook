package chap8;
//[예제 8-1]
class Phone {
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power)
		  System.out.println("전화걸기");
	}
	void receive() {
		if(power)
		System.out.println("전화받기");
	}
}
class SmartPhone extends Phone {
	void setApp(String name) {
		if(power)
		System.out.println(name + "설치 중 ~~");
	}
}

public class PhoneEx1 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("네이버");
	}
}
