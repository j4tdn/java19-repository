package pholymorphism.object;

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
	public static void callShapeMethods(Shape shape) {
		shape.paint();
		shape.calArea();
		if(shape.getClass() == Rectangle.class) {
			Rectangle castedShape = (Rectangle)shape;
			System.out.println(">>>>>>>>>");
			castedShape.setBackground();
		}
	}
}
