package chap19;

import java.util.Arrays;
import java.util.List;

abstract class Figure {
	String type;
	public abstract double area();
	public abstract double length();
}
class Rectangle extends Figure {
    int w,h;
    Rectangle(int w, int h) {
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
		return "가로:"+w + ",높이:"+h + ",둘레:"+length()+",넓이:"+area();
	}
}
class Circle extends Figure {
	int r;
	Circle(int r) {
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
		return "반지름:"+r + ",둘레:"+length()+",넓이:"+area();
	}
}
public class SortedEx2 {
	public static void main(String[] args) {
		List<Figure> list = Arrays.asList(new Rectangle(10,3),new Circle(10),new Rectangle(2,3));
		list.stream().sorted().forEach(System.out::println);
	}
}

