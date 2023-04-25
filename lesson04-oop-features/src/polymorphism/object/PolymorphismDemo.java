package polymorphism.object;

public class PolymorphismDemo {
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.paint();
		shape.calArea();
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calArea();
		rectangle.setBackGround();
		
		Square square = new Square();
		square.paint();
		square.calArea();
		
		
		Shape s1 = new Rectangle();
		s1.paint();
		s1.calArea();
		
		Shape s2 = new Rectangle();
		s2.paint();
		s2.calArea();
		
	}
}
