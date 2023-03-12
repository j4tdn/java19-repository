package bean;

public class Rectangle {
	// access modifiers:
	// private	: trong class hiện tại
	// public	: mọi nơi 
	//			: trong package hiện tại
	// 
	// static: package khác
	// attributes:
	private int width;
	private int height;

	// default: empty constructor
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//getter(s): bao nhiêu thuộc tính thì bấy nhiêu getter
	// r1.getWidth()
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	//setter(s)
	// r1.width = 10;
	// --> r1.setWidth(10);
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.width + ", " + this.height;
	}
}
