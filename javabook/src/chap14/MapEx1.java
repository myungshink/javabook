package chap14;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = { "È«±æµ¿", "±è»ñ°«", "ÀÌ¸ù·æ", "ÀÓ²©Á¤", "±è»ñ°«" };
		int[] nums = { 1234, 4567, 2350, 9870, 2345 };
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println("È«±æµ¿ ¹øÈ£:" + map.get("È«±æµ¿"));
		System.out.println("ÀÌ¸ù·æ ¹øÈ£:" + map.get("ÀÌ¸ù·æ"));
		System.out.println("±è»ñ°« ¹øÈ£:" + map.get("±è»ñ°«"));
	}
}
