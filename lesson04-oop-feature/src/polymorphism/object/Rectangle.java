package polymorphism.object;

public class Rectangle extends Shape {
	
	//ctrl + left mouse
	//alt + left: trở về vị trí cũ
	
	
	//this: đối tượng hiện tại
	//super: đối tượng của lớp cha
	@Override
	void paint() {
		//super.paint(); //gọi paint của lớp cha
		System.out.println("Rectangle --> paint");
	}
	
	@Override
	void calArea() {
		System.out.println("Rectangle --> calArea");
	}
	
	// extend functions
	void setBackground() {
		System.out.println("Rectangle --> setBackground");
	}
}
