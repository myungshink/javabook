package chap11;
//[���� 11-4]
public class ExceptionEx4 {
	public static void main(String[] args) {
		try {
			System.out.println("�۾��� �����մϴ�.");
			System.out.println("�۾��� ���ܰ� �߻��߽��ϴ�."+ 2/0);
			System.out.println("�۾� �Ϸ�.");
			return;
		} catch (Exception e) {
			System.out.println("�۾� �� ������ �߻� �߽��ϴ�.");
			return;
		} finally {
			System.out.println("�۾� �������� �մϴ�.");
		}
	}
}
