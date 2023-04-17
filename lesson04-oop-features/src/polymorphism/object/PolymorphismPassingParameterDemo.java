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

	// shape cé thể nhận vào là KDL shape hoặc KDL con của shape
	// 6 --> Shape shape = shape;

	// 10 --> Shape shape rectangle;

	// 12 --> Shape shape = square;

	// design pattern --> factory(nha san xuất) pattern

	public static void callShapeMethods(Shape shape) {
		shape.paint();
		shape.calArea();

		// Kiểm tra biến shape lúc runtime là ai
		System.out.println("shape at runtime -->" + shape.getClass());

		Class<?> shapeRuntimeClass = shape.getClass();

		// Nếu lúc runtime shape là KDL Rectangle

		if (shapeRuntimeClass == Rectangle.class) {
			Rectangle castedShape = (Rectangle) shape;
			System.out.print(">>>>>> ");
			castedShape.setBackground();
		}
		
		System.out.println("\n");

	}

}
