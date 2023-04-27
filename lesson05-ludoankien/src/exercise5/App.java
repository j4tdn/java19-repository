package exercise5;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		Book[] books = getAll();
		//show(books);
		Book[] result = getBooks(books, "NhiDong");
		
		show(result);
	}
	
	private static Book[] getBooks(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		int i = 0;
		
		for(Book book: books) {
			if(book.getPublisher().contains(publisher)) {
				result[i++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, i);
	}
	

	private static Book[] getBooks(Book[] books) {
		Book[] result = new Book[books.length];
		int i = 0;
		for(Book book: books) {
			if(book.getCost() < 50) {
				result[i++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, i);
	}
	

	private static void show(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}

	private static Book[] getAll() {

		Book t1 = new TextBook("SGK01", 20, "BGD", Status.NEW);
		Book t2 = new TextBook("SGK02", 10, "NhiDong", Status.NEW);
		Book t3 = new TextBook("SGK03", 12, "NhiDong", Status.OLD);
		Book t4 = new TextBook("SGK04", 34, "VietNam", Status.OLD);
		Book t5 = new TextBook("SGK05", 36, "AuCo", Status.NEW);

		Book r1 = new ReferenceBook("STK01", 68, "NhiDong", 6);
		Book r2 = new ReferenceBook("STK02", 54, "NhiDong", 6);
		Book r3 = new ReferenceBook("STK03", 46, "VietNam", 12);
		Book r4 = new ReferenceBook("STK04", 28, "NhiDong", 6);
		Book r5 = new ReferenceBook("STK05", 96, "AuCo", 8);

		return new Book[] { t1, t2, t3, t4, t5, r1, r2, r3, r4, r5 };

	}

}
