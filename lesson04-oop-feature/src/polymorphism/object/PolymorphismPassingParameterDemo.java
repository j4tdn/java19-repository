package polymorphism.object;

public class PolymorphismPassingParameterDemo {

	public static void main(String[] args) {
		Shape shape = new Shape();
		callShapeMethods(shape);
		
		Rectangle rectangle = new Rectangle();
		callShapeMethods(rectangle);
		rectangle.setBackground();
		
		Square square = new Square();
		callShapeMethods(square);
	}

	//design pattern  --> factory pattern
	public static void callShapeMethods(Shape shape) {
		shape.paint();
		shape.calArea();
		
		// Kiểm tra biến shape lúc runtime là ai
		System.out.println("\nshape at runtime --> " + shape.getClass());
		
		
		
		//<>: từ JAVA 1.5 --> Generic Type & Generic WildCard (?)
		/*
		 * // Danh sách các phần tử --> mảng(hạn chế)
		// KDL mới --> List, Set, Stack, Queue
		// List --> chứa danh sách các phần tử
		
		Shape[] shapes = new Shape[5];
		
		// danh sách phần tử
		// từng phần tử KDL gì ?
		List<Shape> shapeList = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();
		
		Class<Shape> shapeClass = Shape.class;
		Class<Rectangle> rectClass = Rectangle.class;
		 */
		Class<?> shapeRuntimeClass = shape.getClass();
		//nếu lúc runtime shape là KDL Rectangle
		if (shapeRuntimeClass == Rectangle.class) {
			Rectangle castedShape = (Rectangle)shape;
			System.out.println(">>>>");
			castedShape.setBackground();
		}
	}
}
