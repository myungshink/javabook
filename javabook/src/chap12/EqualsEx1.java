package chap12;

//[���� 12-1]
class Equal {
	int value;
	Equal(int value) {
		this.value = value;
	}
}
public class EqualsEx1 {
	public static void main(String[] args) {
		Equal e1= new Equal(10);
		Equal e2= new Equal(10);
		if(e1 == e2)
			System.out.println("e1 ��ü�� e2��ü�� ���� ��ü��");
		else
			System.out.println("e1 ��ü�� e2��ü�� �ٸ� ��ü��");
		if(e1.equals(e2))
			System.out.println("e1 ��ü�� ����� e2��ü�� ������ ����");
		else
			System.out.println("e1 ��ü�� ����� e2��ü�� ������ �ٸ���");
		
	}
}
