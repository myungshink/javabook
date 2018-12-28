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
		System.out.println("login �� ���� �Ǿ����ϴ�");
		RequestMapping re = Exec.class.getMethod("method01").getAnnotation(RequestMapping.class);
		System.out.println("�����" + re.method() + "�Դϴ�");
	}
	@RequestMapping(value = "logout", method = MethodType.POST)
	public void method02() throws NoSuchMethodException, SecurityException {
		System.out.println("logout �� ���� �Ǿ����ϴ�");
		RequestMapping re = Exec.class.getMethod("method02").getAnnotation(RequestMapping.class);
		System.out.println("�����" + re.method() + "�Դϴ�");
	}
}
@Retention(RetentionPolicy.RUNTIME) // ���� �ÿ� ��밡���ϵ��� ����
@interface RequestMapping {
	String value();
	MethodType method() default MethodType.GET;
}
enum MethodType {
	POST, GET
}