package inheritance.basic;

import java.util.Arrays;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		// Sách giáo khoa: id, name, publisher, isNew
		// Sách tham khảo: id, name, published, tax
		
		// Tạo ra danh sách các cuốn sách(giáo khoa, tham khảo)
		
		ClassicalBook cb1 = new ClassicalBook(1, "Toán", "Nhi Đồng", true);
		ClassicalBook cb2 = new ClassicalBook(2, "Lý", "Nhi Đồng", false);
		
		ClassicalBook cb3 = new ClassicalBook(3, "Hóa", "Kim Đồng", true);
		ClassicalBook cb4 = new ClassicalBook(4, "Lịch Sử", "Kim Đồng", true);
		
		ReferenceBook rb1 = new ReferenceBook(5, "STK Toán 1", "Nhi Đồng", 12d);
		ReferenceBook rb2 = new ReferenceBook(6, "STK Lý 2", "Nhi Đồng", 8d);
		ReferenceBook rb3 = new ReferenceBook(7, "STK Văn", "Kim Đồng", 22d);
		ReferenceBook rb4 = new ReferenceBook(8, "STK Công Nghệ", "Kim Đồng", 2d);
		
		
		
		Book[] books = {cb1, cb2, rb3, rb4, rb1, rb2, cb3, cb4};
		
		// Viết hàm tìm những cuốn sách có id < 6
		Book[] booksByIds = findBooksByIds(books);
		System.out.println("booksByIds --> " + Arrays.toString(booksByIds));
		
		System.out.println("===(--___--)===");
		
		// Viết hàm tìm những cuốn sách có thuế > 10% [tham khảo]
		Book[] booksByTax = findBooksByTax(books);
		System.out.println("booksByTax --> " + Arrays.toString(booksByTax));
		
	}
	
	private static Book[] findBooksByTax(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			// book != null && book.getClass() == ReferenceBook.class
			if (book instanceof ReferenceBook) {
				if (((ReferenceBook)book).getTax() > 10) {
					result[running++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static Book[] findBooksByIds(Book[] books) {
		// cb1, cb2, rb1, cb3, cb3, null, null, null
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			if (book.getId() < 6) {
				result[running++] = book;
			}
		}
		// running = 5 (số phần tử thật sự cần lưu trong mảng result)
		// copy real value to finalResult
		// copyOfRange(original, fromInclusive, toExclusive) --> [fromInclusive, toExclusive)
		return Arrays.copyOfRange(result, 0, running);
	}
}
