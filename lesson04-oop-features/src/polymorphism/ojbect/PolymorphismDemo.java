package polymorphism.ojbect;

public class PolymorphismDemo {
	public static void main(String[] args) {
		
		// shape     : paint, calArea
		// Rectangle : paint, calArea, setBackground(-)
		// Square    : paint, calArea
		
		// compile (gõ code, save, javac fn.java)--> biên dịch, 
		//runtime (java fn)--> chạy và tạo/quản lý vùng nhớ
		
		
		
		// class c = new class()
		// biến c --> lúc compile
		
		
		Shape shape = new Shape();
		shape.paint();
		shape.calArea();
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		 rectangle.calArea();
		 rectangle.setBackground();
		
		// Lớp con kế thừa từ lớp cha
		// Lớp con không bắt buộc phải override tát cả các p thức từ lớp cha
		 Square square = new Square();
		 square.paint();
		 square.calArea();
	  
		 
		 // ---> đa hình trong đối tượng 
		 // là 1 đối tượng lúc là thể hiện này, lúc là thể hiện khác
		 // là 1 biến kdl đối tượng lúc runtime có thể là thể hiện kdl của chính nó
		 // hoặc là thể hiện của kdl lớp con
		 
		 Shape s1 = new Rectangle();
		 
		s1.paint();
		s1.calArea();
		
		Shape s2 = new Square();
		s2.paint();
		s2.calArea();
		
		// cá nhần --> trẻ sơ sinh, học sinh, sinh viên, nhân viên
		
		// vì sao phải áp dụng đa hình trong đối tượng, lấy cha new con
		// mà không phải new chính nó
	}
}
