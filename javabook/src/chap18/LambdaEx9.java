package chap18;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaEx9 {
	private static Student[] list = { 
			new Student("È«±æµ¿", 90, 80, "°æ¿µ"), 
			new Student("±è»ñ°«", 95, 70, "ÄÄ°ø"),
			new Student("ÀÌ¸ù·æ", 100, 70, "¼öÇÐ")
			};
	public static void main(String[] args) {
		System.out.print("ÃÖ´ë¼öÇÐ°ª:");
		int max = maxOrMinMath(
				   (a,b)->{
					  if(a>=b) return a;
					  else return b;
		         });
		System.out.println(max);
		System.out.print("ÃÖ¼Ò¼öÇÐ°ª:");
		System.out.println(maxOrMinMath((a,b)->(a<=b?a:b)));
		System.out.print("ÃÖ´ëÆò±Õ°ª:");
		System.out.println(maxOrMinAvg((a,b)->(a>=b?a:b)));
		System.out.print("ÃÖ¼ÒÆò±Õ°ª:");
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
