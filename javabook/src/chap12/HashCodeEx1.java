package chap12;
//[���� 12-4]
public class HashCodeEx1 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1 == s2)System.out.println("s1 ��ü�� s2 ��ü�� ���� ��ü��");
		else  	 System.out.println("s1 ��ü�� s2 ��ü�� �ٸ� ��ü��");
		System.out.println ("s1 ��ü ��¥ �ؽ��� :"+System.identityHashCode(s1));
		System.out.println ("s2 ��ü ��¥ �ؽ��� :"+System.identityHashCode(s2));
	}
}
