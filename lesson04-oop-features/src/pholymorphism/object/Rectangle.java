package pholymorphism.object;

public class Rectangle extends Shape{
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
