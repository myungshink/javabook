package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertiesEx1 {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		FileInputStream fis =new FileInputStream("a.properties");
		pr.load(fis);
		System.out.println(pr);
		System.out.println("이름:" + pr.get("name"));
		pr.put("subject", "컴퓨터공학");
		System.out.println(pr);
		pr.store(new FileOutputStream("b.properties"), "#save");
	}
}
