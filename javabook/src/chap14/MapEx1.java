package chap14;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = { "ȫ�浿", "���", "�̸���", "�Ӳ���", "���" };
		int[] nums = { 1234, 4567, 2350, 9870, 2345 };
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println("ȫ�浿 ��ȣ:" + map.get("ȫ�浿"));
		System.out.println("�̸��� ��ȣ:" + map.get("�̸���"));
		System.out.println("��� ��ȣ:" + map.get("���"));
	}
}
