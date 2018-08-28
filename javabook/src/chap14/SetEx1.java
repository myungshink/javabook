package chap14;
//[¿¹Á¦ 14-4]
import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr ={"È«±æµ¿",1,"1","±è»ñ°«","ÀÌ¸ù·æ","È«±æµ¿","¼ºÃáÇâ","Çâ´ÜÀÌ","È«±æµ¿","±è»ñ°«"};
		Set<Object> set1 = new HashSet<Object>();
		Set<Object> set2 = new HashSet<Object>();
		Set<Object> set3 = new HashSet<Object>();
		for(int i=0;i < arr.length;i++) {
			if(!set1.add(arr[i])) {
				if(!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}
