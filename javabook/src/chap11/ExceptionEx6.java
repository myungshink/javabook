package chap11;
//[���� 11-6]
public class ExceptionEx6 {
	public static void main(String[] args) {
		try {
			throw new Exception("���� ���� �߻�");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� ���� ����");
	}
}
