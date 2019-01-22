package chap19;

import java.util.Arrays;
import java.util.List;

public class ReduceEx1 {
	public static void main(String[] args) {
		List<Figure> list = Arrays.asList(new Rectangle(8,8),new Circle(5),new Rectangle(2,3));
		double areaSum = list.stream().mapToDouble(Figure :: area).sum();
		System.out.println("sum()를 이용한 면적 합계 :" + areaSum);
		
		areaSum = list.stream().mapToDouble(Figure :: area).reduce((a,b)->a+b).getAsDouble();
		System.out.println("reduce(Operator)를 이용한 면적 합계 :" + areaSum);
		
		areaSum = list.stream().mapToDouble(Figure :: area).reduce(0,(a,b)->a+b);
		System.out.println("reduce(0,Operator)를 이용한 면적 합계 :" + areaSum);
	}
}
