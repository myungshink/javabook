package chap12;
class Animal2 {
	String name;
	int age;
	public Animal2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "동물이름=" + name + ", 나이=" + age ;
	}
}

public class ToStringEx2 {
	public static void main(String[] args) {
		Animal2 a1 = new Animal2("호랑이",20);
		System.out.println(a1);
	}
}
