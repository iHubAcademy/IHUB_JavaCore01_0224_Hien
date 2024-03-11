package Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws ParseException {
		//String[] authors = {"abc", "xyz", "nac"};
		String[] authors = new String[3];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("Nhap vao phan tu thu " + i + ": ");
			 String chuoi = scanner.nextLine();
			 authors[i] = chuoi;
		}
		String[] to = {"ABC", "DEF"};
		String subject = "Child";
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
	    Date date = new Date();
	    String s = scanner.nextLine();
	    date = sf.parse(s);
	    
	    String tittle = "Math";
		Book newBook2 = new Book(authors, date, tittle);
		System.out.println(newBook2.getTittle());
		EMail newEMail = new EMail(authors, date, subject, to);
		System.out.println(newEMail.toString());
	}
}
