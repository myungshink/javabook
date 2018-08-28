package chap9;
//[예제 9-4]
class LazerZet implements Printerable {
	@Override
	public void print() {
		System.out.println("레이저 Printer 에서 출력함.");
	}
}
class InkZet implements Printerable {
	@Override
	public void print() {
		System.out.println("잉크젯 Printer 에서 출력함.");
	}
}
class PrinterManager {
	public static Printerable getPrinter(String type) {
		if(type.equals("INK"))
			return new InkZet();
		else
			return new LazerZet();
	}
}
public class PrinterEx {
	public static void main(String[] args) {
		Printerable able = PrinterManager.getPrinter("INK");
		able.print();
		able = PrinterManager.getPrinter("LAZER");
		able.print();
	}
}
