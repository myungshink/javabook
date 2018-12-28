package test;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class MyAnnoTest {
	@MyAnno(value="a")
    public void doing(){  }

	@MyAnno(value="b")
    public void getString(){  }

	public static void main(String[] args) {
		Method methods[] = new MyAnnoTest().getClass().getDeclaredMethods();
		Annotation[] annos=null;
	    for (int i = 0; i < methods.length; i++) {
	        String methodsName = methods[i].getName();
	        annos =  methods[i].getAnnotations();
	        if(annos.length > 0) {
	        System.out.print(methodsName + "의 어노테이션:");
	        for(Annotation a : annos) 
	           System.out.println(a.annotationType().getName() + ",");
	        }
	    }
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
  String value();
}

