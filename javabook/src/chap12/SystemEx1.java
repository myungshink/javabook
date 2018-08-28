package chap12;
//[예제 12-8]
public class SystemEx1 {
	public static void main(String[] args) {
		System.out.println("System의 프로퍼티값 조회");
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println("\n환경 변수값 조회");
		for(String env : System.getenv().keySet()) {
			System.out.println(env + "=" + System.getenv(env));
		}
	}
}
