package polymorphism.object;

public class PolymorphismPassingParamterDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		callShapeMethod(shape);
		
		Rectangle rectangle = new Rectangle();
		callShapeMethod(rectangle);
		rectangle.setBackGround();
		
		Square square = new Square();
		callShapeMethod(square);
	}
	
	public static void callShapeMethod(Shape shape) {
		shape.paint();
		shape.calArea();
		// Kiểm tra biến shape lúc runtime là ai 
		System.out.println("shape at runtime --> " + shape.getClass());
		Class<?> shapeRuntime = shape.getClass();
		
		if( shapeRuntime == Rectangle.class) {
			Rectangle castedShape = (Rectangle)shape;
			castedShape.setBackGround();
		}
		
		System.out.println("\n");
	}
}
