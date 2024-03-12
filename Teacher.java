package Polymorphism;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {
	private String className;
	private long salary;
	private long numberOfClass;
	
	public Teacher() {
		super();
	}
	public Teacher(String name, String gender, Date birthday, String address, String className, long salary, int numberOfClass) {
		super(name, gender, birthday, address);
		this.className = className;
		this.salary = salary;
		this.numberOfClass = numberOfClass;
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getNumberOfClass() {
		return numberOfClass;
	}
	public void setNumberOfClass(long numberOfClass) {
		this.numberOfClass = numberOfClass;
	}
	public void inputInfo() throws ParseException {
		super.inputInfo();
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhap vao ten lop day: ");
			this.className = scanner.nextLine();
			char[] charArray = this.className.toCharArray();
			if(charArray[0] == 'G' || charArray[0] == 'H' || charArray[0] == 'I' || charArray[0] == 'K' || charArray[0] == 'L' || charArray[0] == 'M') {
				flag = true;
			}
			else flag = false;
		}while(!flag);
		System.out.println("Nhap vao luong mot gio day: ");
		this.salary = scanner.nextLong();
		System.out.println("Nhap vao so gio day trong thang: ");
		this.numberOfClass = scanner.nextLong();
	}
	public long calculatorSalary() {
		long output = 0L;
		char[] charArray = this.className.toCharArray();
		if(charArray[0] == 'G' || charArray[0] == 'H' || charArray[0] == 'I' || charArray[0] == 'K') {
			output = this.numberOfClass * this.salary;
		}
		else if(charArray[0] == 'L' || charArray[0] == 'M') {
			output = this.numberOfClass * this.salary + 200000;
		}
		return output;
	}
	@Override
	public String toString() {
		String s = Long.toString(this.calculatorSalary());
		return super.toString() + " Teacher [className=" + className + ", salary=" + salary + ", numberOfClass=" + numberOfClass + ", total=" + s + "]";
	}
	
}
