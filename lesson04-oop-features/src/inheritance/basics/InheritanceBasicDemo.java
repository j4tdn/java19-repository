package inheritance.basics;

import java.util.Arrays;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		// sach giao khoa: id, name, price, publisher, isNew
		// sach tham khao: id, name, price, publisher, tax

		// tao ra danh sach books (ClassicalBook, RefrenceBook )

		ClassicalBook cb1 = new ClassicalBook(1, "HTML", 100, "P1", false);
		ClassicalBook cb2 = new ClassicalBook(2, "IT", 200, "P2", true);
		ClassicalBook cb3 = new ClassicalBook(3, "POSTGRE SQL", 300, "P3", false);
		ClassicalBook cb4 = new ClassicalBook(4, "JAVA", 400, "P4", true);

		ReferenceBook rb1 = new ReferenceBook(5, "CSS", 150, "P2", 12d);
		ReferenceBook rb2 = new ReferenceBook(6, "JS", 250, "P1", 8d);
		ReferenceBook rb3 = new ReferenceBook(7, "SPRING", 350, "P3", 22d);
		ReferenceBook rb4 = new ReferenceBook(8, "MYSQL", 450, "P2", 2d);

		Book[] books = { cb1, cb2, cb3, cb4, rb1, rb2, rb3, rb4 };
		
		// tim sach co id < 6
		Book[] bookByIds = findBookByIds(books);
		System.out.println("BookByIds --> \n"+ Arrays.toString(bookByIds));
		System.out.println("---------");
		
		// tim sach co tax > 10%
		Book[] bookByTax = findBookByTax(books);
		System.out.println("BookByTax --> \n"+ Arrays.toString(bookByTax));
		System.out.println("---------");

	}
	
	private static Book[] findBookByIds(Book[] books) {
		Book[] result = new Book[books.length];
		int i = 0;

		for (Book book : books) {
			if (book.getId() < 6) {
				result[i++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}

	private static Book[] findBookByTax(Book[] books) {
		Book[] result = new Book[books.length];
		int i = 0;

		for (Book book : books) {
			if (book instanceof ReferenceBook) {
				ReferenceBook referenceBook = (ReferenceBook)book;
				if (referenceBook.getTax() > 10) {
					result[i++] = referenceBook;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}
	

}
