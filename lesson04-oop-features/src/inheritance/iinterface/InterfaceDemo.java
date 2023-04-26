package inheritance.iinterface;

public class InterfaceDemo {
	public static void main(String[] args) {
		System.out.println("== Cha new cha ==");
		Shape c11 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Triangle --> paint");
			}
			
			@Override
			public void calArea() {
				System.out.println("Triangle --> calArea");
			}
		};
		c11.paint();
		c11.calArea();
		
		System.out.println("\n== Con new con ==");
		Circle c2 = new Circle();
		c2.paint();
		c2.calArea();
		
		System.out.println("\n== Cha new con ==");
		Shape c3 = new Circle();
		c3.paint();
		c3.calArea();
	}
}
