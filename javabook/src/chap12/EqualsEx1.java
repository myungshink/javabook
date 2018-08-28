package chap12;

//[예제 12-1]
class Equal {
	int value;
	Equal(int value) {
		this.value = value;
	}
}
public class EqualsEx1 {
	public static void main(String[] args) {
		Equal e1= new Equal(10);
		Equal e2= new Equal(10);
		if(e1 == e2)
			System.out.println("e1 객체와 e2객체는 같은 객체임");
		else
			System.out.println("e1 객체와 e2객체는 다른 객체임");
		if(e1.equals(e2))
			System.out.println("e1 객체의 내용과 e2객체의 내용은 같다");
		else
			System.out.println("e1 객체의 내용과 e2객체의 내용은 다르다");
		
	}
}
