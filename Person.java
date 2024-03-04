package Oop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Person {
	private String name;
    private int age;
    private String address;
    private boolean gender;
    private double weight, height;
    
    public Person() {
    	System.out.println("Constructor without parameter");
    }
    
    public Person(String name) {
    	this.name = name;
    	System.out.println("Constructor with " + name);
    }
    
    public Person(String name, int age, boolean gender) {
    	String gioiTinh = (gender) ? "Nam" : "Nu";
    	this.name = name;
    	this.age = age;
    	this.gender = gender;
    	System.out.println("Constructor with " + name + " " + age + " " + gioiTinh);
    }
    
    public void showInfo() {
    	System.out.println("Name: "+this.name);
    	System.out.println("Age: "+this.age);
    	System.out.println("Address: "+this.address);
    	System.out.println("Gender: "+this.gender);
    }
    
    public void setName(String newName) {
    	this.name = newName;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public void speak(Person orther, String content) {
    	System.out.println(this.name + " talk to " + orther.getName() + " " + content);
    }
    
    public void setWeight(double newWeight) {
    	this.weight = newWeight;
    }
    
    public void setHeight(double newHeight) {
    	this.height = newHeight;
    }
    
    public String IBM() {
    	DecimalFormat df = new DecimalFormat("#.##");
    	return df.format(weight / (height * height));
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhap vao ten person1: ");
    	String ten = sc.nextLine();
    	Person person1 = new Person(ten);
		
		System.out.println("Nhap vao ten person2: ");
		String name = sc.nextLine();
		System.out.println("Nhap vao tuoi person2: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao gioi tinh person2: ");
		boolean gender = ("nam".equals(sc.nextLine())) ? true : false;
		Person person2 = new Person(name, age, gender);
		
		person1.setName("avshhd");
		System.out.println(person1.getName());
		person2.showInfo();
		System.out.println(person2.getName());
		person1.speak(person2, "Den gio hoc");
		person2.setWeight(68);
		person2.setHeight(1.65);
		System.out.println("IBM của person2: " + person2.IBM());
	}
}
