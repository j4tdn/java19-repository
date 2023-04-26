package inheritance.iinterface;

public class InterfaceDemo {

	public static void main(String[] args) {
		// Cha new Cha
		// Con new Con
		// Cha new Con

		// Không thể khởi tạo đối tượng là interface
		// new KDL interface
		// thì bắt buộc: override abstract method của interface đó

		// Cha new Cha
		// Shape c1 = new Shape(); //ko cho phép
		// c1.paint();
		// c1.calArea();

		// anonymous inner type --> anonymous class
		Shape c1 = new Shape() {

			@Override
			public void paint() {
				System.out.println("Trianle --> paint");
			}

			@Override
			public void calArea() {
				System.out.println("Trianle --> calArea");

			}
		};

		// Con new Con
		Circle c2 = new Circle();
		c2.paint();
		c2.calArea();

		// Cha new Con
		Shape c3 = new Circle();
		c3.paint();
		c3.calArea();
	}

}
