package chap7;
//[¿¹Á¦7-2]
public class PhoneEx2 {
	public static void main(String[] args) {
		Phone[] pArr = new Phone[3];
		for(int i=0;i<pArr.length;i++) {
			pArr[i] = new Phone();
			pArr[i].no = i+"1234";
		}
		for(int i=0;i<pArr.length;i++) {
			System.out.printf("pArr[%d].no=%s\n",i,pArr[i].no);
			pArr[i].send(((i==0)?pArr[pArr.length-1].no:pArr[i-1].no));
		}

	}

}
