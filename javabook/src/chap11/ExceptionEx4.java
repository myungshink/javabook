package chap11;
//[예제 11-4]
public class ExceptionEx4 {
	public static void main(String[] args) {
		try {
			System.out.println("작업을 시작합니다.");
			System.out.println("작업시 예외가 발생했습니다."+ 2/0);
			System.out.println("작업 완료.");
			return;
		} catch (Exception e) {
			System.out.println("작업 중 오류가 발생 했습니다.");
			return;
		} finally {
			System.out.println("작업 마무리를 합니다.");
		}
	}
}
