package Abstract;

public class Square implements Drawable {
	private int length;
	
	public Square() {
		
	}
	public Square(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void draw() {
		for(int i = 0; i < this.length; i++) {
			for(int j = 0; j < this.length; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
