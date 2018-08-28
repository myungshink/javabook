package chap13;
//[예제 13-4]
class Gen1 {
	String name = "Gen1";

	String getMsg() {
		return name;
	}
}

class Gen2 extends Gen1 {
	String name = "Gen2";

	String getMsg() {
		return name;
	}
}

class Gen3 extends Gen2 {
	String name = "Gen3";

	String getMsg() {
		return name;
	}
}

class Generic3<T> {
	T v;

	Generic3(T n) {
		v = n;
	}

	void set(T n) {
		v = n;
	}

	T get() {
		return v;
	}
}
public class GenericEx4 {
	public static void main(String[] args) {
		Gen3 g3 = new Gen3();
		Generic3<? super Gen2> g2 =new Generic3<Gen1>(g3);
//		Gen3 t1 = g2.get();//error Gen3형은  Gen2의 부모타입 아님
		Object t1 = g2.get();
		Gen1 t2 = (Gen3)g2.get();
		System.out.println(t2.name);
		System.out.println(t2.getMsg());
		Generic3<? extends Gen2> g4 =new Generic3<Gen3>(g3);
		Gen2 t3 = g4.get();
		Gen3 t4 = (Gen3)g4.get();
		Generic3<? extends Gen2> g5 =new Generic3<Gen2>(new Gen2());
		Generic3<Gen2> g51 =new Generic3<Gen2>(new Gen2());
		Generic3<?> g6 =new Generic3<Gen3>(g3);
		Object t5 = g6.get();
		Gen3 t6 = (Gen3)g6.get();
		Generic3<?> g7 =new Generic3<Integer>(1);
	}
}
