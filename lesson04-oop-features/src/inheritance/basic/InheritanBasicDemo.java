package inheritance.basic;

import java.util.Arrays;

public class InheritanBasicDemo {
	public static void main(String[] args) {
		// sgk : id, name , published, isnew
		// s tham khaor : id, name, publisher, tax

		// tạo ra 1 ds các cuốn sách (GK,TK)

		ClassicalBook cb1 = new ClassicalBook(1, "toán", "Nhi Đồng", true);
		ClassicalBook cb2 = new ClassicalBook(2, "Hóa", "Nhi Đồng", false);
		ClassicalBook cb3 = new ClassicalBook(3, "Lý", "Nhi Đồng", true);
		ClassicalBook cb4 = new ClassicalBook(4, "Sử", "Nhi Đồng", true);

		ReferenceBook rb1 = new ReferenceBook(5, "STK 1", "Nhi đồng ", 12d);
		ReferenceBook rb2 = new ReferenceBook(7, "STK 2", "Nhi đồng ", 8d);
		ReferenceBook rb3 = new ReferenceBook(8, "STK 3", "Nhi đồng ", 22d);
		ReferenceBook rb4 = new ReferenceBook(9, "STK 4", "Nhi đồng ", 2d);

		Book[] books = { cb1, cb2, cb3, cb4, rb1, rb2, rb3, rb4 };
		// viết hàm tìm cuốn sách có id <6
		Book [] booksByids = findBookByid(books);
		System.out.println("booksByids-->"+Arrays.toString(booksByids));
		// viết hàm tìm cuốn sách có thuế >10%
		Book [] bookBytax = findBookByTax(books);
		System.out.println("bookbytax --->"+Arrays.toString(bookBytax));
	}

	private static Book[] findBookByTax(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			if (book instanceof ReferenceBook) {
				ReferenceBook rb = new ReferenceBook();
			}
			if (((ReferenceBook)book).getTax() >10) {
				result [running ++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	private static Book[] findBookByid(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			if (book.getId() < 6) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
}
