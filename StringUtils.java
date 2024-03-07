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
	
	static String splitFullName(String s) {
		String[] arrOfStr = s.split(" ", 5);
		String newString = arrOfStr[0] + " " + arrOfStr[arrOfStr.length - 1];
		return newString;
	}
	
	static String reverseName(String s) {
		String output = "";
		char[] charArray = s.toCharArray();
		for(int i = s.length() - 1; charArray[i] != ' '; i--) {
			output += charArray[i];
		}
		return output;
	}
	
	public static void main(String[] args) {
		String s = "    NGUYEN               ho phuoc       hien";
		System.out.println("Chuoi ban dau: " + s);
		String t = toUpperFirstChar(s);
		System.out.println("Chuoi luc sau: " + t);
		System.out.println(splitFullName(t));
		System.out.println(reverseName(t));
	}
}
