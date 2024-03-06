package Encapsulation;

public class StringUtils {
	static String toUpperFirstChar(String s) {
		s = s.toLowerCase();
		char[] charArray = s.toCharArray();
		boolean foundSpace = true;
		for(int i = 0; i < charArray.length; i++) {
		      if(Character.isLetter(charArray[i])) {
		        if(foundSpace) {
		          charArray[i] = Character.toUpperCase(charArray[i]);
		          foundSpace = false;
		        }
		      }
		      else {
		        foundSpace = true;
		      }
		}
		s = String.valueOf(charArray);
		return s.trim().replaceAll("\\s+", " ");
	}
	
	public static void main(String[] args) {
		String s = "NGUYEN               ho phuoc       hien";
		System.out.println("Chuoi ban dau: " + s);
		System.out.println("Chuoi luc sau: " + toUpperFirstChar(s));
	}
}
