package chap9;
//[¿¹Á¦ 9-3]
public class ComplexerEx3 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		Complexerable ca = com;
		ca.print();
		ca.scan();
		ca.send("010-1234");
		ca.receive("010-1234");
		Printerable p = com;
		p.print();
		//p.scan();           //error
		//p.send("010-1234"); //error
		//p.receive("010-1234");//error
		Scannerable s = com;
		//s.print();          //error
		s.scan();           
		//s.send("010-1234"); //error
		//s.receive("010-1234");//error
		Faxable f = com;
		//f.print();          //error
		//f.scan();           //error 
		f.send("010-1234"); 
		f.receive("010-1234");
	}
}
