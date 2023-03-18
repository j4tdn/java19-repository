package bean;

public class Rectangle {
// attributes
	public int width;
	public int height;
	
	//default: empty constructor
	public Rectangle() {
		
	}
	
	
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width  = width;
	}
	public int getWidth() {
		
	}
	
	@Override
		public String toString() {
			return this.width + "," + this.height;
		}
}
