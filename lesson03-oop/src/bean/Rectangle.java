package bean;

public class Rectangle {
    //access modifier
    //private: trong class hiện tại
    // public : ở mọi nơi & trong package hiện tại
     
	
    //attributes:  thuộc tính
	// --> thông tin lưu trữ trên ô nhớ ở heap cho từng đối tượng
	private int width;
	private int height;
	
	//default: empty constructor
	public Rectangle() {
	}
	
	// constructor
	// Hàm khởi tạo 2 tham số: vừa khởi tạo đối tượng, vừa khởi tạo giá trị cho thuộc tính của đối tượng
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	//getter(s)
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	//setter
	
	public void setWidth(int width) {
		 if(width >= 1 && width <= 100) {
			 this.width = width;
		 }else {
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
