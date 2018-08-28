package chap13;
//[예제 13-1]
class NoGeneric {
Object[] v;
void set(Object[] n) {
	v = n;
}
Object[] get() {
	return v;
}
void print() {
	for(Object o : v)
		System.out.print(o + ",");
	System.out.println();
	}
}
public class GenericEx1 {
	public static void main(String[] args) {
		NoGeneric nogen = new NoGeneric();
		String[] ss = {"  월매   ","  춘향  ","  향단  "};
		nogen.set(ss);
		nogen.print();
		Object[] objs = nogen.get();
		for(Object o : objs) {
			String s = (String)o;
			System.out.println(s.trim());
		}
		
		Integer[] ii = {1,2,3};
		nogen.set(ii);
		objs = nogen.get();
		
		for(Object o : objs) {
			String s = (String)o;
			System.out.println(s.trim());
		}
	}
}

