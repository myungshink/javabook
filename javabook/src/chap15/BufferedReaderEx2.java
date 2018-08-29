package chap15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/InputStreamTest1.java"));
		String msg = null;
		while ((msg = br.readLine()) != null) {
			System.out.println(msg);
		}
	}
}
