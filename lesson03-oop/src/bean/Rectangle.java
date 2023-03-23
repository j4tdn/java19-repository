package bean;

public class Rectangle {
	
	// access modifier
	// private : trong class hiện tại
	//public : ở mọi nơi
	//		: trong package hiện tại
	/// attributes(s) : thuộc tính
		public  int width;
		public  int height;
		
		// default : empty constructor
		public Rectangle() {
			
		}
		public Rectangle(int width,int height) {
			this.width = width;
			this.height = height;
		}
		//getter(s)
		// r1.getWidth ---> r1.width
		public int getWidth () {
			return this.width;
			
		}
		public int getHeight() {
			return this.height;
			
		}
		
		//setter (s)
		//r1.width = 10. --> r1.setWidth(10);
		public void setWidth(int width) {
			this.width= width;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		//print r1 --> r1.toString
		// this sẽ là r1
		@Override
		public String toString() {
			return this.width +"," + this.height;
		}
}
