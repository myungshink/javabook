package chap11;
//[예제 11-7]
public class ExceptionEx7 {
	public static void main(String[] args) {
		try {
		   first();
		} catch (Exception e) {
			System.out.println("main 에서 예외 처리");
			System.out.println ("메시지:" + e.getMessage());
			}
		}
	private static void first() throws Exception {
		try {
		   second();
		} catch (Exception e) {
		   System.out.println("first 에서 예외 처리");
		   throw e;
		}
	}
	private static void second() throws Exception {
		try {
			throw new Exception("예외 발생");
		} catch (Exception e) {
			System.out.println("second 에서 예외 처리");
			throw e; //재발생
		}
	}

}
