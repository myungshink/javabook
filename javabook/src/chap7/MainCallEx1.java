package chap7;
//[예제 7-10]
public class MainCallEx1 {
	static int cv1 = 10;
	static int cv2 = cv1;
	int iv1 = 100;
	int iv2 = iv1;
	public static void main(String[] args) {
		cv2 = iv1; //error
		method1(); //error
		method2(); //정상
	}
	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);
	}
	static void method2() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);  //error
	}
}
