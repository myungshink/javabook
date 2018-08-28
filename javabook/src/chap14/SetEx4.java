package chap14;

import java.util.Comparator;
import java.util.TreeSet;
class Phone implements Comparable{
	String name;
	int number;
	Phone(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return "(" + name+ "," + number + ")";
	}
	@Override
	public int compareTo(Object o) {
		Phone p = (Phone)o;
		return name.compareTo(p.name);
	}
}
public class SetEx4 {
	public static void main(String[] args) {
		//ÀÌ¸§¼øÀ¸·Î Á¤·Ä
		TreeSet<Phone> set = new TreeSet<Phone>();
		set.add(new Phone("È«±æµ¿",1234));
		set.add(new Phone("±è»ñ°«",3456));
		set.add(new Phone("ÀÌ¸ù·æ",5678));
		System.out.println(set);
		//ÀüÈ­¹øÈ£ ¿À¸§Â÷¼øÀ¸·Î Á¤·ÄÇÏ¿© Ãâ·ÂÇÏ±â
		TreeSet<Phone> set2 = new TreeSet<Phone>(new Comparator<Phone>(){
			@Override
			public int compare(Phone o1, Phone o2) {
				return o1.number - o2.number;
			}
		  });
		set2.add(new Phone("È«±æµ¿",1234));
		set2.add(new Phone("±è»ñ°«",3456));
		set2.add(new Phone("ÀÌ¸ù·æ",5678));
		System.out.println(set2);
		//ÀÌ¸§ÀÇ ³»¸²Â÷¼øÀ¸·Î Á¤·ÄÇÏ¿© Ãâ·ÂÇÏ±â
		TreeSet<Phone> set3 = new TreeSet<Phone>(new NameDesc());
		set3.add(new Phone("È«±æµ¿",1234));
		set3.add(new Phone("±è»ñ°«",3456));
		set3.add(new Phone("ÀÌ¸ù·æ",5678));
		System.out.println(set3);
		//ÀüÈ­¹øÈ£ÀÇ ³»¸²Â÷¼øÀ¸·Î Á¤·ÄÇÏ¿© Ãâ·ÂÇÏ±â
		TreeSet<Phone> set4 =  new TreeSet<Phone>(new NumberDesc());
		set4.add(new Phone("È«±æµ¿",1234));
		set4.add(new Phone("±è»ñ°«",3456));
		set4.add(new Phone("ÀÌ¸ù·æ",5678));
		System.out.println(set4);
	}
}
class NumberDesc implements Comparator<Phone> {
	@Override
	public int compare(Phone o1, Phone o2) {
		return o2.number - o1.number;
	}
}
class NameDesc implements Comparator<Phone> {
	@Override
	public int compare(Phone o1, Phone o2) {
		return o1.compareTo(o2) * (-1);
	}	
}
