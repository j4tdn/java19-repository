package bean;

public class Rectangle {

	// attribute(s): thuộc tính
	private int width;
	private int height;

	public Rectangle() {

	}
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	//getter
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	//setter
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return this.width + ", " + this.height;
	}
}
