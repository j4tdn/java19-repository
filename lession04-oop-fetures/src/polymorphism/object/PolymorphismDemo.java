package polymorphism.object;

public class PolymorphismDemo {
	public static void main(String[] args) {
		//Lớp con kế thừa từ lớp cha, lớp con không bắt buộc phải override
		// các phương thức từ lớp cha
		
		/*
		 * compile (gõ code, save, javac fn.java) --> biên dịch lỗi
		 * runtime (java fn) --> chạy và tạo / quản lý vùng nhơ stack, heap
		 * */
		
		Shape shape = new Shape();
		
		shape.paint();
		shape.calArea();
		
		Rectangle rectangle = new Rectangle();
		shape.paint();
		shape.calArea();
		rectangle.setBackground();
		
		Square square = new Square();
		shape.paint();
		shape.calArea();
		
		// ---- Đa hình trong đối tượng ----//
		/*
		 * Là 1 đối tượng lúc thể hiện thế này, lúc thể hiện khác
		 * Là 1 biến KDL lúc runtime có thể à kiểu dữ lieeuju của chính nó
		 * hoặc là thể hiện của lớp con
		 * */
		
		System.out.println("\n=======================\n");
		
		Shape shape1 = new Rectangle();
		shape1.paint();
		shape1.calArea();
		
		Shape shape2 = new Square();
		shape2.paint();
		shape2.calArea();
		
		//Vì sao phải áp dụng đa hình trong đối tượng, lấy 
		//cha new con mà không phải chính nó ?
		
		
		/*
		 * 1. Dễ dàng ép kiểu qua lại giữa các kiểu dữ liệu cha con(khi compile tất cả đều là kiểu cha)
		 * 2. Không thể ép kiểu qua lại nếu không sử dụng đa hình trong đối tượng
		 * 3. Tham số KDL cha có thể nhận gia trị của KDL con khi truyền tham số qua hàm
		 * 4. Tạo ra 1 mảng con có kiểu dữ liệu cha và các con trong phần tử mảng có thể là KDL cha, con 
		 * */
		
		// Yêu cầu : Tạo ra danh sách các phần tử {shape, rectangle, square,shape1, shape2}
		
		Shape[] shapes = {shape, rectangle, square,shape1, shape2};
		System.out.println("lengh --> " + shapes.length);
		
		//Thực hành không bắt buộc phải đa hình hay kế thwufa đối tượng
		/*Khi nào:
		 * Dữ liệu , chức năng chung của các KDL --> thừa kế cha, con(s)
		 * cha, con(s) --> muốn khởi tạo đối tượng --> cha new con --> để có thể sửa dụng 1 2 3 phía trên 
		 * 
		 * */
	}
}
