package Abstract;

public class Ractangle extends AbstractShape implements Resizeable {
	private double length, width;

	public Ractangle() {
		
	}
	public Ractangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public void resize(double factor) {
		this.length /= factor;
		this.width /= factor;
	}
	
	public double calculateArea() {
		return this.length * this.width;
	}
}
