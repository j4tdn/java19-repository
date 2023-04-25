package polymorphism.object;

public class Square extends Shape{
	
	@Override
	public void paint() {
		System.out.println("Square --> paint");		
	}

	@Override
	public void calArea() {
		System.out.println("Square --> calArea");		
	}
}
