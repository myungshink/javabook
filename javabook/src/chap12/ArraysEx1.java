package chap12;

import java.util.Arrays;

//[���� 12-29]
public class ArraysEx1 {
	public static void main(String[] args) {
		String[] arr = { "����", "�̸���", "���", "����" };
		Arrays.fill(arr, "������"); // .
		for (String n : arr)	System.out.print(n + ",");
		System.out.println();
		Arrays.fill(arr, 1, 3, "��");
		for (String n : arr)	System.out.print(n + ",");
	}
}
