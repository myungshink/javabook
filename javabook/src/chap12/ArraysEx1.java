package chap12;

import java.util.Arrays;

//[예제 12-29]
public class ArraysEx1 {
	public static void main(String[] args) {
		String[] arr = { "월매", "이몽룡", "향단", "방자" };
		Arrays.fill(arr, "춘향전"); // .
		for (String n : arr)	System.out.print(n + ",");
		System.out.println();
		Arrays.fill(arr, 1, 3, "♥");
		for (String n : arr)	System.out.print(n + ",");
	}
}
