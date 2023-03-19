package demomain;

public class Ex01DemoMainMethod {
	// Run --> Ctrl F11 --> Chạy 1 mạch và in kq
	// Debug --> F11 --> Chạy chi tiết từng dòng
	// đến điểm dừng --> breakpoint
	
	/*
	 Hàm main là nơi bắt đầu 
	 và kết thúc của 1 chương trình Java 
	 --> public static void main(String[] args)
	 */
	public static void main(String[] args) {
		// Comment - Chú thích
		// sysout --> phím tắt
		// println --> In nội dung ra --> xuống hàng
		// print --> In ra và không xuống hàng
		System.out.println("1. Class name");
		System.out.println("2. Main method");
		
		// \n --> break line --> xuống hàng
		System.out.println("\n=============\n");
		printStarTriangle();
		
		System.out.println("\n=============\n");
		printNumberTriangle();
	}
	
	/*
	 class --> chứa các hàm
	           lưu ý: hàm ko được chứa hàm bên trong
	 
	 public, private ...: access modifier --> phạm vi truy cập
	   public: Sử dụng trong class hiện tại và ở các class bất kỳ
	   private: Sử dụng trong bản thân class chứa nó	
	   static: Sử dụng bằng cách lấy tên class chứa nó gọi đến nó
	    	class A {
	    	   public static void main(String[] agrs) {
	    	       A.method_name();
	    	   }
	    	   
	    	   public static returned_type method_name(.. parameters..) {
	    	      // body
	    	   }
	    	}
	    	
	    	class B {
	    	   public static void main(String[] agrs) {
	    	       A.method_name();
	    	   }
	    	}
	 */
	
	/* 
	  	Khai báo hàm/phương thức để in ra tam giác ngôi sao
	 	Hàm gồm 2 phần
	 		+ Phần khai báo: 
	 			. KDL trả về 
	 			. Tên hàm 
	 			. [Danh sách tham số(input) truyền vào]
	 		+ Phần thân hàm:
	 			. Những đoạn code để xử lý bài toán
	 */
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
	
	// Khai báo hàm/phương thức để in ra tam giác ngôi số 
}
