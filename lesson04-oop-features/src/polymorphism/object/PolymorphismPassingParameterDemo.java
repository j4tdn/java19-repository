package polymorphism.object;

public class PolymorphismPassingParameterDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		callShapeMethod(shape);
		Rectangle rectangle = new Rectangle();
		callShapeMethod(rectangle);
		rectangle.setBackground();

		Square square = new Square();
		callShapeMethod(square);
	}

	public static void callShapeMethod(Shape shape) {
		shape.paint();
		shape.calArea();

		// kiểm tra biến shape lúc runtime là ai
		System.out.println("shape at runtime -> " + shape.getClass());

		Class<?> shapeRuntimeClass = shape.getClass();
		// Nếu lúc runtime shape là KDl Rectangle
		if (shapeRuntimeClass == Rectangle.class) {
			Rectangle castedShape = (Rectangle) shape;
			System.out.println(">>>>");
			castedShape.setBackground();
		}
		System.out.println("\n");
	}
}
