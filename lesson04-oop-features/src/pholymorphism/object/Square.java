package pholymorphism.object;

public class Square extends Shape{
	@Override
	void paint() {
		System.out.println("Square --> paint");
	}
	@Override
	void calArea() {
		System.out.println("Square --> calArea");
	}
}
