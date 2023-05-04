package polymorphism.object;

public class PolymorphismDemo {
	public static void main(String[] args) {
		// Lớp con kế thừa từ lớp cha
		// Lớp con không bắt buộc phải override các phương thức từ lớp cha
		
		// Shape    : paint, calArea
		// Rectangle: paint, calArea, setBackground(-)
		// Square   : paint, calArea
		
		// compile(gõ code, save, javac fn.java) --> biên dịch lỗi
		// runtime(java fn) --> chạy và tạo/quản lý vùng nhớ stack, heap
		
		// Class c = new Class()
		// Biến c --> lúc compile là KDL Class
		// Biến c --> lúc runtime là KDL Class
		
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
		
		// ----- Đa hình trong đối tượng ---- //
		// Là 1 đối tượng lúc là thể hiện này, lúc là thể hiện khác
		// Là 1 biến KDL đối tượng lúc runtime có thể là thể hiện KDL của chính nó
		// hoặc là thể hiện của KDL lớp con
		
		System.out.println("\n======================\n");
		
		// 1 2 1 2
		Shape s1 = new Rectangle();
		s1.paint();   // --> 
		s1.calArea(); // -->
		
		Shape s2 = new Square();
		s2.paint();
		s2.calArea();
		
		System.out.println("========================");
		
		// s1 --> rect
		// s2 --> square
		// s1 --> 4 cạnh bằng nhau --> square --> s1.calAre() --> s1 gọi hàm tính dịch tích
		// của hình vuông, mình k muốn tạo mới dữ liệu
		s1 = s2; // s1 --> square
		s1.calArea();
		// --> dễ dàng ép kiểu qua về giữa các KDL cha con
		// --> không thể ép kiểu qua về nếu k dùng đa hình trong đối tượng
		// Rectangle r99 = new Rectangle();
		// Square s99 = new Square();
		// r99 = s99;
		
		// Cá nhân --> trẻ sơ sinh, học sinh, sinh viên, nhân viên
		// Person p = new Student()
		// Person p2 = new Employee();
		
		// Vì sao phải áp dụng đa hình trong đối tượng, lấy cha new con
		// mà không phải new chính nó
		
		// 1. Dễ dàng ép kiểu qua về giữa các KDL cha con (compile tất cả đều là kiểu cha)
		// 2. Tham số KDL cha có thể nhận giá trị của KDL con khi truyền tham số qua hàm
		// 3. Tạo ra 1 mảng có KDL cha và các phần tử trong mảng có thể là KDL cha, con
	
		// Yêu cầu: Tạo danh sách các phần tử là Shape, Square, Rectangle, Circle
		Shape[] shapes = {shape, rectangle, square, s1, s2};
		System.out.println("length --> " + shapes.length);
		
		// Square[] squares = {square, rectangle};
		
		// THỰC HÀNH --> ko bắt buộc phải kế thừa, đa hình trong đối tượng
		// KHI NÀO
		// dữ liệu, chức năng chung của các KDL --> thừa kế cha, con(s)
		// cha, con(s) --> muốn khởi tạo đối tượng --> cha new con --> để có thể sử 1 2 3 phía trên
	}
}
