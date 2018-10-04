package chap18;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;

	public Student(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getMajor() {
		return major;
	}
}

public class LambdaEx8 {
	private static Student[] list = { new Student("홍길동", 90, 80, "경영"), new Student("김삿갓", 95, 70, "컴공") };

	public static void main(String[] args) {
		System.out.print("학생 이름 :");
		printString(t -> t.getName());
		System.out.print("전공 이름 :");
		printString(t -> t.getMajor());
		System.out.print("영어 점수 :");
		printInt(t -> t.getEng()); // 김재한
		System.out.print("수학 점수 :");
		printInt(t -> t.getMath());
		System.out.print("영어 점수 합계:");
		printTot(t -> t.getEng());
		System.out.print("수학 점수 합계:");
		printTot(t -> t.getMath());
		System.out.print("영어 점수 평균:");
		printAvg(t -> t.getEng());
		System.out.print("수학 점수     평균:");
		printAvg(t -> t.getMath());
	}

	private static void printAvg(ToDoubleFunction<Student> f) {
		double sum = 0;
		for (Student s : list) {
			sum += f.applyAsDouble(s);
		}
		System.out.println(sum / list.length);
	}

	private static void printTot(ToIntFunction<Student> f) {
		int sum = 0;
		for (Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}

	private static void printInt(Function<Student, Integer> f) {
		for (Student s : list) {
			System.out.print(f.apply(s) + " ");
		}
		System.out.println();
	}

	private static void printString(Function<Student, String> f) {
		for (Student s : list) {
			System.out.print(f.apply(s) + " ");
		}
		System.out.println();
	}
}