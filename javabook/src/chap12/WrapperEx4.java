package chap12;
//[예제 12-20]
public class WrapperEx4 {
	public static void main(String[] args) {
		char[] data = {'A','a','4','&'};
		for(char c : data) {
			if(Character.isUpperCase(c))
				System.out.println(c + " 대문자");
			else if(Character.isLowerCase(c))
				System.out.println(c + " 소문자");
			else if(Character.isDigit(c))
				System.out.println(c + " 숫자");
			else
				System.out.println(c + " 일반 문자");
		}
		Character ch = 'A'; //객체화. boxing
		System.out.println(ch.equals('A'));

	}

}
