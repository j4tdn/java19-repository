package bean;

public class Rectangle {

	// attribute(s): thuộc tính
	public int width;
	public int height;

	// default: empty constructor
	public Rectangle() {
	}

	// phải ghi vô nếu không có thì khi tạo hàm khởi tạo khác hàm khởi tạo này sẽ mất.
	// Parameterized Constructor
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	// 
	
	@Override
	public String toString() {
		return this.width + ", " + this.height;
	}

}
