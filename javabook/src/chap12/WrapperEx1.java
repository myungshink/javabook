package chap12;
//[예제 12-17]
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("i1==i2 : "+ (i1==i2));
		System.out.println("i1.equals(i2) : "+ (i1.equals(i2)));
		//i1객체가 100 정수로 변환 : unboxing됨
		System.out.println("i1==100 : "+(i1==100));
		int i3 = 100;
		System.out.println("i1==i3 : "+(i1==i3));
	}
}
