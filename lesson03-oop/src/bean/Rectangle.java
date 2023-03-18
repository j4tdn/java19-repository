package bean;

public class Rectangle {
	
	// attribute(s): thuộc tính
	//private: trong class hiện tại
	//public: ở mọi nơi
	//        trong package hiện tại
	public int width;
	public int height;
	
	// default: empty constructor
	public Rectangle() {
	}
	//new Rectangle(8, 6);
	//constructor
	//vừa khởi tạo đối tượng vừa khởi tạo giá trị cho thuộc tính 
	//của đối tượng
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//getter(s)
	public int getWidth() {
		return this.width;
	}
	
	//setter(s)
	//r1.width = 10;
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	//print r1 --> r1.toString
	//this sẽ là r1
	
	@Override
	public String toString() {
		return this.width + ", " + this.height;
	}

}
