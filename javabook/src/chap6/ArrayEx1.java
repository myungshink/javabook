package chap6;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] arr1;
		int arr2[];
		arr1 = new int[5];
		int[] arr = new int[5];
		 for(int i=0; i<arr.length;i++) {
			 System.out.println ("arr[" + i + "]="+arr[i]);
		 }
		 arr[0] = 10;
		 arr[1] = 20;
		 arr[2] = 30;
		 for(int i=0; i<arr.length;i++) {
			 System.out.println ("arr[" + i + "]="+arr[i]);
		 }
		 System.out.println("개선된 for 구문 이용 출력");
		 for(int i:arr) {
		     System.out.println(i);
		 }

	}
}
