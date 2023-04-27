package pholymorphism.object;

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
		
		// ----- Đa hình trong đối tượng --------//
		// Là 1 biến KDL đối tượng lúc runtime có thể là 
		// KDL của chính nó hoặc là thể hiện của KDL lớp con
		Shape s1 = new Rectangle();
		s1.paint();		// -->	 
		s1.calArea();	// -->
		Shape s2 = new Square();
		s2.paint();
		s2.calArea();
	}
}
