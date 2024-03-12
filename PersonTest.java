package Polymorphism;

import java.text.ParseException;
import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) throws ParseException {
		/*Teacher teacher = new Teacher();
		Student student = new Student();
		System.out.println("Nhap thong tin student: ");
		student.inputInfo();
		System.out.println("Nhap thong tin teacher: ");
		teacher.inputInfo();
		System.out.println("ShowInfo student: ");
		System.out.println(student.toString());
		System.out.println("ShowInfo teacher: ");
		System.out.println(teacher.toString());
		System.out.println("Ket qua xet hoc bong cua student: " + student.getScholarship());*/
		System.out.println("Nhap vao '1' cho hoc sinh.");
		System.out.println("Nhap vao '2' cho giao vien.");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		switch(n) {
		case 1: 
			Student student = new Student();
			System.out.println("Nhap thong tin student: ");
			student.inputInfo();
			System.out.println("ShowInfo student: ");
			System.out.println(student.toString());
			System.out.println("Ket qua xet hoc bong cua student: " + student.getScholarship());
			break;
		case 2:
			Teacher teacher = new Teacher();
			System.out.println("Nhap thong tin teacher: ");
			teacher.inputInfo();
			System.out.println("ShowInfo teacher: ");
			System.out.println(teacher.toString());
			break;
		default:
			break;
		}
	}
}
