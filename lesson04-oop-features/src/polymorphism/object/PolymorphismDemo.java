package polymorphism.object;

public class PolymorphismDemo {
	public static void main(String[] args) {

		// complie( gõ code, save, javac .fn.java)
		// runtime (java fn) --> chạy và tạo quản lý vùng nhớ stack, heap.

		Shape shape = new Shape();
		shape.paint();
		shape.calArea();

		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calArea();
		rectangle.setBackground();

		Square square = new Square();
		square.paint();
		square.calArea();
		
		System.out.println("\n============================\n");
		// -------- Đa hình trong đối tượng -------- //
		// Là 1 đối tượng lúc là thể hiện này, lúc là thể hiện khác
		// Là 1 biến KDL đối tượng lúc runtime có thể là 1 thể hiện KDL của chính nó 
		// hoặc là thể hiện của KDL lớp con
		
		Shape s1 = new Rectangle();
		s1.paint();
		s1.calArea();
		
		Shape s2 = new Square();
		s2.paint();
		s2.calArea();
		
		// Yêu cầu: Tạo danh sách các phần tử là Shape, Square, Rectangle, Circle
		Shape[] shapes = {shape, rectangle, square, s1, s2};
		System.out.println("“length --> " + shapes.length);
			
		
		// THỰC HÀNH: --> không bắt buộc phải kế thừa, đa hình trong đối tượng 
		// KHI NÀO
		// dữ liệu, chức năng chung của các KDL  --> thừa kế cha, con(s)
		// cha, con(s)  --> muốn khởi tạo đối tượng --> cha new con  --> để có thể sử dụng 1 2 3 phía trên 
	
		
		
		
	}
}
