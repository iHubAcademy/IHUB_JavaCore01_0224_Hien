package Polymorphism;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
	private String name;
	private String gender;
	private Date birthday;
	private String address;
	
	public Person() {
		
	}
	public Person(String name, String gender, Date birthday, String address) {
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}
	public String getName() {
		return this.name;
	}
	public String getGender() {
		return this.gender;
	}
	public Date getBirthday() {
		return this.birthday;
	}
	public String getAddress() {
		return this.address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void inputInfo() throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ten: ");
		this.name = scanner.nextLine();
		System.out.println("Nhap vao gioi tinh: ");
		this.gender = scanner.nextLine();
		System.out.println("Nhap vao ngay sinh: ");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
	    Date date = new Date();
	    String s = scanner.nextLine();
	    date = sf.parse(s);
	    this.birthday = date;
	    System.out.println("Nhap vao dia chi: ");
	    this.address = scanner.nextLine();
	}
	@Override
	public String toString() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		return "Person [name=" + name + ", gender=" + gender + ", birthday=" + sf.format(birthday) + ", address=" + address + "]";
	}
	
}
