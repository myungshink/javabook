package chap12;
//[예제 12-3]
public class EqualsEx3 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		if(s1 == s2)
			System.out.println("s1문자열 객체와 s2 문자열 객체는 같은 객체임");
		else
			System.out.println("s1문자열 객체와 s2 문자열 객체는 다른 객체임");
		if(s1.equals(s2)) {
			System.out.println("s1문자열과 s2 문자열은 같은 문자열임");
		} else
			System.out.println("s1문자열과 s2 문자열은 다른 문자열임");
	}
}
