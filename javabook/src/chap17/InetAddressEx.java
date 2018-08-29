package chap17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.mesedu.com");
		System.out.println("getByName 메서드 호출");
		System.out.println("hostname:" + ip.getHostName());
		System.out.println("ip address:" + ip.getHostAddress());
		InetAddress[] ips = InetAddress.getAllByName("www.mesedu.com");
		System.out.println("getAllByName 메서드 호출");
		for (InetAddress i : ips) {
			System.out.println("ip 주소:" + i);
		}
		// getAddress() : ip주소값을 byte[]배열로 리턴
		byte[] ipAddr = ip.getAddress();
		// byte 자료형의 표현 범위 : -128 ~ 127
		// 127이상의 값은 음수로 표현됨.
		for (byte b : ipAddr) {
			System.out.print(((b < 0) ? b + 256 : b) + ".");
		}
		System.out.println();
		System.out.println("getLocalHost 메서드 호출");
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내컴퓨터IP:" + local);
		System.out.println("getByAddress 메서드 호출");
		InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
		System.out.println(ips[0].getHostAddress() + "주소 :" + ip2);
		int[] intaddr = { 52, 204, 129, 22 };
		byte[] byteaddr = new byte[4];
		for (int i = 0; i < intaddr.length; i++) {
			byteaddr[i] = (byte) ((intaddr[i] > 127) ? intaddr[i] - 256 : intaddr[i]);
		}
		InetAddress ip3 = InetAddress.getByAddress(byteaddr);
		System.out.println(ip3);
	}
}
