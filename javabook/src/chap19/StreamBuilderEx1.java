package chap19;

import java.util.stream.Stream;

public class StreamBuilderEx1 {
	public static void main(String[] args) {
		Stream<String> stream =  Stream.<String>builder().add("�ڹ���").add("��Ʈ����").add("�����").build();
		stream.forEach(s->System.out.print(s + " "));
	}
}
