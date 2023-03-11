package demomain;

public class Ex01DemoMainMethod {
	// Run --> Ctrl F11 --> chạy ra 1 mạch và in kết quả
	// Debug --> F11 --> chạy chi tiết từng dòng đến điểm dừng --> breakpoint
	
	/*
	 * Hàm main là nơi bắt đầu và kết thúc của 1 chương trình java
	 * --> public static void main(String[] args)
	 */
    public static void main(String[] args) {
    	// Comment - Chú thích
    	// sysout - phím tắt
    	// println --> in nội dung ra --> xuống hàng
    	// --> In ra và không xuống hàng
		System.out.println("1. Class name");
		System.out.println("2. Main method");
		
		// \n break line --> xuống hàng
		System.out.println("\n=======\n");
		Ex01DemoMainMethod.printStarTringle();
		Ex01DemoMainMethod.printNumberTriangle();
		
		System.out.println("\n=======\n");
		
	}
    /* 
     * class --> chứa các hàm
     *           Lưu ý: hàm không được chứa hàm bên trong
     * public, private: access modifier --> phạm vi truy cập
     *   public: sử dụng trong class hiện tại và ở các class bất kì
     *   private: sử dụng trong bản thân class chứa nó
     *   static: sử dụng bằng cách lấy tên class chứa nó gọi đến nó
     *          class A{
     *             public static void main(String[] args)
     *                A.method_name();
     *          }
     *          {
     *             private static returned_type method_name(  parame)
     *               //body
     *          }
     *          
     *          class B{
     *             public static void main(String[] args)
     *             A.method_name();
     *          }
     */
    
    /*
     * Khai báo hàm/phương thức để in ra tam giác ngôi sao *
     * Hàm gồm 2 phần
     *  + Phần khai báo: 
     *    KDL trả về,
     *    tên hàm, 
     *    danh sách tham số(input) truyền vào
     *  +Phần thân hàm:
     *    Những đoạn code để xử lí bài toán 
     */
    public static void printStarTringle() {
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
