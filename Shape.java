package Encapsulation;

public class Shape {
	public String name;
	public double area;
	public static int count = 0;
	
	public Shape(String name) {
		this.name = name;
		count++;
	}
	
	public Shape(String name, double area) {
		this.name = name;
		this.area = area;
		count++;
	}
	
	public void showInfo() {
		System.out.println("Ten hinh: " + this.name);
		System.out.println("Dien tich: " + this.area);
	}
	
	public static void main(String[] args) {
		Shape hinhVuong = new Shape("Hinh vuong", 16);
		Shape hinhTamGiac = new Shape("Hinh tam giac", 2);
		hinhVuong.showInfo();
		hinhTamGiac.showInfo();
		System.out.println("So hinh da duoc tao: " + count);
	}
}
