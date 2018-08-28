package chap14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapEx2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] names =	{"È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","ÀÓ²©Á¤","±è»ñ°«"};
		int[] nums = {1234,4567,2350,9870,2345};
		for(int i=0;i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		//Map °´Ã¼¿¡¼­ keyµé¸¸ Á¶È¸ÇÏ±â
		Set<String> keys = map.keySet();
		for(String key : keys) 
			System.out.println(key + "=" + map.get(key));
		System.out.println("Iterator ÀÌ¿ëÇÏ¿© Ãâ·Â");
		Iterator it = keys.iterator();
		while(it.hasNext())	{
			String a = (String)it.next();
			System.out.println(a+"="+map.get(a));
		}
    }
}
