package chap12;
//[예제 12-4]
public class HashCodeEx1 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1 == s2)System.out.println("s1 객체와 s2 객체는 같은 객체임");
		else  	 System.out.println("s1 객체와 s2 객체는 다른 객체임");
		System.out.println ("s1 객체 진짜 해쉬값 :"+System.identityHashCode(s1));
		System.out.println ("s2 객체 진짜 해쉬값 :"+System.identityHashCode(s2));
	}
}
