package chap3;

public class VarEx3 {
	public static void main(String[] args) {
		byte b1 = 10;
		short s1 = 20;
		int i1 = 100;
		long l1= 1000;
		i1 = b1; //int(4byte) <= byte(1byte)
		s1 = (short)l1; 
		float f = l1; 
	}
}
