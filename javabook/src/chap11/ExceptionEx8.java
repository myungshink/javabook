package chap11;
//[예제 11-8]
import java.util.Scanner;

class LoginFailException extends Exception {
	LoginFailException(String msg) {
		super(msg);
	}
}
public class ExceptionEx8 {
	public static void main(String[] args) {
		try {
			String id = "hong";
			String pw = "1234";
			Scanner scan = new Scanner(System.in);
			System.out.println("아이디를 입력하세요");
			String inputId = scan.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String inputPw = scan.nextLine();
			if(id.equals(inputId) && pw.equals(inputPw)) {
				System.out.println("로그인 성공");
			} else if (!id.equals(inputId)) {
				throw new LoginFailException("아이디가 틀립니다. 다시 로그인 하세요");
			} else {
				throw new LoginFailException("비밀번호가 틀립니다. 다시 로그인 하세요");
			}
		} catch (LoginFailException e) {
			e.printStackTrace();
		}
	}
}
