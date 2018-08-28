package chap12;

//[���� 12-2]
class Equal2 {
	int value;
	Equal2(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equal2) {
			Equal2 v = (Equal2)obj;
			return value == v.value;
		} else 
			return false;
	}
	
}
public class EqualsEx2 {
	public static void main(String[] args) {
		Equal2 e1= new Equal2(10);
		Equal2 e2= new Equal2(10);
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
