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
		return "�����̸�=" + name + ", ����=" + age ;
	}
}

public class ToStringEx2 {
	public static void main(String[] args) {
		Animal2 a1 = new Animal2("ȣ����",20);
		System.out.println(a1);
	}
}
