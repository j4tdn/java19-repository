package demomain;

public class Ex01DemoMainMethod {
	// Hàm main là nơi bắt đầu và kết thúc của 1 chương trình java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Comment - Chú thích
		// sysout - phím tắt
		// println --> In ra nội dung không xúông hàng
		// print --> In ra xúông hàng

		System.out.println("1. Class name");
		System.out.println("2. Main method");
		
		System.out.println("\n========\n");
		
		printStarTriangle();
	}
	/*
	 class --> chứa các hàm
	 public, private --> access modifier --> phạm vi truy cập
	 public : sử dụng trong class hiện tại và ở các class bất lì
	 private : sử dụng trong bản thân class chứa nó
	 static : sử dụng bằng cách lấy tên class chứa nó gọi đến nó
	 
	*/
	
	// Khai báo hàm / phương thức để in ra tam giác ngôi *
	/*
	 hàm gồm 2 phần
	 + Phần khai báo: 
	 - Kdl trả về
	 - tên hàm
	 - danh sách tham số (input) truyền vào
	 + Phần thân hàm
	 Những đoạn code để xử lý bài toán
	*/
	private static void printStarTriangle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
	}

}
