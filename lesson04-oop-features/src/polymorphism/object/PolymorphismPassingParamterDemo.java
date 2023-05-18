package polymorphism.object;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPassingParamterDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		callShapeMethods(shape);

		Rectangle rectangle = new Rectangle();
		callShapeMethods(rectangle);
		rectangle.setBackground();

		Square square = new Square();
		callShapeMethods(square);

		// Danh sách các phần tử --> mảng(hạn chế)
		// KDL mới --> List, Set, Stack, Queue
		// List --> chứa danh sách các phần tử

		Shape[] shapes = new Shape[5];

		// danh sách phần tử
		// từng phần tử KDL gì ?
		List<Shape> shapeList = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();

		Class<Shape> shapeClass = Shape.class;
		Class<Rectangle> rectClass = Rectangle.class;
	}

	// shape có thể nhận vào là KDL shape hoặc KDL con của shape
	// 6 --> Shape shape = shape;
	// 10 --> Shape shape = rectangle;
	// 12 --> Shape shape = square;
	// design pattern --> factory(nhà sản xuất) pattern
	public static void callShapeMethods(Shape shape) {
		shape.paint();
		shape.calArea();

		// Kiểm tra biến shape lúc runtime là ai
		System.out.println("shape at runtime --> " + shape.getClass());

		// Từ JAVA 1.5 --> Generic Type & Generic WildCard(unknown type)
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
