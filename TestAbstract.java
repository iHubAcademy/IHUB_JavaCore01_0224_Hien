package Abstract;

public class TestAbstract {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		double radius = 5.6;
		double base = 7.2, height = 5.4;
		double length = 10, width = 5.5;
		circle.setRadius(radius);
		triangle.setBase(base);
		triangle.setHeight(height);
		Ractangle ractangle = new Ractangle(length, width);
		System.out.println("Dien tich hinh tron: " + circle.calculateArea());
		System.out.println("Dien tich hinh tam giac: " + triangle.calculateArea());
		System.out.println("Dien tich hinh chu nhat: " + ractangle.calculateArea());
	}
}
