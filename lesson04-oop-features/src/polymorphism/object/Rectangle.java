package polymorphism.object;

public class Rectangle extends Shape {

	@Override
	public void paint() {
		System.out.println("Rectangle --> paint");		
	}

	@Override
	public void calArea() {
		System.out.println("Rectangle --> calArea");		
	}
	
	void setBackGround() {
		System.out.println("Rectangle --> setBackGround");	
	}
}
