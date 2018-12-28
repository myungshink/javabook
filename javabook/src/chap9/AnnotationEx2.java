package chap9;
//[9-7]
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationEx2 {
	public static void main(String[] args) throws  IllegalAccessException, InvocationTargetException {
		String url = "logout";
		Method[] methods = Exec.class.getMethods();
		for (Method method : methods) {
			RequestMapping re = method.getAnnotation(RequestMapping.class);
			if (re != null && re.value().equals(url))
				method.invoke(new Exec());
		}
	}
}
class Exec {
	@RequestMapping(value = "login", method = MethodType.GET)
	public void method01() throws NoSuchMethodException, SecurityException {
		System.out.println("login 이 실행 되었습니다");
		RequestMapping re = Exec.class.getMethod("method01").getAnnotation(RequestMapping.class);
		System.out.println("방식은" + re.method() + "입니다");
	}
	@RequestMapping(value = "logout", method = MethodType.POST)
	public void method02() throws NoSuchMethodException, SecurityException {
		System.out.println("logout 이 실행 되었습니다");
		RequestMapping re = Exec.class.getMethod("method02").getAnnotation(RequestMapping.class);
		System.out.println("방식은" + re.method() + "입니다");
	}
}
@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정
@interface RequestMapping {
	String value();
	MethodType method() default MethodType.GET;
}
enum MethodType {
	POST, GET
}