package bean;

public class Rectangle {
	// access modifier
			// private: trong class hiện tại
			// public: mọi nơi
			//		 : trong pakage hiện tại
			
			// attribute(s): thuộc tính
			private int width;
			private int height;
			
			// default: empty constructor
	public Rectangle() {
		
	}
	
	public void setHeight(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return this.width;
	}
	
	// setter(s)
	// r1.width = 10; --> r1.setWitch(10);
	public void setWidth(int width) {
		this.width = width;
	}
	
	//getter
	public int getWicth() {
		return this.width;
	}
	
	public int getHeigth() {
		return this.height;
	}
	
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// print r1 --> r1.toString
	// this sẽ là r1
	@Override
	public String toString() {
		return this.width + ", " + this.height;
	}
}
