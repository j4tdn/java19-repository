package Inheritance.basic;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		// sach giao khoa: id, name, price, publisher, isNew
		// sach tham khao: id, name, price, publisher, tax
		ClassicalBook cb = new ClassicalBook(1, "B1", 100, "P1", false);
		System.out.println(cb);
	}
}
