package polymorphism.ojbect;

// hình chữ nhật
public class Rectangle extends Shape {
	
	
	// this : đối tượng hiện tại
	// super : đối tượng của lớp cha
	@Override
	void paint() {
		System.out.println("Rectagle--> paint");
	}
	
	@Override
	void calArea() {
		System.out.println("Rectangle--> calArea");
	}
	// extend function
	void setBackground () {
		System.out.println("Rectangle-->setBackground");
	}
}
