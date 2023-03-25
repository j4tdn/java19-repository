package demomain;

public class Ex01DemoMainMethod {
	// Run --> Ctrl F11
	//Debug --> f1 --> chạy chi tiếc từng dong 
	// đến điểm dừng --> breakpoint
	/*
	 * ham main  la noi bat dau 
	 * va ket thuc cua 1 
	 * chuong trinh java
	 */
	public static void main(String[] args) {
		//Comment - chu thich
		// sysout - phim tat
		// println --> in ra noi dung --> xun hang
		// print --> in ra noi dung --> ko xun hang
		
		System.out.println("1. Class name");
		System.out.println("2. Main methods");
		// \n --> break line --> xuong hang
		System.out.println("\n=========\n");
		System.out.println("\n=========\n");
		Ex01DemoMainMethod.printStarTriangle();
		Ex01DemoMainMethod.printNumberTriangle(); 
				
	}
	/*
	  class --> chứa các hàm
	            lưu ý : hàm không được chứa hàm bên trong
	  public, private : access modifier --> phạm vi truy cập
	    public: sử dụng trong class hiện tại và ở trong các class bất kì
	    private : sử dụng trong bản thân class chứa nó
	    static : sử dụng bằng cách lấy tên class chứa nó gọi đến nó
	       class A {
	        public static void main(String[] agrs) {
	        A.method_name();
	        }
	        private static returned_type method_name(....){
	        //body
	        }
	       }
	       
	       class B {
	       public static void main(String[] agrs) {
	        A.method_name();
	       }
	      
	 */
	
	// khai báo hàm/phương thức để in ra tam giác ngôi *
	/*
	 * hàm gồm 2 phần
	       + phần khai báo :...
	                   .kiểu dữ liệu  trả về,
	                   .tên hàm , 
	                   .danh sách tham số(input truyền vào)
	 *       +Phần thân hàm:
	 *                 . Những đoạn code để xử lý bài toán
	 *                 . 
	 *       
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
	
	// khai báo hàm/phương thức để in ra tam giác số 

}
