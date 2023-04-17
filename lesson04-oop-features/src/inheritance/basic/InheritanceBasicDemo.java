package inheritance.basic;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		// Sách giáo khoa: id, name, pushlisher, isNew
		// Sách tham khảo: id, name, pushlisher, tax

		ClassicalBook cb = new ClassicalBook(1, "Bi", "ND", true);
		System.out.println(cb);

	}
}
