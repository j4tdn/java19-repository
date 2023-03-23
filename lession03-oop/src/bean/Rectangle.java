package bean;

public class Rectangle {
	
	//access modifier
	//private : trong class hiện tại
	//public : mọi nơi
	
	//attribute(s) : thuộc tính
	
	//Thông tin lưu trữ trên vùng nhớ HEAP trên từng đối tượng
	
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//default : empty constructor
	public Rectangle() {
		
	}
	
	//Vừa khởi tạo đối tượng vừa khởi tạo giá trị của thuộc tính đối tượng
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return this.width + "," + this.height;
	}
	
}
