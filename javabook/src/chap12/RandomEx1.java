package chap12;
//[¿¹Á¦ 12-22]
import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(0);
		Random rand2 = new Random();
		rand2.setSeed(0);
		System.out.println("rand ==> ");
		for (int i = 0; i < 5; i++)
			System.out.println(i + ":" + rand.nextInt(100));
		System.out.println("\nrand2 ==>");
		for (int i = 0; i < 5; i++)
			System.out.println(i + ":" + rand2.nextInt(100));
	}
}
