package chap7;

class Phone {
	String color;
	boolean power;
	String no;
	void power() { power = !power; }
	void send(String no){ 
		System.out.println(no + "로 전화 송신 중~~");
	}
	void receive(String no){ 
		System.out.println(no + " 전화 수신 중~~");
	}
}
public class PhoneEx1 {
	public static void main(String[] args) {
		Phone p1 = new Phone(); //객체화, 인스턴스화
		p1.color = "검정";
		p1.power =  true;
		p1.no = "01012341234";
		System.out.println(p1.color + "," +p1.power + "," + p1.no);
		p1.send("01043214321");
		p1.receive("01043214321");
		Phone p2 = new Phone();
		System.out.println(p1.color + "," +p1.power + "," + p1.no);
		System.out.println(p2.color + "," +p2.power + "," + p2.no);
		p2 = p1;
		p1.power();
		System.out.println(p1.color + "," +p1.power + "," + p1.no);
		System.out.println(p2.color + "," +p2.power + "," + p2.no);
	}
}
