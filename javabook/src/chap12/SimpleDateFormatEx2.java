package chap12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx2 {
	public static void main(String[] args) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2019-03-09";
		Date d = null;
		try {
			d = sf.parse(strDate);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d);
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd은 E요일 입니다.");
  	    System.out.println(sf2.format(d));
	}

}
