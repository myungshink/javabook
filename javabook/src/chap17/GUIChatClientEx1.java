package chap17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class GUIChatClientEx1 extends Frame implements ActionListener {
	static int port = 6000;
	Socket client = null;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	String userId;
	Button btnExit, btnSend, btnConnect;
	TextArea taList;
	TextField tfIp, tfName, tfInput;
	CardLayout c1;

	GUIChatClientEx1() {
		super("ä�����α׷�");
		c1 = new CardLayout();
		setLayout(c1);
		Panel connect = new Panel();
		connect.setLayout(new BorderLayout());
		connect.add("North", new Label("ä������ȭ��", Label.CENTER));
		Panel conn_sub = new Panel();
		conn_sub.setLayout(new GridLayout(10, 1));
		conn_sub.add(new Label("���� IP", Label.CENTER));
		tfIp = new TextField("127.0.0.1", 15);
		conn_sub.add(tfIp);
		conn_sub.add(new Label("����� ID", Label.CENTER));
		tfName = new TextField("ȫ�浿", 15);
		conn_sub.add(tfName);
		connect.add("Center", conn_sub);
		btnConnect = new Button("��������");
		connect.add("South", btnConnect);
		btnConnect.addActionListener(this);

		Panel chat = new Panel();
		chat.setLayout(new BorderLayout());
		chat.add("North", new Label("ä�� ver1.0"));
		taList = new TextArea();
		chat.add("Center", taList);
		Panel chat_sub = new Panel();
		tfInput = new TextField("", 25);
		btnExit = new Button("����");
		btnSend = new Button("����");
		chat_sub.add(tfInput);
		chat_sub.add(btnExit);
		chat_sub.add(btnSend);
		tfInput.addActionListener(this);
		btnExit.addActionListener(this);
		btnSend.addActionListener(this);
		chat.add("South", chat_sub);
		add(connect, "����â");
		add(chat, "ä��â");
		c1.show(this, "����â");// �ʱ�ȭ��
		setSize(300, 300);
		setVisible(true);// ȭ�鿡 ǥ�õ�
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new GUIChatClientEx1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Object obj = e.getSource();
			if (obj == btnConnect)
				init();
			else if (obj == btnExit)
				System.exit(0);
			else if (obj == btnSend || obj == tfInput) {
				String sendData = tfInput.getText();
				oos.writeObject(sendData);
				oos.flush();
				tfInput.setText("");
				tfInput.requestFocus();
			}
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

	private void init() {
		try {
			String ipAddr = tfIp.getText();
			client = new Socket(ipAddr, port);
			oos = new ObjectOutputStream(client.getOutputStream());
			ois = new ObjectInputStream(client.getInputStream());
			userId = tfName.getText();
			oos.writeObject(userId);
			oos.flush();
			ReceiveDataThread rt = new ReceiveDataThread();
			rt.setDaemon(true);
			rt.start();
			c1.show(this, "ä��â");
			setTitle(userId + " ä��â ");
			tfInput.requestFocus();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class ReceiveDataThread extends Thread {
		String rcvData;

		public void run() {
			try {
				while (true) {
					rcvData = (String) ois.readObject();
					taList.append(rcvData + "\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
