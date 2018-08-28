package chap14;
//[예제 14-2]
import java.util.Vector;

public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<Double>();
		list.add(0.3); // List 메서드
		list.add(Math.PI); // List 메서드
		list.addElement(5.0); // 이전 메서드
		for (Double o : list) {
			System.out.println(o);
		}
		double num = 5.0;
		int index = list.indexOf(num);
		if (index >= 0)
			System.out.println(num + "의 위치 :" + index);
		else
			System.out.println(num + "는 list에 없습니다.");
		num = 0.3;
		if (list.contains(num)) {
			list.removeElement(num);
			System.out.println(num + "삭제됨");
		}
		System.out.println(list.indexOf(num));
		System.out.println(list);
	}
}
