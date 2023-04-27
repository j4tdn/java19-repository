package polymorphism.object;

public class Rectangle extends Shape{

	//alt left/right
	/* this : đối tượng hiện tại
				Gọi đến được những thuộc tính của lớp hiện tại
	// super : đối tượng lớp cha
	 * 			Gọi đến được những thuộc tính của lớp cha
	*/
	@Override
	void paint() {
		System.out.println("Rectangle --> paint");
	}
	
	@Override
	void calArea() {
		System.out.println("Rectangle --> calArea");
	}
	
	void setBackground() {
		System.out.println("Rectangle --> setBackground");
	}
	

}
