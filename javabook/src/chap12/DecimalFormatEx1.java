package chap12;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx1 {
	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("000,000");
		try {
			Number num = df1.parse("1,234.56");
			double d = num.doubleValue();
			System.out.print(d + "->" + df2.format(num));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
