package chap19;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

abstract class Figure2 implements Comparable<Figure2>{
	String type;
	public abstract double area();
	public abstract double length();
	@Override
	public int compareTo(Figure2 f) {
		return (int)(area() - f.area());
	}
	
}
class Rectangle2 extends Figure2 {
    int w,h;
    Rectangle2(int w, int h) {
    	this.w = w;
    	this.h = h;
    }
	@Override
	public double area() {
		return w * h;
	}
	@Override
	public double length() {
		return (w+h) * 2;
	}
	@Override
	public String toString() {
		return "����:"+w + ",����:"+h + ",�ѷ�:"+length()+",����:"+area();
	}
}
class Circle2 extends Figure2 {
	int r;
	Circle2(int r) {
    	this.r = r;
    }
	@Override
	public double area() {
		return Math.PI * r * r;
	}
	@Override
	public double length() {
		return Math.PI * 2 * r;
	}
	@Override
	public String toString() {
		return "������:"+r + ",�ѷ�:"+length()+",����:"+area();
	}
}
public class SortedEx3 {
	public static void main(String[] args) {
		List<Figure2> list = Arrays.asList(new Rectangle2(10,3),new Circle2(10),new Rectangle2(2,3));
		System.out.println("�������� ����");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("�������� ���� 1");
		list.stream().sorted((a,b)->b.compareTo(a) - a.compareTo(b) ).forEach(System.out::println);
		System.out.println("�������� ���� 2");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}