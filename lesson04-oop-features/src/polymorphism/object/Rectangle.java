package polymorphism.object;

public class Rectangle extends Shape{
	@Override
	public void paint() {
		System.out.println("Rectangle---paint");
	}
	
	@Override
	public void calArea() {
		System.out.println("Rectangle--calArea");
	}
	
	public void setBackground() {
		System.out.println("Rectangle setBackground");
	}

}
