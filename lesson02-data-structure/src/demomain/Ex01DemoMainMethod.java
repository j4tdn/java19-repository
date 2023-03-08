package demomain;

public class Ex01DemoMainMethod {
	// Run --> Ctrl + F11
	// Debug --> F11 chạy chi tiết từng dòng đến khi gặp break point
	// Hàm main là nơi bắt đầu và kết thúc của 1 chương trình
	// public static void main(String[] args){}
	public static void main(String[] args) {
		/* Comments: 
		sysout --> phím tắt
		println --> in nội dung rồi xuống dòng
		print --> in ra và không xuống dòng
		*/
		System.out.println("1. Class name");
		System.out.println("2. Main method");
		// Ctrl + Alt + down button: copy a row
		// Ctrl + D xóa 1 dòng
		// Alt + UP di chuyển dòng
		
		// \n break line xuống hàng
		System.out.println("\n===============\n");
		
		System.out.println("\n===============\n");
		Ex01DemoMainMethod.printStarTriangle();
		
	}
	/*
	 * class --> chứa các hàm
	 * 			lưu ý: hàm không chứa định nghĩa hàm trong nhau
	 * public, private: access modifier --> phạm vi truy cập
	 * 		public: có thể sử dụng ở class hiện tại và class bất kì
	 * 		private: dùng trong bản thân class chứa nó
	 * 		static: Sử dụng bằng cách lấy tên của class chứa nó gọi đến nó
	 * 			ex: class A{
	 * 				public static void main(String[] agrs){
	 * 					A.method_name();
	 * 				}
	 * 				private static return_type method_name(..parameter){
	 * 					//body
	 * 				}
	 * 
	 * 				}
	 * 
	 * 				class B{
	 * 				public static void main(String[] agrs){
	 * 					A.method_name();
	 * 				}
	 * 				}
	 */
	// Khai báo hàm/phương thức để in ra tam giác *
	/*
	 Hàm gồm 2 phần:
	 	+  Phần khai báo: 
	 		kiểu dữ liệu trả về
	 		tên hàm
	 		Danh sách tham số (input) truyền vào 
	  	+ Phần thân hàm
	  		Những đoạn code để xử lí bài toán
	 */
	// Method name: Lowercase 1st letter, camel case (quy tắc lạc đà)
	 public static void printStarTriangle() {
			System.out.println("*");
			System.out.println("**");
			System.out.println("***");
			System.out.println("****");
			System.out.println("*****");
	 }
	 
	 private static void printNumberTriangle() {
			System.out.println("1");
			System.out.println("1 2");
			System.out.println("1 2 3");
			System.out.println("1 2 3 4");
			System.out.println("1 2 3 4 5");
	 }
	// Khai báo hàm/phương thức để in ra tam giác số
}
