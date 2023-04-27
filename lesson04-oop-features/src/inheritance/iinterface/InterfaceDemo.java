package inheritance.iinterface;

public class InterfaceDemo {
	public static void main(String[] args) {
		// Cha new Cha
		// Con new Con
		// Cha new Con
		
		// ? Vấn đề: 
		// Không thể khởi tạo 1 đối tượng là interface
		
		// new KDL interface
		// --> bắt buộc override abstract method của interface đó
		
		System.out.println("=== Cha new Cha ===");
		Shape c1 = new Shape() {
			
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
