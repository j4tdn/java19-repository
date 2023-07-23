package demomain;

public class Ex01DemoMainMethod {
	//Run --> Ctrl F11
	//Debug --> F11 --> Chạy chi tiết từng dòng
	//đến điểm dừng --> breakpoint
	
	/*
	 * println --> In ra nội dung --> xuống hàng
	 * print --> in ra và không xuống hàng
	 */
	public static void main(String[] args) {
		System.out.println("1. Class name");
		System.out.println("2. Main method");
		
		// \n --> break line --> xuống hàng
		System.out.println("\n==========\n");
	     Ex01DemoMainMethod.printStarTriangle();
		
		
		
		System.out.println("\n==========\n");
		Ex01DemoMainMethod.printNumberTriangle();
		
	}
	/*
	 * class --> chứa các hàm 
	  public, private... : access modifier --> phạm vi truy cập
	  public: Sử dụng trong class hiện tại và ở các class bất kì
	  private: Sử dụng trong bảng thân class chứa nó
	  static: Sử dụng bằng cách lấy tên class chứa nó gọi đến nó
	  		class A{
	  		public static void main (String[] agrs){
	  			A.method_name();
	  		}
	  		private static returned_type method_name(..parameters..){
	  			//body
	  		}
	  		class B{
	  		public static void main (String[] agrs){
	  			A.method_name();
	  		
	  		}
	 */
	/*
	 * Hàm gồm 2 phần 
	       + phần khai báo: . KDL trả về
	                        . tên hàm
	                        . Danh sách tham số(input) truyền vào
	        +Phần thân hàm:
	        .Những đoạn code để xử lý bài toán
	                        
	 */
	   public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
	}
	private static void printNumberTriangle() {
		System.out.println("1 2 3 4 5");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3");
		System.out.println("1 2");
		System.out.println("1");
			
	}
	
}
