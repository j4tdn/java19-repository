package demomain;

public class Ex01DemoMainMethod {
	//	Run --> Ctrl F11
	//	Debug --> F11 --> run each line 
	//	stop at breakpoint
	//	toggle breakpoint --> double click at blue bar on the left side
	//	step over , step into
	
	/*
	 * Ham main la noi bat dau 
	 * va ket thuc cua 1 chuong trinh
	 * Ham khong chua ham khac duoc --> chu y { }
	 */
	public static void main(String[] args) {
		// Comment - take note
		//sysout --> phim tat
		//println --> in noi dung ra --> xuong hang
		//print --> in ra va khong xuong hang
		System.out.println("1. Class name");
		System.out.println("2. Main method");
		
		//\n break line --> xuong hang
		System.out.println("\n=========\n");
		printStarNumber();
		
		System.out.println("\n=========\n");
		printStarTriagle();
	}
	
	/*
	  class include method
	  
	  public, private: access modifier --> pham vi truy cap
	  	.public: can use method in own class and another class
	  	.private can use only in own class
	  	.static : using by --> class_name.method_name
	  		class A {
	  			public static void main(String[] args) {
	  				A.method_name();
	  			}
	  			public static returned_type method_name(para...){
	  			  //body
	  			}
	  			
	  		class B {
	  			public static void main(String[] args) {
	  				A.method_name();  --> depend on access modifier of method
	  			}
	 */
	
	// khai bao ham/phuong thuc de in ra tam giac *
	/*
	  method has 2 parts:
	  	+ declare: 
	  		. data type of return
	  		. method name
	  		. [danh sach tham so (input) truyen vao]
	  		
	  	+ body
	  		.nhung doan code de xu ly bai toan
	 */
	public static void printStarTriagle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
	}
	
	// khai bao ham/phuong thuc de in ra tam giac so
	// Alt ↑ --> move up
	private static void printStarNumber() {
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
