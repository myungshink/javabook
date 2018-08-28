package chap14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx3 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] names =	{"È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","ÀÓ²©Á¤","±è»ñ°«"};
		int[] nums = {1234,4567,2350,9870,2345};
		for(int i=0;i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		//Map °´Ã¼¿¡¼­ valueµé¸¸ Á¶È¸ÇÏ±â
		Collection<Integer> values = map.values();
		for(Integer i : values)
			System.out.println(i);
		Iterator it = values.iterator();
		while(it.hasNext())
			System.out.println(it.next());
    }
}
