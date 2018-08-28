package chap4;

public class OpEx8 {
	public static void main(String[] args) {
		int num = 100; //100을 num 변수에 대입.
		System.out.println(num); //100
		num += 10;  //num = num + 10; 의미
		System.out.println(num); //110
		num /= 10;  //num = num / 10
		System.out.println(num); //11
		num *= 2 + 3; //num = num * (2+3)
		System.out.println(num); //55
		
		byte b = 1;
		b *= 2; //b = b * 2
		System.out.println(b); //2
		b *= 2; //b = b * 2
		System.out.println(b); //4
		b *= 2; //b = b * 2
		System.out.println(b); //8
		b = (byte) (b * 2);
		System.out.println(b); //16
	}
}
