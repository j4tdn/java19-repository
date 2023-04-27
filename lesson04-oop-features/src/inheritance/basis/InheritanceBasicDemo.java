package inheritance.basis;

import java.util.ArrayList;
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
		ReferenceBook rb4 = new ReferenceBook(8, "STK Công Nghệ", "Kim Đồng", 2d);
	
		Book[] book = {cb1, cb2, cb3, cb4, rb1, rb2, rb3, rb4};
		Book[] result = findBookByTax(book);
		System.out.println(Arrays.toString(result));
//		for(Book results : result) {
//			System.out.println(results);
//		}
	}
	private static Book[] findBooksByIds(Book[] books) {
		Book[] result = new Book [books.length];
		int count = 0;
		for(Book book : books) {
			if(book.getId() < 6) {
				result[count++] = book;
			}
		}
		System.out.println(count);
		return Arrays.copyOfRange(result, 0, count);
	}
	private static Book[] findBookByTax(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book book: books) {
		//	if(book != null && book.getClass() == ReferenceBook.class) {
			if(book instanceof ReferenceBook) {
				if(((ReferenceBook)book).getTax() > 10) {
					result[count++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
