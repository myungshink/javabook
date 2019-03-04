package chap12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//[예제 12-31]
public class RegularEx1 {
	public static void main(String[] args) {
		String[] patterns = {"."     ,"[a-z]?","[0-9]+","0[1-9]*","^[0-9]",
				             "[^0-9]","[a-z]*","[a-z]+","02|010" ,"\\s",
				             "\\S"   ,"\\d"   ,"\\w","\\W"};
		String[] datas = {"","a","1","12","012","abc","02"," ","A","5","a","*"};
		for(String d : datas) {
			if(d.equals(""))  {
				System.out.print("빈문자\"\" 의 패턴 =>");
			} else if (d.equals(" ")) {
				System.out.print("공백문자\" \" 의 패턴 =>");
			} else {
				System.out.print(d + "문자의 패턴 =>");
			}
			for(String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(d);
				if(m.matches()) {
					System.out.print(p+", ");
				}
			}
			System.out.println();
		}
	}
}
