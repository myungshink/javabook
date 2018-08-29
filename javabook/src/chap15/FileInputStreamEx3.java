package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx3 {
public static void main(String[] args)  throws IOException {
	FileInputStream fis = new FileInputStream("src/chap15/InputStreamEx1.java");
	int data = 0;
	byte[] buf = new byte[fis.available()];
		while((data=fis.read(buf,0,buf.length))!=-1){
			System.out.print(new String(buf,0,data));
		}
	}
}
