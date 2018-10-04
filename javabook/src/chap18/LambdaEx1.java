package chap18;

@FunctionalInterface
interface LambdaInterface1 {
	void method();
	// void method2(); //오류발생
}

public class LambdaEx1 {
	public static void main(String[] args) {
		LambdaInterface1 fi;
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		fi = () -> {
			System.out.println("method call2");
		};
		fi.method();
		fi = () -> {
			System.out.println("method call3");
		};
		fi.method();
		fi = () -> System.out.println("method call4");
		fi.method();
		execute(() -> System.out.println("method call5"));
	}

	static void execute(LambdaInterface1 f) {
		f.method();
	}
}
