package chap11;
//[���� 11-7]
public class ExceptionEx7 {
	public static void main(String[] args) {
		try {
		   first();
		} catch (Exception e) {
			System.out.println("main ���� ���� ó��");
			System.out.println ("�޽���:" + e.getMessage());
			}
		}
	private static void first() throws Exception {
		try {
		   second();
		} catch (Exception e) {
		   System.out.println("first ���� ���� ó��");
		   throw e;
		}
	}
	private static void second() throws Exception {
		try {
			throw new Exception("���� �߻�");
		} catch (Exception e) {
			System.out.println("second ���� ���� ó��");
			throw e; //��߻�
		}
	}

}
