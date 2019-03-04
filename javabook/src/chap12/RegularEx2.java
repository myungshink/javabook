package chap12;
//[예제 12-32]
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {
	public static void main(String[] args) {
		String source = "핸드폰:010-1111-1111,집:02-123-5678,"
			       	  + "이메일:regular@aaa.bbb,계좌번호:301-12-123456";
		String telpattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		String emailpattern = "(\\w+)@(\\w+).(\\w+)";
		String accountpattern = "(\\d{3})-(\\d{2})-(\\d{6})";
		Pattern p = Pattern.compile(telpattern);
		Matcher m = p.matcher(source);
		int i=0;
		System.out.println("전화번호 : ");
		while(m.find()) { //지정된 패턴 맞는 문자열을 검색
			System.out.println(++i + ":" + m.group() + "->" 
		                 + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		i=0;
		p = Pattern.compile(emailpattern);
		m = p.matcher(source);
		System.out.println("이메일 : ");
		while(m.find()) { //지정된 패턴 맞는 문자열을 검색
			System.out.println(++i + ":" + m.group() + "->" 
	                 + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		i=0;
		p = Pattern.compile(accountpattern);
		m = p.matcher(source);
		System.out.println("계좌번호 : ");
		while(m.find()) { //지정된 패턴 맞는 문자열을 검색
			System.out.println(++i + ":" + m.group() + "->" 
	                 + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		
	}
}
