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
		System.out.println("ä�� ���� ����");
		hm = new Hashtable<String, ObjectOutputStream>();
		while (true) {
			System.out.println("Ŭ���̾�Ʈ ���� ��� ��");
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
				System.out.println(client.getInetAddress() + "����");
				ois = new ObjectInputStream(client.getInputStream());
				oos = new ObjectOutputStream(client.getOutputStream());
				userId = (String) ois.readObject();
				System.out.println("User_ID:" + userId + "������");
				hm.put(userId, oos);
				broadcast(userId + "���� �����ϼ̽��ϴ�.");
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
				broadcast(userId + "���� �����ϼ̽��ϴ�.");
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
						oos.writeObject(userId + "���� �ͼӸ�:" + msg);
						oos.flush();
						oos2.writeObject(id + "�Կ��� �ͼӸ�����:" + msg);
						oos2.flush();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
