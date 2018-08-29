package chap15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String msg = br.readLine();
			System.out.println(msg);
			if (msg.equals("exit"))
				break;
		}
		System.out.println("");
	}
}
