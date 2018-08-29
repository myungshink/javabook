package chap17;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Hashtable;

public class ChatServerEx1 {
	static ServerSocket server;
	static int port = 6000;
	static Hashtable<String, ObjectOutputStream> hm;

	public static void main(String[] args) throws IOException {
		server = new ServerSocket(port);
		System.out.println("채팅 서버 시작");
		hm = new Hashtable<String, ObjectOutputStream>();
		while (true) {
			System.out.println("클라이언트 접속 대기 중");
			Socket client = server.accept();
			ChatServerThread ct = new ChatServerThread(client);
			ct.start();
		}
	}

	static class ChatServerThread extends Thread {
		Socket client;
		ObjectInputStream ois;
		ObjectOutputStream oos;
		String userId;

		ChatServerThread(Socket client) {
			this.client = client;
			try {
				System.out.println(client.getInetAddress() + "접속");
				ois = new ObjectInputStream(client.getInputStream());
				oos = new ObjectOutputStream(client.getOutputStream());
				userId = (String) ois.readObject();
				System.out.println("User_ID:" + userId + "접속함");
				hm.put(userId, oos);
				broadcast(userId + "님이 입장하셨습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		private void broadcast(String msg) {
			try {
				for (ObjectOutputStream o : hm.values()) {
					o.writeObject(msg);
					o.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void run() {
			String rcvData;
			try {
				while (true) {
					rcvData = (String) ois.readObject();
					if (rcvData.equals("/bye"))
						break;
					else if (rcvData.startsWith("/to"))
						sendMsg(rcvData);
					else
						broadcast(userId + ":" + rcvData);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				broadcast(userId + "님이 퇴장하셨습니다.");
				hm.remove(userId);
				try {
					if (client != null)
						client.close();
				} catch (IOException e) {
				}
			}
		}

		private void sendMsg(String rcvData) {
			int begin = rcvData.indexOf(" ") + 1;
			int end = rcvData.indexOf(" ", begin);
			if (end != -1) {
				String id = rcvData.substring(begin, end);
				String msg = rcvData.substring(end + 1);
				ObjectOutputStream oos = hm.get(id);
				ObjectOutputStream oos2 = hm.get(userId);
				if (oos != null) {
					try {
						oos.writeObject(userId + "님의 귀속말:" + msg);
						oos.flush();
						oos2.writeObject(id + "님에게 귀속말전송:" + msg);
						oos2.flush();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
