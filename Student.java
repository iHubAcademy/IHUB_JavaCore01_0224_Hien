package Polymorphism;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
	private String studentID;
	private float gpa;
	private String Email;
	
	public Student() {
		super();
	}
	public Student(String name, String gender, Date birthday, String address, String studentID, float gpa, String Email) {
		super(name, gender, birthday, address);
		this.studentID = studentID;
		this.gpa = gpa;
		this.Email = Email;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void inputInfo() throws ParseException {
		super.inputInfo();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhap vao ma so sinh vien: ");
			this.studentID = scanner.nextLine();
		}while(this.studentID.length() != 8);
		do {
			System.out.println("Nhap vao GPA: ");
			this.gpa = scanner.nextFloat();
		}while(!(this.gpa >= 0.0F && this.gpa <= 10F));
		boolean check1 = false, check2 = true;
		do {
			System.out.println("Nhap vao Email: ");
			this.Email = scanner.nextLine();
			char[] charArray = this.Email.toCharArray();
			for(int i = 0; i < charArray.length; i++) {
				if(charArray[i] == '@') check1 = true;
				if(charArray[i] == ' ') check2 = false;
			}
		}while(!(check1 && check2));
	}
	@Override
	public String toString() {
		return super.toString() + " Student [studentID=" + studentID + ", gpa=" + gpa + ", Email=" + Email + "]";
	}
	public boolean getScholarship() {
		if(this.getGpa() > 8F) {
			return true;
		}
		else return false;
	}
}
