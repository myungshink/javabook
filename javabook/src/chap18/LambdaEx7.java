package chap18;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdaEx7 {
	public static void main(String[] args) {
		Supplier<String> s1 = ()-> {	return "java";	};
		s1 = ()-> "java";
		System.out.println(s1.get());
		IntSupplier s2 = ()->{
			int num = (int)(Math.random() * 6) + 1;
			return num;
		};
		System.out.println("�ֻ��� :" + s2.getAsInt());
		DoubleSupplier s3 = ()->Math.random();
		System.out.println ("������ �Ǽ� :" + s3.getAsDouble());
		System.out.println(s3.toString());
	}
}
