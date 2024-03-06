package Encapsulation;

import java.util.Scanner;

public class Shape2 {
	public String name;
	public double area;
	public static int count = 0;
	
	public Shape2(String name) {
		this.name = name;
		count++;
	}
	
	public Shape2(String name, double area) {
		this.name = name;
		this.area = area;
		count++;
	}
	
	public void showInfo() {
		System.out.println("Ten hinh: " + this.name);
		System.out.println("Dien tich: " + this.area);
	}
	
	public void showInfo2() {
		Scanner scanner = new Scanner(System.in);
		if(this.name == "Hinh vuong" || this.name == "hinh vuong" || this.name == "Hinh Vuong") {
	        System.out.println("Nhap vao do dai canh hinh vuong: ");
	        int n = scanner.nextInt();
	        System.out.println("Ten hinh: " + this.name);
			System.out.println("Chu vi: " + 4 * n);
		}
		else if(this.name == "Hinh chu nhat" || this.name == "hinh chu nhat" || this.name == "Hinh Chu Nhat") {
			System.out.println("Nhap vao chieu dai hinh chu nhat: ");
	        int chieuDai = scanner.nextInt();
	        System.out.println("Nhap vao chieu rong hinh chu nhat: ");
	        int chieuRong = scanner.nextInt();
	        System.out.println("Ten hinh: " + this.name);
	        int chuVi = 2*(chieuDai+chieuRong);
			System.out.println("Chu vi: " + chuVi);
		}
		else if(this.name == "Hinh thang" || this.name == "hinh thang" || this.name == "Hinh Thang") {
			System.out.println("Nhap vao chieu dai canh 1: ");
	        int chieuDai1 = scanner.nextInt();
	        System.out.println("Nhap vao chieu dai canh 2: ");
	        int chieuDai2 = scanner.nextInt();
	        System.out.println("Nhap vao chieu dai canh 3: ");
	        int chieuDai3 = scanner.nextInt();
	        System.out.println("Nhap vao chieu dai canh 4: ");
	        int chieuDai4 = scanner.nextInt();
	        System.out.println("Ten hinh: " + this.name);
	        int chuVi = chieuDai1 + chieuDai2 + chieuDai3 + chieuDai4;
			System.out.println("Chu vi: " + chuVi);
		}
	}
	
	public static void main(String[] args) {
		Shape2 hinh = new Shape2("hinh chu nhat");
		hinh.showInfo2();
	}
}
