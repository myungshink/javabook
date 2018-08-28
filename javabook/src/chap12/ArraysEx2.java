package chap12;

import java.util.Arrays;

//[예제 12-30]
public class ArraysEx2 {
	public static void main(String[] args) {
		String[] arr1 = { "월매", "춘향", "향단", "" };
		String[] arr2 = { "월매", "춘향", "향단", "이몽룡" };
		if (!Arrays.equals(arr1, arr2))
			System.out.println("두 배열이 다릅니다.");
		Arrays.fill(arr1, 3, 4, "이몽룡");
		if (Arrays.equals(arr1, arr2))
			System.out.println("두 배열이 같습니다.");
		else
			System.out.println("두 배열이 다릅니다.");
	}

}
