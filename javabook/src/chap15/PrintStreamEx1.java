package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx1 {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("print.txt", true);
		PrintStream ps = new PrintStream(fos);
		ps.println("ȫ�浿");
		ps.println(1234);
		ps.println(true);
		ps.println('a');
		ps.flush();
		ps.close();
	}
}
