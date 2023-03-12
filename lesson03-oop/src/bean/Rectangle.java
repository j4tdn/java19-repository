package bean;

public class Rectangle {
	//access modifier
	//private: this class
	//public: everywhere in package
	
	//attribute
	private int width;
	private int height;
	
	//default: empty constructor
	public Rectangle() {
	}
	
	//create new object and set value for attributes
	public Rectangle(int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
	}
	
	//getter
	//r1.getWith();
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	//setter
	//r1.setWith(10);
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return this.getWidth() + "," + this.getHeight();
	}


}
