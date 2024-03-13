package Abstract;

import java.text.DecimalFormat;

public class Circle extends AbstractShape {
	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double calculateArea() {
		DecimalFormat df = new DecimalFormat("#.##");
		double S = Math.PI*Math.pow(radius, 2);
		return Double.parseDouble(df.format(S));
	}
	
}
