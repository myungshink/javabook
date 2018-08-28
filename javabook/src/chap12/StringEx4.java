package chap12;
//[¿¹Á¦ 12-12]
public class StringEx4 {
	public static void main(String[] args) {
		int i = Integer.parseInt("100");
		System.out.println(++i); //101
		double d = Double.parseDouble("100.5");
		System.out.println(++d); //101.5
		String sf = String.format("%.2f", 12.3456);
		System.out.println(sf);
		sf = String.format("%10d", 12345);
		System.out.println(sf);
		sf = String.format("%-10d", 12345);
		sf = String.format("%x,%X",255,255);
		System.out.println(sf);

	}

}
