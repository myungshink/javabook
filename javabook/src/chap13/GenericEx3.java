package chap13;
//[¿¹Á¦ 13-3]
class Generic2<K,E> {
	K key;
	E name;
	void set(K key, E name) {
		this.key = key;
		this.name = name;
	}
	K getKey() {
		return key;
	}
	E getName() {
		return name;
	}
}

public class GenericEx3 {
	public static void main(String[] args) {
		Generic2<String, Integer> g1 =new Generic2<String,Integer>();
		g1.set("È«±æµ¿", 1234);
		String k = g1.getKey();
		Integer n = g1.getName();
		System.out.println(k + "=" + n);
		//g1.set("È«±æµ¿", "T1234"); ¿À·ù ¹ß»ý
		Generic2<String, String> g2 =new Generic2<String,String>();
		g2.set("È«±æµ¿", "T1234"); 
		k = g2.getKey();
		String s = g2.getName();
		System.out.println(k + "=" + s);
	}
}
