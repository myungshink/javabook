package chap7;

//[¿¹Á¦ 7-3]
public class FactorialEx {
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}

	static int factorial(int i) {
		return (i == 1) ? 1 : i * factorial(i - 1);
	}
}
