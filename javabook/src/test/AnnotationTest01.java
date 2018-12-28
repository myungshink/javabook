package test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest01 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		String url = "logout";
		Method[] methods = AnnotationTest01.class.getMethods();
		for (Method method : methods) {
			RequestMapping re = method.getAnnotation(RequestMapping.class);
			if (re != null && re.value().equals(url))
				method.invoke(new AnnotationTest01(), null);
		}
	}
	@RequestMapping(value = "login", method = MethodType.POST)
	public void method01() throws NoSuchMethodException, SecurityException {
		System.out.println("login �� ���� �Ǿ����ϴ�");
		RequestMapping re = AnnotationTest01.class.getMethod("method01", null).getAnnotation(RequestMapping.class);
		System.out.println("�����" + re.method() + "�Դϴ�");
	}

	@RequestMapping(value = "logout", method = MethodType.POST)
	public void method02() throws NoSuchMethodException, SecurityException {
		System.out.println("logout �� ���� �Ǿ����ϴ�");
		RequestMapping re = AnnotationTest01.class.getMethod("method01", null).getAnnotation(RequestMapping.class);
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