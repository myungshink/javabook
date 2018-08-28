package chap11;
//[예제 11-2]
public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(Integer.parseInt(args[0]));
			System.out.println(2/Integer.parseInt(args[0]));
			String str = null;
			System.out.println(str.trim());
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령실행시 파라미터를 입력하세요.");
		} catch(NumberFormatException e) {
			System.out.println("숫자만 가능합니다.");
		} catch(Exception e) {
			System.out.println("전산부로 연락 하세요 (전화:1234)");
		}
	}
}
