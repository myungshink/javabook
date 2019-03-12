package chap12;

//[���� 12-29]
import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("����(0)_����(1) :" + today.get(Calendar.AM_PM));
		System.out.println("�ð� (0~11) :" + today.get(Calendar.HOUR));
		System.out.println("�ð� (0~23) :" + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("��(0~59) :" + today.get(Calendar.MINUTE));
		System.out.println("��(0~59) :" + today.get(Calendar.SECOND));
		System.out.println("�и���(0~999) :" + today.get(Calendar.MILLISECOND));
		System.out.println("Timezone(-12~12):" + today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000));
		System.out.println("�̹����� ����������:" + today.getActualMaximum(Calendar.DATE));
		Calendar cal = Calendar.getInstance();
		cal.set(2017, (3 - 1), 17);
		System.out.println("��¥:" + cal.get(Calendar.YEAR) + "�� " + (cal.get(Calendar.MONTH) + 1) + "�� "
				+ cal.get(Calendar.DATE) + "�� ");
	}
}
