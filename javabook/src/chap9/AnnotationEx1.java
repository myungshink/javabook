package chap9;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/*
 * [9-6] 
 */
public class AnnotationEx1 {
	public static void main(String[] args) {
		Method methods[] = new MyClass().getClass().getDeclaredMethods();
		Annotation[] annos = null;
		for (int i = 0; i < methods.length; i++) {
			String methodsName = methods[i].getName();
			annos = methods[i].getAnnotations();
			if (annos.length > 0) {
				System.out.print(methodsName + "의 어노테이션:");
				for (Annotation a : annos)
					System.out.println(a.annotationType().getName() + ",");
			}
		}
	}
}
class MyClass {
	@MyAnno(value = "a")
	public void amethod() {
		System.out.println("amethod 메서드 호출");
	}

	@MyAnno(value = "b")
	public void bmethod() {
		System.out.println("bmethod 메서드 호출");
	}
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String value();
}
