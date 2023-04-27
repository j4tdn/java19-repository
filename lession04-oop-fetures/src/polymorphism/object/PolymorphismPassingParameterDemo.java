package polymorphism.object;

public class PolymorphismPassingParameterDemo {
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		
		calShapeMethods(shape);
		
		Rectangle rectangle = new Rectangle();
		calShapeMethods(rectangle);
		rectangle.setBackground();
		
		Square square = new Square();
		calShapeMethods(square);
	}
	
	
	public static void calShapeMethods(Shape shape) {
		shape.paint();
		shape.calArea();
		
		// Kiểm tra shape lúc runtime là ai 
		System.out.println("Shape at runtime --> " + shape.getClass());
		
		Class<?> shapeRuntimeClass = shape.getClass();
		
		//Nếu lúc runtiem shape là kiểu dữ liệu Rectangle
		if(shapeRuntimeClass == Rectangle.class) {
			Rectangle castedShape = (Rectangle)shape;
			castedShape.setBackground();
		}
		System.out.println("\n");
		
	}
}
