package Inheritance;

public class Cat extends Animal{
	private String type;
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}

	/*
	 * public String toString() { return name + " " + age + " " + this.type; }
	 */
	
	@Override
	public String toString() {
		return "Cat [type=" + type + "]";
	}
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setAge(3);
		cat.setName("aaaa");
		System.out.println("Ten: " + cat.getName());
		System.out.println("Tuoi: " + cat.getAge());
		System.out.println(cat.toString());
	}
}
