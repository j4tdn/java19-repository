package inheritance.basic;

import java.util.Arrays;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		ClassicalBook cb1 = new ClassicalBook(1, "Toan", "Nhi Dong", true);
		ClassicalBook cb2 = new ClassicalBook(2, "Ly", "Nhi Dong", true);
		ClassicalBook cb3 = new ClassicalBook(3, "Hoa", "Kim Dong", true);
		ClassicalBook cb4 = new ClassicalBook(3, "Lich su", "Kim Dong", true);

		ReferenceBook rb1 = new ReferenceBook(5, "STK Toan 1", "Nhi Dong", 12d);
		ReferenceBook rb2 = new ReferenceBook(6, "STK Ly 2", "Nhi Dong", 8d);
		ReferenceBook rb3 = new ReferenceBook(7, "STK Van", "Kim Dong", 22d);
		ReferenceBook rb4 = new ReferenceBook(8, "STK Cong nghe", "Kim Dong", 2d);

		Book[] books = { cb3, cb1, cb2, cb4, rb3, rb4, rb1, rb2 };

		System.out.println("Books by ID --> \n" + Arrays.toString(findBooksById(books)));

		System.out.println("Books by Tax --> \n" + Arrays.toString(findBooksByTax(books)));
	}

	// Viet ham tim nhung cuon sach co id be hon 6
	private static Book[] findBooksById(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			if (book.getId() < 6) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	// Viet ham tim cuon sach co thue > 10%

	private static Book[] findBooksByTax(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		
		for (Book book : books) {
			if(book instanceof ReferenceBook) {
				if (((ReferenceBook)book).getTax() > 10) {
					result[running++] = book;
				}
			}
			
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}
