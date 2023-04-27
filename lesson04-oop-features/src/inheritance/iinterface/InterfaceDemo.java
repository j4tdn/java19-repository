package inheritance.iinterface;

public class InterfaceDemo {
	public static void main(String[] args) {

		// problem: không thể khởi tạo một đối tượng interface

		// new KDL interface -> bắt buộc override abastract method của interface đó
		System.out.println("=== Cha new Cha");
		Shape c11 = new Shape() {

			@Override
			public void paint() {
				System.out.println("triangle -> paint");
			}

			@Override
			public void calArea() {
				System.out.println("Circle -> calArea");
			}
		};
		c11.paint();
		c11.calArea();

		System.out.println("\n=== Con new Con ===");
		Circle c2 = new Circle();
		c2.paint();
		c2.calArea();

		System.out.println("\n=== Cha new con ===");
		Shape c3 = new Circle();
		c3.calArea();
		c3.paint();
	}
}
