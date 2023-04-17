package polymorphism.object;

public class polymorlismDemo {
	public static void main(String[] args) {
		//class con ke thua tu class cha
		//class con khong bat buoc override method cua class cha
		
		//compile( code, save, javac ) --> bien dich loi
		//runtime (java ) --> run, create, quan ly vung nho stack, heap

		Shape shape = new Shape();
		shape.calArea();
		shape.paint();
		
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calArea();
		rectangle.setBackground();
		
		Square square = new Square();
		square.calArea();
		square.paint();
		
		System.out.println("--------------");
		
		Shape s1 = new Rectangle();
		s1.paint();
		s1.calArea();
		
		Shape s2 = new Square();
		s2.paint();
		s2.calArea();
	}
}
