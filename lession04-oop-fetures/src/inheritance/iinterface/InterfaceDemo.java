package inheritance.iinterface;

public class InterfaceDemo {
	public static void main(String[] args) {
		// Cha new cha
		// Cha new con
		// Con new con
		
		System.out.println("\n============= Cha new cha ===============");
		
		Shape shape = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Triangle --> paint...");
			}
			
			@Override
			public void calArea() {
				System.out.println("Triangle --> calArea...");
			}
		};
		
		shape.paint();
		shape.calArea();
		
		System.out.println("\n============= Cha new con ===============");
		
		Shape shape2 = new Circle();
		shape2.paint();
		shape2.calArea();
		
		System.out.println("\n============= Con new con ===============");
		
		Circle cicle = new Circle();
		cicle.paint();
		cicle.calArea();
	}
}
