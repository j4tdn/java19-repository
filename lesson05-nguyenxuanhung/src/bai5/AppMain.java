package bai5;

import java.util.Arrays;

public class AppMain {
	public static void main(String[] args) {
		
		Customer customer = new Customer("ID01", "Hung", "01234566", "Hue");
		
		Book[] books = createBooks();
		System.out.println(Arrays.toString(findBookByPublisher(books)));
		System.out.println("===================");
		System.out.println(Arrays.toString(findBookByPrice(books)));
		System.out.println("==============");
		System.out.println(Arrays.toString(findBookSGKByPrice(books)));
	}

	public static Book[] createBooks() {
		BookGK bookGK1 = new BookGK("SGK1", 10, "Nhi Dong", "new");
		BookGK bookGK2 = new BookGK("SGK2", 20, "Nhi Dong 2", "new");
		BookGK bookGK3 = new BookGK("SGK3", 139, "Nhi Dong", "new");

		BookTK bookTK1 = new BookTK("STK1", 150, "Kim Dong", 0.2);
		BookTK bookTK2 = new BookTK("STK2", 15, "Nhi Dong", 0.3);
		Book[] books = { bookGK1, bookGK2, bookGK3, bookTK1, bookTK2 };
		return books;
	}
	
	public static Book[] findBookByPublisher(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			if("Nhi Dong".equals(book.getPublisher())){
				result[running++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, running);
	}
	
	public static Book[] findBookByPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			if(book.getPrice() < 50){
				result[running++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, running);
	}
	
	public static Book[] findBookSGKByPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			Class<?> bookRunTimeClass = book.getClass();
			if(bookRunTimeClass == BookGK.class) {
				if(book.getPrice() >= 100 && book.getPrice() <= 200){
					result[running++] = book;
				}
			}			
		}
		
		return Arrays.copyOfRange(result, 0, running);
	}
	

}
