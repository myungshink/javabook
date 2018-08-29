package chap15;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		OutputStream out = System.out;
		out.write('a');
		out.write('b');
		out.write('c');
		out.write('1');
		out.write('2');
		out.write('3');
		out.write('°¡');
		out.write('³ª');
		out.write('´Ù');
		out.flush();
		out.close();
	}
}
