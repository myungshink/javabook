package chap12;

import java.util.Calendar;

//[���� 12-28]
public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("���� �⵵:"+today.get(Calendar.YEAR));
		System.out.println("�̹���:" + (today.get(Calendar.MONTH)+1));
		System.out.println("�⵵���� ��°��:"+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("������ ��°��:"+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("����:" + today.get(Calendar.DATE));
		System.out.println("����:" + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("�⵵���س�¥:"+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("����(1(��)~7(��)):"+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("�����ظ�°����:" + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	}
}
