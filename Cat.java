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
		String s = String.valueOf(getAge());
		return "Cat [type=" + type + " name=" + getName() + " age=" + s + "]";
	}
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setAge(3);
		cat.setName("aaaa");
		cat.setType("Black");
		System.out.println("Ten: " + cat.getName());
		System.out.println("Tuoi: " + cat.getAge());
		System.out.println(cat.toString());
	}
}
