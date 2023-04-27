package polymorphism.object;

public class Polymorphism {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.paint();
		shape.calArea();

		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.setBackground();
		rectangle.calArea();
		
		Square square = new Square();
		square .paint();
		square.calArea();
		
		/*---Đa hình trong đối tượng---
		 + là 1 đối tượng lúc thể hiện này, lúc thể hiện khác
		 + Là 1 biến KDL đối tượng lúc runtime có thể là thể hiện
		 KDL của chính nó hoặc là thể hiện của KDL lớp con 
		 
		 */
		System.out.println("\n=============\n");
		Shape s1 = new Rectangle();
		s1.paint();
		s1.calArea();
		Shape s2 = new Square();
		s2.calArea();
		s2.paint();
		
		// vì sao phải áp dụng đa hình trong đối tượng, lấy cha new con
		// mà không phải new chính nó 
		
		//1.Dễ dàng ép kiểu qua về giữa các KDL cha con(compile all đều là cha)
		//2.Tham số KDL cha có thể nhận giá trị của KDL con khi truyền tham số qua hàm 
		//3.Tạo ra 1 mảng có KDL cha và các phần tử trong mảng có thể là KDL cha, con 
		Shape[]shapes = {shape, rectangle, square, s1, s2};
		System.out.println("length -> " + shapes.length);
		
	}
}
