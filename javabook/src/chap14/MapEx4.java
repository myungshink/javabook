package chap14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx4 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = { "È«±æµ¿", "±è»ñ°«", "ÀÌ¸ù·æ", "ÀÓ²©Á¤", "±è»ñ°«" };
		int[] nums = { 1234, 4567, 2350, 9870, 2345 };
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		// Map °´Ã¼´Â (Å°,°´Ã¼)½ÖÀ¸·Î ÀÌ·ç¾îÁø °´Ã¼µéÀÇ ¸ðÀÓ.
		// (Å°,°´Ã¼)½ÖÀÎ °´Ã¼ Á¶È¸ÇÏ±â
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for (Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "=" + m.getValue());
			System.out.println(m);
		}
	}
}
