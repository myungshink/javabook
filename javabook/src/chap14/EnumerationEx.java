package chap14;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EnumerationEx {
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=1; i<= 5;i++)
			v.add(i*100);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		Iterator it = v.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
