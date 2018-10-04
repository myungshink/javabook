package chap18;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class LambdaEx6 {
	public static void main(String[] args) {
		Consumer<String> c1 = t->System.out.println(t+8);
		c1.accept("java");	
		BiConsumer<String, String> c2 =	(t,u)->System.out.println(t+u);
		c2.accept("java", "8");
		DoubleConsumer c3 =(d)->System.out.println("java"+d);
		c3.accept(8.0);
		ObjIntConsumer<String> c4 =(t,i)->System.out.println(t+i);
		c4.accept("java", 8);
	}
}
