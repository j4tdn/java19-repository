package inheritance.iinterface;

public class InterfaceDemo {
	public static void main(String[] args) {
		System.out.println("==== Con new Con ====");
		Circle c1 = new Circle();
		c1.paint();
		c1.calArea();
		
		System.out.println("==== Cha new Con ====");
		Shape c2 = new Circle();
		c2.paint();
		c2.calArea();
		
		System.out.println("==== Cha new Cha ====");
		Shape c3 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Triangle ---> paint");
			}
			
			@Override
			public void calArea() {
				System.out.println("Triangle ---> calArea");
			}
		};
		c3.paint();
		c3.calArea();
	}
}
