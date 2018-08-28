package chap12;
//[예제 12-10]
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH"); 
		System.out.println(s.charAt(4));  //E
		System.out.println(s.compareTo("abc")); //-32
		System.out.println (s.compareToIgnoreCase("abcdefgh")); //0 
		System.out.println(s.concat("abc")); //ABCDEFGHabc
		System.out.println(s.endsWith("GH")); //true
		System.out.println(s.startsWith("AB")); //true
		System.out.println (s.equalsIgnoreCase("abcdefgh")); ////true
		s = new String("This is a String"); 
		System.out.println(s.indexOf('i')); //2
		System.out.println(s.indexOf('i',5)); //5
		System.out.println(s.indexOf('i',15)); //-1
		System.out.println(s.indexOf("is")); //2
		System.out.println(s.lastIndexOf("is")); //5
		System.out.println(s.length()); //17
		System.out.println(s.replace("is","QR"));
		System.out.println (s.substring(5));//is a String 
		System.out.println(s.substring(5,13));//is a Str 
		System.out.println(s.toLowerCase());//소문자로 변경
		System.out.println(s.toUpperCase());//대문자로 변경
		System.out.println("   문자열  trim 메서드   ".trim()); //문자열  trim 메서드

	}
}
