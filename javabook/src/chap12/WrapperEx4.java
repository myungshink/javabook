package chap12;
//[���� 12-20]
public class WrapperEx4 {
	public static void main(String[] args) {
		char[] data = {'A','a','4','&'};
		for(char c : data) {
			if(Character.isUpperCase(c))
				System.out.println(c + " �빮��");
			else if(Character.isLowerCase(c))
				System.out.println(c + " �ҹ���");
			else if(Character.isDigit(c))
				System.out.println(c + " ����");
			else
				System.out.println(c + " �Ϲ� ����");
		}
		Character ch = 'A'; //��üȭ. boxing
		System.out.println(ch.equals('A'));

	}

}
