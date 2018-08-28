package chap7;
//[예제 7-13]
class Math4 {
	int add(int a, int b) {
		System.out.print("int int 메서드 결과:");
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.print("long int 메서드 결과:");
		return a + b;
	}
	long add(int a, long b) {
		System.out.print("int long 메서드 결과:");
		return a + b;
	}
	
	
	
	long add(long a, long b) {
		System.out.print("long long 메서드 결과:");
		return a + b;
	}
}
public class OverloadingEx2 {
	public static void main(String[] args) {
		Math4 m4 = new Math4();
		System.out.println(m4.add(10,10));
		System.out.println(m4.add(10,10L));
		System.out.println(m4.add(10L,10));
		System.out.println(m4.add(10L,10L));
	}
}
