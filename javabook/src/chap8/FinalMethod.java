package chap8;

//[���� 8-14]
public class FinalMethod {
	final void finalmethod() { // ������ �Ұ� �޼���
	}
}

class SubMethod extends FinalMethod {
	void finalmethod() { // error
		System.out.println("�������̵� �Ұ� �޼���");
	}
}
