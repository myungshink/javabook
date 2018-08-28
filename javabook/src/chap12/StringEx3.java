package chap12;
//[예제 12-11]
public class StringEx3 {
	public static void main(String[] args) {
		String s = "HTML-CSS-JavaScript-Java-Jsp-스프링";
		String[] subject = s.split("-");
		for(int i=0; i<subject.length;i++)
			System.out.println((i+1)+ ":" + subject[i]);
	}
}
