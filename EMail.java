package Inheritance;

import java.util.Arrays;
import java.util.Date;

public class EMail extends Document {
	private String subject;
	private String [] to;
	
	public EMail(String[] authors, Date date, String subject, String [] to) {
		super(authors, date);
		this.subject = subject;
		this.to = to;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return this.subject;
	}
	public String[] getTo() {
		return this.to;
	}
	@Override
	public String toString() {
		return super.toString() + " EMail [subject=" + subject + ", to=" + Arrays.toString(to) + "]";
	}
	
}
