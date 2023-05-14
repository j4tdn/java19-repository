package inheritance.iinterface;

public class InterfaceDemo {
	
	// chưa khởi tạo ô nhớ
	
	public static void main(String[] args) {
		// Cha new Cha
		// Con new Con
		// Cha new Con
		
		// Vấn đề
		// Không thể khởi tạo 1 đối tượng là interface
		
		// new KDL interface
		// --> bắt buộc override abstract method của interface đó
		
		// tương tự như tạo class implements từ interface
		// --> bắt buộc override abstract method của interface đó
		
		System.out.println("=== Cha new Cha ===");
		Shape c1 = new Shape() {
			
			// anonymous inner type --> anonymous class
			// lớp ẩn danh
			
			@Override
			public void paint() {
				System.out.println("Triangle --> paint");
			}
			
			@Override
			public void calArea() {
				System.out.println("Triangle --> calArea");
			}
		};
		c1.paint();
		c1.calArea();
		
		System.out.println("=== Cha new Cha ===");
		Shape c11 = new Shape() {
			
			// anonymous inner type --> anonymous class
			// lớp ẩn danh
			
			@Override
			public void paint() {
				System.out.println("Circle --> paint");
			}
			
			@Override
			public void calArea() {
				System.out.println("Circle --> calArea");
			}
		};
		c11.paint();
		c11.calArea();
		
		System.out.println("\n=== Con new Con ===");
		Circle c2 = new Circle();
		c2.paint();
		c2.calArea();
		
		System.out.println("\n=== Cha new Con ===");
		Shape c3 = new Circle();
		c3.paint();
		c3.calArea();
	}
}
