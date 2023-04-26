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
     public static void callShapeMethods(Shape shape) {
    	 shape.paint();
    	 shape.calArea();
    	 
    	 // Kiem tra bien shape luc runtime la ai
    	 System.out.println("shape at runtime --> " + shape.getClass());
    	 
    	 Class<?> shapeRunTimeClass = shape.getClass();
    	 
    	 if (shapeRunTimeClass == Rectangle.class) {
    		 Rectangle castedShape = (Rectangle)shape;
    		 System.out.println(">>>");
    		 castedShape.setBackground();
    	 }
    	 System.out.println("\n");
     }
}
