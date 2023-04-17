package polymorphism.object;

public class PolymorphismPassingParameterDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		callShapeMethods(shape);
		
		Rectangle rectangle = new Rectangle();
		callShapeMethods(rectangle);
		
		Square square = new Square();
		callShapeMethods(square);
	}
	
	public static void callShapeMethods(Shape shape) {
		shape.paint();
		shape.calArea();
		
		System.out.println("shape at runtime -->" + shape.getClass());
		
		Class<?> shapeRuntimeClass = shape.getClass();
		if (shapeRuntimeClass == Rectangle.class) {
			Rectangle castedShape = (Rectangle) shape;
			System.out.println(">>>>>>");
			castedShape.setBackground();
		}
	}
}
