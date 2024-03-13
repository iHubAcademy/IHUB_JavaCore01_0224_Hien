package Abstract;

public class Triangle extends AbstractShape {
	private double height, base;
	
	public Triangle() {
		
	}
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double calculateArea() {
		return this.base * this.height / 2;
	}
}
