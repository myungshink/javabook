package chap11;
//[���� 11-5]
public class ExceptionEx5 {
	public static void main(String[] args) throws Exception {
	     first();
	}
	private static void first() throws Exception {
		System.out.println("first �޼��� ȣ��");		
		second();
	}
	private static void second() throws Exception{
		System.out.println("second �޼��� ȣ��");
		System.out.println(10/0);
	}
}
