package chap8;
//[¿¹Á¦ 8-15]
class FinalValue {
	final int NUM;
	FinalValue() {
		this(100);
	}
	FinalValue(int num) {
		this.NUM = num;
	}
	public int getNUM() {
		return NUM;
	}
}
public class FinalValueEx1 {
	public static void main(String[] args) {
		FinalValue f1 = new FinalValue();
		System.out.println(f1.getNUM());
		// f1.NUM = 200; //error
		
		FinalValue f2 = new FinalValue(120);
		System.out.println(f2.getNUM());
		// f2.NUM = 100; //error
	}
}
