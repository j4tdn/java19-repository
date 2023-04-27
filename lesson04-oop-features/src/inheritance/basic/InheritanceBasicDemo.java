package inheritance.basic;

import java.util.Arrays;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		//Sach giao khoa: id, name, publisher, isNew
		//Sach tham khao: id, name, published, tax
		
		ClassicalBook cb1 = new ClassicalBook(1,"Toan", "Nhi Dong", true);
		ClassicalBook cb2 = new ClassicalBook(2,"Ly", "Nhi Dong", true);
		ClassicalBook cb3 = new ClassicalBook(3,"Hoa", "Kim Dong", true);
		ClassicalBook cb4 = new ClassicalBook(4,"Lich su", "Kim Dong", true);
		
		ReferenceBook rb1 = new ReferenceBook(5, "STK Toan1", "Nhi Dong", 12d);
		ReferenceBook rb2 = new ReferenceBook(6, "STK Ly1", "Nhi Dong", 8d);
		ReferenceBook rb3 = new ReferenceBook(7, "STK Van", "Kim Dong", 22d);
		ReferenceBook rb4 = new ReferenceBook(8, "STK Cong nghe", "Kim Dong", 2d);
		
		Book[] books = {cb1, cb2, cb3, cb4, rb1, rb2, rb3, rb4};
		
		//viet ham tim cuon sach co id <6
		
		Book[] booksByIds = findBooksByIds(books);
		System.out.println("BooksByIds -->\n" + Arrays.toString(booksByIds));
		//viet ham tim nhung cuon sach co thue lon hon 10%
		System.out.println("\n=========================================\n");
		Book[] booksByTaxs = findBooksByTaxs(books);
		System.out.println("BooksByTaxs -->\n" + Arrays.toString(booksByTaxs));
		
		
	}
	
	private static Book[] findBooksByIds(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			if(book.getId() < 6) {
				result[running++] = book;
			}
		}
		//copy real value to finalResult
		
		
		
		return Arrays.copyOfRange(result, 0, running);
		
	}
	private static Book[] findBooksByTaxs(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			//get class de lay runningtime
			//book != null && book.getClass() == ReferenceBook.class tuong duong voi book instanceof ReferenceBook
			if(book instanceof ReferenceBook) {
				//ReferenceBook rb = (ReferenceBook)book;
				if(((ReferenceBook)book).getTax() > 10) {
					result[running++] = book;
				}
			}
		}
		//copy real value to finalResult
		
		
		
		return Arrays.copyOfRange(result, 0, running);
		
	}
}
