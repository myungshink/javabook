package chap9;
//[예제 9-1]
interface Printerable {
	int INK = 100;
	void print();
}
interface Scannerable {
	void scan();
}
interface Faxable {
	String FAX_NO="010-12345";
	void send(String tel);
	void receive(String tel);
	
}
interface Complexerable extends Printerable,Scannerable,Faxable {
}
//구현클래스
class Complexer  implements Complexerable {
	int ink;
	Complexer() {
		this.ink = INK;
	}
	@Override
	public void print() {
		System.out.println("종이에 출력합니다. 남은 잉크량:" + --ink);
	}
	@Override
	public void scan() {
		System.out.println("이미지를 스캔합니다.");
	}
	@Override
	public void send(String tel) {
		System.out.println(FAX_NO +"에서  "+ tel + "번호로  FAX를 전송합니다." );
	}
	@Override
	public void receive(String tel) {
		System.out.println(tel + "에서 " +FAX_NO + "로 FAX를 받았습니다.");
	}	
}
public class ComplexerEx1{
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("기본 잉크량:" + Printerable.INK);
		System.out.println("FAX 번호:" + Complexerable.FAX_NO);
		com.print();
		com.scan();
		com.receive("02-5678");
		com.send("02-5678");
	}
}
