package chap18;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaEx9 {
	private static Student[] list = { 
			new Student("ȫ�浿", 90, 80, "�濵"), 
			new Student("���", 95, 70, "�İ�"),
			new Student("�̸���", 100, 70, "����")
			};
	public static void main(String[] args) {
		System.out.print("�ִ���а�:");
		int max = maxOrMinMath(
				   (a,b)->{
					  if(a>=b) return a;
					  else return b;
		         });
		System.out.println(max);
		System.out.print("�ּҼ��а�:");
		System.out.println(maxOrMinMath((a,b)->(a<=b?a:b)));
		System.out.print("�ִ���հ�:");
		System.out.println(maxOrMinAvg((a,b)->(a>=b?a:b)));
		System.out.print("�ּ���հ�:");
		System.out.println(maxOrMinAvg((a,b)->(a<=b?a:b)));
	}
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}
	private static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list[0].getMath() + list[0].getEng()) / 2.0;
		for(Student s : list) {
			result = op.applyAsDouble(result, (s.getMath()+s.getEng())/2.0);
		}
		return result;
	}
}
