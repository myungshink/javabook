package chap14;
//[���� 14-2]
import java.util.Vector;

public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<Double>();
		list.add(0.3); // List �޼���
		list.add(Math.PI); // List �޼���
		list.addElement(5.0); // ���� �޼���
		for (Double o : list) {
			System.out.println(o);
		}
		double num = 5.0;
		int index = list.indexOf(num);
		if (index >= 0)
			System.out.println(num + "�� ��ġ :" + index);
		else
			System.out.println(num + "�� list�� �����ϴ�.");
		num = 0.3;
		if (list.contains(num)) {
			list.removeElement(num);
			System.out.println(num + "������");
		}
		System.out.println(list.indexOf(num));
		System.out.println(list);
	}
}
