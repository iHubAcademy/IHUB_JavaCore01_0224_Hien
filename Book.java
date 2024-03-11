package Inheritance;

import java.util.Date;

public class Book extends Document{
	private String tittle; 
	
	public Book(String[] authors, Date date, String tittle) {
		super(authors, date);
		this.tittle = tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	} 
	
	@Override
	public String toString() {
		return super.toString() + " Book [tittle=" + tittle + "]";
	}
	public String getTittle() {
		return this.tittle;
	}
}
