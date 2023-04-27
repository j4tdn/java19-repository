package polymorphism.object;

public class PolymorphismPassingParamterDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		callShapeMethods(shape);
		
		
		Rectangle rectangle = new Rectangle();
		callShapeMethods(rectangle);
		rectangle.setBackGround();
		
		Square square = new Square();
		callShapeMethods(square);
	}
	
	// shape co the nhan vao KDL shape hoac KDL con cua shape
	//6 --> Shape shape = shape
	//10 --> Shape shape = rectangle;
	//12 --> Shape shape = square;
	
	//design pattern --> factory(nha san xuat) pattern
	public static void callShapeMethods(Shape shape) {
		shape.paint();
		shape.calArea();
		
		//kiem tra bien shape luc runtime la ai
		System.out.println("shape at runtime -->" + shape.getClass());
		Class<?> shapeRuntimeClass = shape.getClass();
		//new luc runtime shape la kdl rentangle
		if(shapeRuntimeClass == Rectangle.class) {
			Rectangle castedShape = (Rectangle)shape;
			System.out.println(">>>>>> ");
			castedShape.setBackGround();
		}
		
		System.out.println("\n");
		
	}
}
