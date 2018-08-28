package chap12;
class Animal {
	String name;
	int age;
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ToStringEx1 {
	public static void main(String[] args) {
		Animal a1 = new Animal("È£¶ûÀÌ",20);
		System.out.println(a1);
	}
}
