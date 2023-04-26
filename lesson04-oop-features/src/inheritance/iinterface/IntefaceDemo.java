package inheritance.iinterface;

public class IntefaceDemo {
     public static void main(String[] args) {
    	 
    	 
    	 //Van de
    	 //Khong the khoi tao 1 doi tuong la interface
    	 
    	 //new KDL inteface
    	 // --> bắt buộc override abstract method của interface đó
    	 
    	 // tương tự như tạo class implements từ interface 
    	 // --> bắt buộc override abstract methos của interface 
    	 
    	 
		System.out.println("=== Cha new Cha ===");
		Shape c1 = new Shape() {
			//anonymous inner type --> anonymous class
			//lop an danh
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
