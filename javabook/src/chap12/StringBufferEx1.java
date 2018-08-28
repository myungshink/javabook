package chap12;
//[예제 12-13]
public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		if(sb1 == sb2)
			System.out.println("sb1 == sb2");
		else
			System.out.println("sb1 != sb2");
		if(sb1.equals(sb2))
			System.out.println ("sb1.equals(sb2):같은 내용");
		else
			System.out.println("!sb1.equals(sb2):다른 내용");
		
		if(sb1.toString().equals(sb2.toString())) {
			System.out.println ("sb1.toString().equals(sb2.toString():같은 내용");
		}
	}
}
