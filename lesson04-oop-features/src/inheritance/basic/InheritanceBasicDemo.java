package inheritance.basic;

import java.lang.annotation.Repeatable;
import java.util.Arrays;

import polymorphism.object.Rectangle;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		ClassicalBook cb1 = new ClassicalBook(1, "Toán", "Nhi Đồng", true);
		ClassicalBook cb2 = new ClassicalBook(2, "Lý"	, "Nhi Đồng", false);
		ClassicalBook cb3 = new ClassicalBook(3, "Hoá", "Kim Đồng", true);
		ClassicalBook cb4 = new ClassicalBook(4, "Lịch sử", "Kim Đồng", true);
		
		ReferenceBook rb1 = new ReferenceBook(5, "STK Toán", "Nhi Đồng", 12d);
		ReferenceBook rb2 = new ReferenceBook(6, "STK Lý", "Nhi Đồng", 8d);
		ReferenceBook rb3 = new ReferenceBook(7, "STK Văn", "Kim Đồng", 22d);
		ReferenceBook rb4 = new ReferenceBook(8, "STK Công Nghệ", "Kim Đồng", 2d);
		
		Book[] books = {cb1,cb2,cb3,cb4,rb1,rb2,rb3,rb4};
		
		Print(findBooksByIds(books));
		System.out.println("=".repeat(60));
		Print(findBooksByTax(books));
		
	}
	
	public static Book[] findBooksByIds(Book[] books) {
		Book[] searchListBook = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			if(book.getId() < 6) {
				searchListBook[i++] = book;
			}
		}
		
		Book[] result = Arrays.copyOfRange(searchListBook, 0, i);
		return result;
	}
	
	public static Book[] findBooksByTax(Book[] books) {
		Book[] searchListBook = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			// book != null && book.getClass() == ReferenceBook.class
			if(book instanceof ReferenceBook) {
				ReferenceBook referenceBook = (ReferenceBook)book;
				if(referenceBook.getTax() > 10) {
					searchListBook[i++] = referenceBook;
				}
			}
		}
		
		Book[] result = Arrays.copyOfRange(searchListBook, 0, i);
		return result;
	}
	
	public static void Print(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
