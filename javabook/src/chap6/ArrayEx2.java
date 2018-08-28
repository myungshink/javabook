package chap6;

public class ArrayEx2 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println();
		arr = new int[]{100,200,300,400,500};
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println();
		int[] arr2 = arr;
		arr[3]=123;
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}
