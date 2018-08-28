package chap7;
//[¿¹Á¦ 7-11]
public class MainCallEx2 {
	static int cv1 = 10;
	static int cv2 = cv1;
	int iv1 = 100;
	int iv2 = iv1;
	public static void main(String[] args) {
		MainCallEx2 m = new MainCallEx2();
		cv2 = m.iv1; //¼öÁ¤µÊ
		m.method1(); //¼öÁ¤µÊ
		method2(); 
	}
	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);
	}
	static void method2() {
		MainCallEx2 m = new MainCallEx2();
		System.out.println(cv1 + cv2);
		System.out.println(m.iv1 + m.iv2);  //¼öÁ¤µÊ
	}
}
