package polymorphism.object;

public class Rectangle extends Shape{

	// alt left|right
	/* 
	   this: đối tượng hiện tại
	       : gọi đến những thuộc tính, phương thức của lớp hiện tại
	 
	   super: đối tượng của lớp cha
	        : gọi đến những thuộc tính, phương thức của lớp cha
	 */
	@Override
	void paint() {
		System.out.println("Rectangle --> paint");
	}
	
	@Override
	void calArea() {
		System.out.println("Rectangle --> calArea");
	}
	
	// extend function
	void setBackground() {
		System.out.println("Rectangle --> setBackground");
	}
	
}
