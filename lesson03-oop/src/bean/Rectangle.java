package bean;

public class Rectangle {
	
	// access modifier
	// private : trong class hiện tại
	//
	// public  : ở mọi nơi
	//         :trong package hiện tại
	
	// attribute(s): thuộc tính
	// thông tin lưu trữ trên ô nhớ HEAP
	public int width;
	public int height;
	
	// default: empty constructor
	public Rectangle() {
		
	}
	
	
	// constructor 
	// vừa khởi tạo đối tượng vừa khởi tạo giá trị cho 
	// thuộc tính của đối tượng
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// getter(s)
	// r1. getWidth()
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	// setter(s)
	// r1.width = width
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "width: " + this.width + ", height: " + this.height;
	}
}
