package inheritance.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		// Sách giáo khoa: id, name, publisher, isNew
		// Sách tham khảo: id, name, published, tax
		
//		ClassicalBook cb = new ClassicalBook(1, "B1", "ND", true);
//		System.out.println(cb);
		
		ClassicalBook cb1 = new ClassicalBook(1, "Toan", "Nhi Dong", true);
		ClassicalBook cb2 = new ClassicalBook(2, "Ly", "Nhi Dong", true);
		ClassicalBook cb3 = new ClassicalBook(3, "Hoa", "Nhi Dong", true);
		ClassicalBook cb4 = new ClassicalBook(4, "Lich Su", "Nhi Dong", true);
		
		ReferenceBook rb1 = new ReferenceBook(5, "STK Toan", "Nhi Dong", 12d);
		ReferenceBook rb2 = new ReferenceBook(6, "STK Toan", "Nhi Dong", 8d);
		ReferenceBook rb3 = new ReferenceBook(7, "STK Toan", "Nhi Dong", 22d);
		ReferenceBook rb4 = new ReferenceBook(8, "STK Toan", "Nhi Dong", 2d);
		
		Book[] books = {cb1, cb2, cb3, cb4, rb1, rb2, rb3, rb4};
		
		// viet ham tim nhung cuon sach co id < 6
		
		// viet ham tim nhung cuon sach co thue > 10%
		
//		Book[] bookByIds = findBooksByIds(books);
//		System.out.println(Arrays.toString(bookByIds));
		Book[] bookByTax = findBooksByTax(books);
		System.out.println(Arrays.toString(bookByTax));
	}
	
	private static Book[] findBooksByIds(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book:books) {
			if(book.getId() < 6) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static Book[] findBooksByTax(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book:books) {
			//book != null && book.getClass() == ReferenceBook.class
			if(book instanceof ReferenceBook) {
				ReferenceBook rb = (ReferenceBook)book;
				if(rb.getTax() > 10) {
					result[running++] = rb;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}
