package chap15;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {

	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		int data = 0;
		while ((data = in.read()) != -1) {
			System.out.print((char) data);
		}
	}

}
