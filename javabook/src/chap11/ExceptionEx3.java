package chap11;
//[예제 11-3]
public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.println("작업을 시작합니다.");
			System.out.println("작업 중입니다.");
			return;
		} catch (Exception e) {
			System.out.println("작업 중 오류가 발생 했습니다.");
			return;
		} finally {
			System.out.println("작업 마무리를 합니다.");
		}
	}
}
