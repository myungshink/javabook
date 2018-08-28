package chap14;

import java.util.HashSet;
import java.util.Set;

class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "("+ name + "," + age + ")";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return 
			name.equals(p.name) && age == p.age;
		}
		else  return false;	
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("ȫ�浿",10));
		set.add(new Person("ȫ�浿",10));
		System.out.println(set);
	}
}
