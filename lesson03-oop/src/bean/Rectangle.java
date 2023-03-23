package bean;

public class Rectangle {

	// access modifier
	// private: trong class hiện tại
	// public: ở mọi nơi
	// : trong package hiện tại

	// attribute(s): thuộc tính
	private int width;
	private int height;
	
	//getter(s)
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	
	//setter(s)
	//r1.width = 10; --> r1.setWidth(10);
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle() {

	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		
	}

	@Override
	public String toString() {
		return this.width + "," + this.height;
	}
}