package inheritance.iinterface;

public class InterfaceDemo {
	public static void main(String[] args) {
		// cha new cha
		// con new con
		// cha new con
		
		// vấn đề
		// k thể khởi tạo 1 đối tượng là interface
		
		// new Kdl interface --> bắt buộc
		// bắt buộc override abstract method của interface
		
		// tương tự như tạo class implenments từ interface
		//--> bắt buộc override abstract method của interface
		
		
		// anonymus inner type --> anonymous class
		// lớp ẩn danh
		System.out.println("cha new cha");
		Shape c3 = new Shape() {
			
			@Override
			public void paint() {
				 System.out.println("triangle --> paint");
				
			}
			
			@Override
			public void calArea() {
				 System.out.println("triangle --> calAre");
				
			}
		};
		c3.paint();
		c3.calArea();
		
		
		
		System.out.println("con new con");
		Circle c1 = new Circle();
		c1.paint();
		c1.calArea();
		
		System.out.println("cha new con");
		Shape c2 = new Circle();
		c2.paint();
		c2.calArea();
	}
}	
