package chap7;
//[예제 7-4]  : grade 변수를  초기화 하지 않아 오류 발생 
public class LocalValEx {
	public static void main(String[] args) {
		int num;
		boolean b = true;
		if(b) {
			num = 100;
		} else {
			num = 200;
		}
		System.out.println(num);
		String grade;
		int score = 80;
		switch(score/10) {
		case 9 : grade="A";break;
		case 8 : grade="B";break;
		case 7 : grade="C";break;
		case 6 : grade="D";break;
		}
		System.out.println("학점:" + grade); //오류 발생
	}

}
