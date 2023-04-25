package inheritance.iinterface;

public class InterfaceDemo {
	public static void main(String[] args) {
		// Cha new Cha
		// Con new Con
		// Con new Cha
		Shape c1 = new Shape() {
			
			@Override
			public void paint() {
				// TODO Auto-generated method stub
				System.out.println("Triangle -- paint");
			}
			
			@Override
			public void calArea() {
				// TODO Auto-generated method stub
				System.out.println("Triangle -- calArea");
			}
		};
		System.out.println("Cha new Cha");
		c1.paint();
		c1.calArea();
		
		
		Circle c2 = new Circle();
		System.out.println("Con new Con");
		c2.paint();
		c2.calArea();

		
		Shape c3 = new Circle();
		System.out.println("Cha new Con");
		c3.paint();
		c3.calArea();
	}
}
