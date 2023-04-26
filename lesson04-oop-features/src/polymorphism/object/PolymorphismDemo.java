package polymorphism.object;

public class PolymorphismDemo {
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.paint();
		shape.calArea();
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calArea();
		rectangle.setBackground();
		
		Square square = new Square();
		square.paint();
		square.calArea();
		
		System.out.println("\n=====================\n");
		
		Shape s1 = new Rectangle();
		s1.paint();
		s1.calArea();
		
		Shape s2 = new Rectangle();
		s2.paint();
		s2.calArea();
		
		s1 = s2;
		s1.calArea();
		
		Shape[] shapes = {shape, rectangle, square, s1, s2};
		System.out.println("length --> " + shapes.length);
		
		
	}
}
