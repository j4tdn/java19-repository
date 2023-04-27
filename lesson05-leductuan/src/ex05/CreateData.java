package ex05;

import java.util.Arrays;

public class CreateData {
	public static void main(String[] args) {
		
		ClassicalBook cb1 = new ClassicalBook(1,100000, "Nhi Dong", true);
		ClassicalBook cb2 = new ClassicalBook(2,20000, "Nhi Dong", true);
		ClassicalBook cb3 = new ClassicalBook(3,30000, "Kim Dong", true);
		
		
		ReferenceBook rb1 = new ReferenceBook(5, 30000, "Nhi Dong", 12d);
		ReferenceBook rb2 = new ReferenceBook(6, 45000, "Kim Dong", 8d);
		
		
		Book[] books = {cb1,cb2,cb3,rb1,rb2};
		
		Book[] booksByPlsNhiDong = findBooksByPlsNhiDong(books);
		System.out.println("BooksByPlsNhiDong -->\n" + Arrays.toString(booksByPlsNhiDong));
		
		
	}
	public static Book[] findBooksByPlsNhiDong(Book[] books) {
		
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			if(book.getPublisher() == "Nhi Dong") {
				result[running++] = book;
			}
		}
		
		
		return Arrays.copyOfRange(result, 0, running);
	}
	
	
}
