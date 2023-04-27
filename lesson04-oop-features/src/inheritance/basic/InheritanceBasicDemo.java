package inheritance.basic;

import java.util.Arrays;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		// Sách giáo khoa: id, name, pushlisher, isNew
		// Sách tham khảo: id, name, pushlisher, tax

		ClassicalBook cb1 = new ClassicalBook(1, "Toán", "Nhi Đồng", true);
		ClassicalBook cb2 = new ClassicalBook(2, "Lý", "Nhi Đồng", false);
		ClassicalBook cb3 = new ClassicalBook(3, "Hóa", "Kim Đồng", true);
		ClassicalBook cb4 = new ClassicalBook(4, "Lịch Sử", "Kim Đồng", true);

		ReferenceBook rb1 = new ReferenceBook(5, "STK Toán 1", "Nhi Đồng", 12d);
		ReferenceBook rb2 = new ReferenceBook(6, "STK Lý 2", "Nhi Đồng", 8d);
		ReferenceBook rb3 = new ReferenceBook(7, "STK Văn", "Kim Đồng", 22d);
		ReferenceBook rb4 = new ReferenceBook(8, "STK Công Nghệ", "Kim Đồng", 2d);

		Book[] books = { cb1, cb2, cb3, cb4, rb1, rb2, rb3, rb4 };

		// Viết hàm tìm những cuốn sách có id < 6
		System.out.println("booksByIds --> " + Arrays.toString(findBooksByIds(books)));

		System.out.println("=======================================================");
		
		// Viết hàm tìm những cuốn sách ó thuế > 10%
		System.out.println("booksByTax --> " + Arrays.toString(findsByTax(books)));
	}

	private static Book[] findBooksByIds(Book[] books) {
		Book[] searchedBooks = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			if (book.getId() < 6)
				searchedBooks[i++] = book;
		}
		return Arrays.copyOfRange(searchedBooks, 0, i);
	}

	private static Book[] findsByTax(Book[] books) {
		Book[] searchedBooks = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			if(book instanceof ReferenceBook) {
				if(((ReferenceBook) book).getTax() > 10) {
					searchedBooks[i++] = book;
				}
			}
		}
		return Arrays.copyOfRange(searchedBooks, 0, i);
	}

}
