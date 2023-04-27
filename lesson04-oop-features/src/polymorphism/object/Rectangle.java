package polymorphism.object;

public class Rectangle extends Shape {
// trở về class trước đó: alt + left
	// super: đối tượng trong lớp cha

	@Override
	void paint() {
		System.out.println("Rectangle -> paint");

	}

	@Override
	void calArea() {
		System.out.println("Rectangle -> calArea");
	}

	// extend function
	void setBackground() {
		System.out.println("Rectangle -> Background");
	}
}
