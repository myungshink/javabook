package chap17;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPEchoServerEx1 {
	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(9500);
		DatagramPacket inPacket, outPacket;
		byte[] inMsg = new byte[1024];
		byte[] outMsg = null;
		while (true) {
			inMsg = new byte[1024];
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			socket.receive(inPacket);
			System.out.println("Ŭ���̾�Ʈ �޽���:" + new String(inPacket.getData()));
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			System.out.println("Ŭ���̾�Ʈ �ּ�:" + address);
			System.out.println("Ŭ���̾�Ʈ��Ʈ��ȣ:" + port);
			outMsg = inPacket.getData();
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
			socket.send(outPacket);
		}
	}
}
