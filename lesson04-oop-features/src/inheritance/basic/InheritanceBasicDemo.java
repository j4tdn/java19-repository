package inheritance.basic;

import java.util.Arrays;

public class InheritanceBasicDemo {

	public static void main(String[] args) {
		// Tạo ra danh sách các sách giáo khoa, sách tham khảo

				ClassicalBook cb1 = new ClassicalBook(1, "Toán", "Nhi Đồng", true);
				ClassicalBook cb2 = new ClassicalBook(2, "Lý", "Kim Đồng", false);
				ClassicalBook cb3 = new ClassicalBook(3, "Hóa", "Nhi Đồng", true);
				ClassicalBook cb4 = new ClassicalBook(4, "Sử", "Nhi Đồng", true);

				ReferenceBook rb1 = new ReferenceBook(5, "STK Toán", "Nhi Đồng", 12d);
				ReferenceBook rb2 = new ReferenceBook(6, "STK Lý 2", "Nhi Đồng", 8d);
				ReferenceBook rb3 = new ReferenceBook(7, "STK Văn", "Nhi Đồng", 22d);
				ReferenceBook rb4 = new ReferenceBook(8, "STK Công Nghệ", "Nhi Đồng", 2d);

				Book[] books = { cb1, cb2, cb3, cb4, rb1, rb2, rb3, rb4 };
				
				Book[] booksById = findBookByIds(books);
				System.out.println("booksById : " + Arrays.toString(booksById));
				
				Book[] booksByTax = findBookByTax(books);
				System.out.println("booksById : " + Arrays.toString(booksByTax));
				
	}
	
	// Hàm tìm sách có id < 6
	
	private static Book[] findBookByIds(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book : books) {
			if(book.getId() < 6) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static Book[] findBookByTax(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book : books) {
			//book!= null & book.getClass() == ReferenceBook.class
			if(book instanceof ReferenceBook) {
				if(((ReferenceBook)book).getTax() > 10);
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

}
