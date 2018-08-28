package chap7;
//[抗力 7-7]
class Math1 {
	int add1(int a, int b)  //-> 急攫何 
	{
		return a + b;       //->备泅何
	}
	long add2(int a, int b) {	return a + b;	}
	double add3(int a, int b) {	return a + b;	}
}

public class MathEx1 {
	public static void main(String[] args) {
		Math1 m1 = new Math1();
		System.out.println(m1.add1(10, 20));
		System.out.println(m1.add2(10, 20));
		System.out.println(m1.add3(10, 20));
	}
}
