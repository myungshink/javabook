package chap12;

import java.util.Arrays;

//[���� 12-30]
public class ArraysEx2 {
	public static void main(String[] args) {
		String[] arr1 = { "����", "����", "���", "" };
		String[] arr2 = { "����", "����", "���", "�̸���" };
		if (!Arrays.equals(arr1, arr2))
			System.out.println("�� �迭�� �ٸ��ϴ�.");
		Arrays.fill(arr1, 3, 4, "�̸���");
		if (Arrays.equals(arr1, arr2))
			System.out.println("�� �迭�� �����ϴ�.");
		else
			System.out.println("�� �迭�� �ٸ��ϴ�.");
	}

}
