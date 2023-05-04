package inheritance.basic;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		// Sách giáo khoa: id, name, publisher, isNew
		// Sách tham khảo: id, name, published, tax
		
		ClassicalBook cb = new ClassicalBook(1, "B1", "ND", true);
		System.out.println(cb);
	}
}
