package chap14;
//[¿¹Á¦ 14-1]
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(5);
		list.add(4);list.add(3);list.add(0);
		list.add(0);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(i+":"+ list.get(i));
		}
		List<Integer> list2 =new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
	}
}
