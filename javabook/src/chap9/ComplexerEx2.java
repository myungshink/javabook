package chap9;
//[¿¹Á¦ 9-2]
public class ComplexerEx2 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		if(com instanceof Complexer)
			System.out.println("com °´Ã¼´Â Complexer °´Ã¼ÀÓ");
		if(com instanceof Complexerable)
			System.out.println("com °´Ã¼´Â Complexerable °´Ã¼ÀÓ");
		if(com instanceof Printerable)
			System.out.println("com °´Ã¼´Â Printerable °´Ã¼ÀÓ");
		if(com instanceof Scannerable)
			System.out.println("com °´Ã¼´Â Scannerable °´Ã¼ÀÓ");
		if(com instanceof Faxable)
			System.out.println("com °´Ã¼´Â Faxable °´Ã¼ÀÓ");
		if(com instanceof Object)
			System.out.println("com °´Ã¼´Â Object °´Ã¼ÀÓ");
	}
}
