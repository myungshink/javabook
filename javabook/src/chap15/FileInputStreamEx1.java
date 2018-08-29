package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInputStreamEx1 {
public static void main(String[] args)  throws IOException {
	FileInputStream fis = new FileInputStream
			    ("src/chap15/InputStreamEx1.java");
	int data = 0;
	while((data=fis.read()) != -1){
		System.out.print((char)data);
	}
}
}
