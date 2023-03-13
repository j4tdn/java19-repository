package bean;

public class Rectangle {
	//access modifier
	//private: trong class hiện tại
	//public: ở mội nơi
	
	//attribute(s): thuộc tính
	//thông tin lưu trữ ở ô nhớ HEAP cho từng đối tượng
	private int width;
	private int height;
	
	//hàm khởi tạo default: empty constructor
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	//getter(s)
	//r1.getWidth()--> r1.width
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return height;
	}
	
	//setter
	//r1.width = 10; -->r1.setWidth(10)
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		if(width >= 10 && width <= 100) {
			this.width = width;
		}
		else {
			System.out.println("Width is invalid. Required[10, 100]");
		}
	}
	
	//construction
	//Vừa khởi tạo đối tượng cừa khởi tạo giá trị cho thuộc tính của đối tượng
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}


	//print r1 --> r1.tóString
	//THIS SẼ LÀ R1

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
