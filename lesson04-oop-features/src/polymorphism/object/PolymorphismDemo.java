package polymorphism.object;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calArea();
		
		Shape shape = new Shape();
		shape.paint();
		shape.calArea();
		
		Square square = new Square();
		square.paint();
		square.calArea();
		
		System.out.println("=============");
		
		Shape s1 = new Rectangle();
		s1.paint();
		s1.calArea();
		
		Shape s2 = new Square();
		s2.paint();
		s2.calArea();
	}
}
