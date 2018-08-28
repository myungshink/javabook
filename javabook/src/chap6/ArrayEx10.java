package chap6;

public class ArrayEx10 {
	public static void main(String[] args) {
		int[][] arr = {
				{46},
				{47,36},
				{48,38,29},
				{49,39,30,22},
				{50,40,31,23,16},
				{51,41,33,24,17,11},
				{52,42,34,25,18,12,7},
				{53,43,35,26,19,13,8,4},
				{54,44,36,27,20,14,9,5,2},
				{55,45,37,28,21,15,10,6,3,1}				
			};
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++){
					System.out.printf("%4d",arr[i][j]);
				}
				System.out.println();
			}
	}

}
