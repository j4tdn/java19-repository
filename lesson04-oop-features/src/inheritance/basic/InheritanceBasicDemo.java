package inheritance.basic;

import java.util.Arrays;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		ClassicalBook cb1 = new ClassicalBook(1, "Toán", "Nhi Đồng", true);
		ClassicalBook cb2 = new ClassicalBook(2, "Lý", "Nhi Đồng", false);
		ClassicalBook cb3 = new ClassicalBook(3, "Hóa", "Kim Đồng", true);
		ClassicalBook cb4 = new ClassicalBook(4, "Lịch Sử", "Kim Đồng", true);

		ReferenceBook rb1 = new ReferenceBook(5, "STK Toán 1", "Nhi Đồng", 12d);
		ReferenceBook rb2 = new ReferenceBook(6, "STK Lý 2", "Nhi Đồng", 8d);
		ReferenceBook rb3 = new ReferenceBook(7, "STK Văn", "Kim Đồng", 22d);
		ReferenceBook rb4 = new ReferenceBook(8, "STK Công nghệ", "Nhi Đồng", 2d);
		Book[] books = { cb1, cb2, cb3, cb4, rb1, rb2, rb3, rb4 };
//		Book[] booksByIds = findBooksByIds(books);
//		System.out.println("booksByIds --> " + Arrays.toString(booksByIds));
		
		Book[] booksByTax = findBooks(books);
		System.out.println("booksByIds --> \n" + Arrays.toString(booksByTax));
	}

	private static Book[] findBooksByIds(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			if (book.getId() < 6) {
				result[running++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static Book[] findBooks(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			//book !=null&&book.getClass()==ReferenceBook.class
			if (book instanceof ReferenceBook) {
				ReferenceBook rb=(ReferenceBook)book;
				if(rb.getTax()>10d)
				result[running++] = rb;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

}
