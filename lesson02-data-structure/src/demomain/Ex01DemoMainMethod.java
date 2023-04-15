package demomain;

public class Ex01DemoMainMethod {
	/*
	   Hàm main là nơi bắt đầu và kết thúc của
	   1 chương trình java
	 */
     public static void main(String[] args) {
    	 // Comment - Chú thích
    	 // Sysout --> phím tắt
    	 // println --in nd ra --> xuống hàng
    	 // print --> in ra và không xuống hàng
		System.out.println("1. Class name");
		System.out.println("2. Main method");
		
		//\n --> break line
		System.out.println("\n=========\n");
	    Ex01DemoMainMethod.printStarTriangle();
		
		System.out.println("\n=========\n");
		Ex01DemoMainMethod.printNumberTriangle();
	
     }
     
     /*
      classb --> chứa các hàm 
      
      public, private...: access modifier --> phạm vi truy cập
        public: Sử dụng trong class hiện tại và ở các class bất kì
        private: Sử dụng trong bản thân class chứa nó
        static: Sử dụng bằng cách lấy tên class chứa nó gọi đến nó
             class A{
                public stat
                private static returned_type method_name()
                    //body
             }
      */
     
     // Khai báo hàm/phương thức để in ra tam giác ngôi sao
     /*
        Hàm gồm 2 phần
        +Phần khai báo: ..
        . KDL trả về
        . tên hàm
        . [danh sách tham số(input) truyền vào]
        
        +Phần thân hàm:
        . Những đoạn code để xử lý bài toán
      */
     private static void printStarTriangle() {
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
     
     //Khai báo hàm/phương thức để in ra tam giác số

}
