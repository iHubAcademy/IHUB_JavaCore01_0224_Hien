package Inheritance;

public class Cat extends Animal{
	private String type;
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setAge(3);
		cat.setName("aaaa");
		System.out.println("Ten: " + cat.getName());
		System.out.println("Tuoi: " + cat.getAge());
	}
}
