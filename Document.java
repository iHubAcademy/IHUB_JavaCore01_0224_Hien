package Inheritance;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Document {
	private String[] authors;
	private Date date;
	
	 public Document(String[] authors, Date date) {
	    this.authors = authors;
	    this.date = date;
	}
	public String[] getAuthors() {
		return this.authors;
	}
	public Date getDate() {
		return this.date;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		return "Document [authors=" + Arrays.toString(authors) + ", date=" + sf.format(date) + "]";
	}
	public void addAuthor(String name) {
		this.authors[this.authors.length] = name;
	}
}
