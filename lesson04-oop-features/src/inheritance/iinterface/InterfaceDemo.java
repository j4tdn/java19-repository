package inheritance.iinterface;

public class InterfaceDemo {
	public static void main(String[] args) {
		//cha new cha 
		//con new con
		//cha new con
		
		System.out.println("Cha new Cha");
		Shape c11 = new Shape() {
			
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
		
		System.out.println("Con new con");
		Circle c2 = new Circle();
		c2.paint();
		c2.calArea();
		
		System.out.println("Cha new con");
		Shape c3 = new Circle();
		c3.paint();
		c3.calArea();
		
	}

}
