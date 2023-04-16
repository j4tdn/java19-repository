package polymorphism.object;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// Lớp con kế thừa từ lớp cha
		// lơ81p con ko bắt buộc phải override lop81 cha
		
		//compile (gõ code, save, javac fn.java) 
		//runtime(java fn) --> chạy và tạo.quản lí vùng nhớ STACK/HEAP
		
		//Class c (compile) = new Class (runtime)
		//biến c --> lúc compile là KDL Class
		//biến c --> lúc runtime là KDL Class
		
		
		Shape shape = new Shape();
		shape.paint();
		shape.calArea();
		
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calArea();
		rectangle.setBackground();
		
		Shape square = new Square();
		square.paint();
		square.calArea();
		
		// Đa hình trong đối tượng:
		//là 1 obj là thể hiện này, lúc là thể hiện khác
		//là 1 biến KDL obj lúc runtime có thể là thể hiện KDL chính nó
		//hoặc là thể hiện của KDL lớp con
		
		System.out.println("\n==================\n");
		
		Shape s1 = new Rectangle();
		s1.paint();	//lúc compile: KDL Shape
					//lúc runtime: KDL Rectangle
		s1.calArea();	//lúc compile: KDL Shape
						//lúc runtime: KDL Rectangle
		
		Shape s2 = new Square();
		s2.paint();
		s2.calArea();
		
		//s1 --> rectangle
		//s2 --> square
		//s1 có 4 cạnh bằng nhau --> square --> s1.calArea() --> s1 gọi hàm tính diện tích
		//của hính vuông , mình ko muốn tạo mới dữ liệu
		s1 = s2; //s1 --> square
		s1.calArea();
		
		//--> dễ dàng ép kiểu qua lại giữa các KDL cha-con
		//--> ko thể ép kiểu qua về nếu ko dùng đa hình trong đối tượng
		//Rectangle r99 = new Rectangle();
		//Square s99 = new Square();
		// r99 = s99; //--> error
		
		
		//Cá nhân --> trẻ sơ sinh, học sinh, sinh viên, nhân viên
		// Person p = new Student();
		// Person p2 = new Employee();
		
		//Vì sao phải áp dụng đa hình trong obj, lấy cha new con
		//mà ko phải new chính nó?
		
		//1. dễ ép kiểu giữa các KDL cha-con (compile tất cả đều là cha)
		//2. Tham số KDL cha có thể nhận than số KDL con khi truyền tham số (PolymorphismPassingParameterDemo)
		//3. Tạo ra 1 mảng có KDL cha và các phần tử trong mảng có thể là KDL cha, con
		
		Shape[] shapes = {shape, rectangle, square, s1, s2};
		System.out.println("length --> "+ shapes.length);
		
		//THỰC HÀNH: ko bắt buộc phải kế thừa, đa hình trong obj
		//KHI NÀO:
		// dữ liệu, chức năng chung của các KDL --> thừa kế cha, con(s)
		// cha, con(s) --> muốn khởi tạo đối tượng --> cha new con --> để có thể sử 1 2 3 phía trên
		
		
	}

}
