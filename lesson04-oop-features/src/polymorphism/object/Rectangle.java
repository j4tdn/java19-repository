package polymorphism.object;

public class Rectangle extends Shape {
	
	// alt left|right
	// this: object hiện tại
	// super: đối tượng của lớp cha
	
	@Override
	void paint() {
		System.out.println("Rectangle --> paint");
	}
	@Override
	void calArea() {
		System.out.println("Retangle --> calArea");
	}
	
	// extend function
	void setBackground() {
		System.out.println("Rectangle --> setBackground");
	}
}
