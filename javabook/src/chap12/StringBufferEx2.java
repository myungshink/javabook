package chap12;
//[¿¹Á¦ 12-14] 
public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb); 
		sb.delete(2, 4);
		System.out.println(sb); 
		sb.deleteCharAt(4);
		System.out.println(sb); 
		sb.insert(5,"==");
		System.out.println(sb); 
		sb.insert(6,1.23);
		System.out.println(sb); 
		sb = new  StringBuffer("ABCDEFG");
		sb.replace(0, 3, "abc");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
