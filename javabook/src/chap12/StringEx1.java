package chap12;
//[예제 12-9]
public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		if(s1 == s2) System.out.println("s1 == s2: 같은 객체");
		else	   System.out.println("s1 != s2: 다른 객체");
		if(s1.equals(s2))
		    System.out.println("s1.equals(s2): 같은 내용");
		else
		    System.out.println("!s1.equals(s2):다른 내용");
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		if(s3 == s4)  System.out.println("s3 == s4: 같은 객체");
		else  	    System.out.println("s3 != s4: 다른 객체");
		if(s3.equals(s4))
		     System.out.println("s3.equals(s4): 같은 내용");
		else
		     System.out.println("!s3.equals(s4):다른 내용");
	}
}
