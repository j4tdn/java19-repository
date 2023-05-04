package bean;

public class Rectangle {
	
	// access modifier
	// private: trong class hiện tại
	// public : ở mọi nơi
	//        : trong package hiện tại
	
	// attribute(s): thuộc tính
	// thông tin lưu trữ trên ô nhớ ở heap cho từng đối tượng
	private int width;
	private int height;
	
	// default: empty constructor
	public Rectangle() {
	}
	
	// new Rectangle(8, 6);
	// constructor
	// Vừa khởi tạo đối tượng vừa khởi tạo giá trị cho thuộc tính
	// của đối tượng
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// getter(s)
	// r1.getWidith() --> r1.width
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	// setter(s)
	// r1.width = 10; --> r1.setWidth(10);
	public void setWidth(int width) {
		if (width >= 10 && width <= 100) {
			this.width = width;
		} else {
			System.out.println("Width is invalid. Required [10, 100]");
		}
		
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	// print r1 --> r1.toString
	// this sẽ là r1
	@Override
	public String toString() {
		return this.width + ", " + this.height;
	}
}
