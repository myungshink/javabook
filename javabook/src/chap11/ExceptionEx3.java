package chap11;
//[���� 11-3]
public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.println("�۾��� �����մϴ�.");
			System.out.println("�۾� ���Դϴ�.");
			return;
		} catch (Exception e) {
			System.out.println("�۾� �� ������ �߻� �߽��ϴ�.");
			return;
		} finally {
			System.out.println("�۾� �������� �մϴ�.");
		}
	}
}
