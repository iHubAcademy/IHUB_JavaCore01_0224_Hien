package Encapsulation;

public class Item {
	private int weight;
	private String name;
	
	public Item(String name) {
		this.name = name;
	}
	
	public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight;
	}

	@Override
	public String toString() {
		return "Item [weight=" + weight + ", name=" + name + "]";
	}
	
	
}
