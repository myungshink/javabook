package chap8;
//[���� 8-12]
class SingleObject {
	private static SingleObject obj = new SingleObject();
	private SingleObject() {}
	private int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
public class SingletonEx {
	public static void main(String[] args) {
//		SingleObject obj = new SingleObject(); //error
		SingleObject sobj1 = SingleObject.getObject();
		SingleObject sobj2 = SingleObject.getObject();
		System.out.println(sobj1.getValue());
		System.out.println(sobj2.getValue());
		sobj1.setValue(500);
		System.out.println(sobj1.getValue());
		System.out.println(sobj2.getValue());
		if(sobj1 == sobj2) {
			System.out.println("sobj1���������� �����ϴ� ��ü�� sobj2 ���������� �����ϴ� ��ü�� ���� ��ü��.");
		}
	}
}
