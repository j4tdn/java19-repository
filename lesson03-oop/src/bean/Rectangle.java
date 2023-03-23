package bean;

public class Rectangle {
public int width;
public int height;
// default: empty constructor
public Rectangle() {
	
}
// Vừa khởi tạo đối tượng vừa khởi tạo giá trị cho thuộc tính của đối tượng
public Rectangle(int width, int height) {
	this.width = width;
	this.height = height;
}
// r1.getWidth()
public int getWidth() {
	return this.width;
}
public int getHeight() {
	return this.height;
}

// r1.width = 10; <-> r1.setWidth(10);
public void setWidth(int width) {
	if(width >= 10 && width <=100 ) {
		this.width = width;
	}else {
		System.out.println("Width is invalid. Required [10, 100]");
	}
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
