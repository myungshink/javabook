package chap7;
//[���� 7-17]
public class InitEx {
	static int cv;
	int iv;
	InitEx() {
		System.out.println("������ ȣ��");
	}
	static {  //static �ʱ�ȭ��
 	    cv = (int)(Math.random() * 100);
		System.out.println("Ŭ���� �ʱ�ȭ �� cv=" + cv);
	}
	{ //�ν��Ͻ� �ʱ�ȭ ��
		System.out.println ("�ν��Ͻ� �ʱ�ȭ ��. �����ں��� ���� ȣ���");
	}
	public static void main(String[] args) {
		System.out.println("main �޼��� ����");
		System.out.println("main init1 ��ü ����");
		InitEx init1 = new InitEx();
		System.out.println("main init2 ��ü ����");
		InitEx init2 = new InitEx();
	}
}

