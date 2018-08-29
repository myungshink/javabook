package chap17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws MalformedURLException {
		URL url1 = null, url2 = null;
		url1 = new URL("http://www.goodee.co.kr");
		url2 = new URL("file", "", -1, "aaa.txt");
		System.out.println("protocol : " + url1.getProtocol() + "," + url2.getProtocol());
		System.out.println("host : " + url1.getHost() + "," + url2.getHost());
		System.out.println("port : " + url1.getPort() + "," + url2.getPort());
		System.out.println("file : " + url1.getFile() + "," + url2.getFile());
		// URL 을 통해서 정보 받기
		int data = 0;
		try {
			Reader is = new InputStreamReader(url1.openStream());
			while ((data = is.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
