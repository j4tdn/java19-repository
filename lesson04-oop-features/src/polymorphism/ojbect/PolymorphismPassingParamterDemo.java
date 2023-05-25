package polymorphism.ojbect;

public class PolymorphismPassingParamterDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		callShapeMethods(shape);
		
		Rectangle rectangle = new Rectangle();
		callShapeMethods(rectangle);
		rectangle.setBackground();
		
		Square square = new Square();
		callShapeMethods(square);
	}
	public static void callShapeMethods( Shape shape) {
		shape.paint();
		shape.calArea();
		
		// kiểm tra biến shape lúc runtime là ai
		System.out.println("shape at runtime-->"+shape.getClass());
		Class<?> shapeRuntimeClass = shape.getClass();
		if(shapeRuntimeClass == Rectangle.class) {
			Rectangle castedShape = (Rectangle)shape;
			System.out.println(">>>>>>>>");
			castedShape.setBackground();
		}
		System.out.println("\n");
	}

 	
}	
