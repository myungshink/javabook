package chap17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UDPEchoClientEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
		InetAddress serverIP = InetAddress.getByName("127.0.0.1");
		while (true) {
			String data = sysin.readLine();
			DatagramSocket dataSocket = new DatagramSocket();
			byte[] msg1 = data.getBytes();
			byte[] msg2 = new byte[msg1.length];
			DatagramPacket outPacket = new DatagramPacket(msg1, msg1.length, serverIP, 9500);
			DatagramPacket inPacket = new DatagramPacket(msg2, msg2.length);
			dataSocket.send(outPacket);
			dataSocket.receive(inPacket);
			System.out.println("Echo ¸Þ½ÃÁö:" + new String(inPacket.getData()));
			dataSocket.close();
		}
	}
}
