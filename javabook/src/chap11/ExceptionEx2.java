package chap11;
//[���� 11-2]
public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(Integer.parseInt(args[0]));
			System.out.println(2/Integer.parseInt(args[0]));
			String str = null;
			System.out.println(str.trim());
		} catch(ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("��ɽ���� �Ķ���͸� �Է��ϼ���.");
		} catch(NumberFormatException e) {
			System.out.println("���ڸ� �����մϴ�.");
		} catch(Exception e) {
			System.out.println("����η� ���� �ϼ��� (��ȭ:1234)");
		}
	}
}
