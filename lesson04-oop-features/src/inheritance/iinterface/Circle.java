package inheritance.iinterface;

public class Circle implements Shape{

	@Override
	public void paint() {
		System.out.println("Circle --> paint");
	}

	@Override
	public void calArea() {
		System.out.println("Circle --> calArea");
	}

}
