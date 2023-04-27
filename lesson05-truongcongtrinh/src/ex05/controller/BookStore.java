package ex05.controller;

import java.util.Arrays;

import ex05.model.Book;
import ex05.model.ReferenceBook;
import ex05.model.TextBook;

public class BookStore {
	private static Book[] books;

	public BookStore() {
		Book tb1 = new TextBook("SGK01", 50, "Nhi Đồng", true);
		Book tb2 = new TextBook("SGK02", 30, "Kim Đồng", false);
		Book tb3 = new TextBook("SGK03", 60, "Kim Đồng", false);

		Book rb1 = new ReferenceBook("STK001", 40, "Nhi Đồng", 20);
		Book rb2 = new ReferenceBook("STK002", 60, "Kim Đồng", 50);
		books = new Book[] { tb1, tb2, tb3, rb1, rb2 };
	}

	// Implement get Array Data
	public Book[] getBookArrays() {
		return books;
	}

	// Implements Show Nhi Đồng's Book
	public Book[] findBooksByPublisher() {
		Book[] searchedBooks = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			if ("Nhi Đồng".equals(book.getPublisher()))
				searchedBooks[i++] = book;
		}
		return Arrays.copyOfRange(searchedBooks, 0, i);
	}

	public Book[] findBooksByPrice50() {
		Book[] searchedBooks = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			if (book.getPrice() < 50)
				searchedBooks[i++] = book;
		}
		return Arrays.copyOfRange(searchedBooks, 0, i);
	}

	public Book[] findTextBooksByPrice() {
		Book[] searchedBooks = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			if (book instanceof TextBook) {
				if (book.getPrice() > 50 && book.getPrice() < 100)
					searchedBooks[i++] = book;
			}
		}
		return Arrays.copyOfRange(searchedBooks, 0, i);
	}

	// Implement print array method
	public void printArray(Book[] books) {
		System.out.println(Arrays.toString(books));
	}
	
	// Implement calculate money method
	public double calMoney(int[] quantity) {
		Book[] buyedBooks = new Book[] {
				new TextBook("SGK01", 50, "Nhi Đồng", true),
				new ReferenceBook("STK001", 40, "Nhi Đồng", 20)
		};
		double sum = 0d;
		for(Book book:buyedBooks) {
			if(book instanceof TextBook) {
				sum += quantity[0]*0.7*((TextBook) book).getPrice();
			} 
			
			if(book instanceof ReferenceBook) {
				sum+= quantity[1]*((ReferenceBook) book).getPrice()*(1+((ReferenceBook) book).getTax()/100);
			}
		}
		return sum;
	}
	
	
}
