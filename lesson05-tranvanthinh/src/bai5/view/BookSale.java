package bai5.view;

import java.util.Arrays;

import bai5.bean.Book;
import bai5.bean.ClassicalBook;
import bai5.bean.ReferenceBook;

public class BookSale {
	public static void main(String[] args) {
		Book cb1 = new ClassicalBook("SGK1", 20f , "Nhi Đồng", true);
		Book cb2 = new ClassicalBook("SGK2", 30f , "Nhi Đồng", false);
		Book cb3 = new ClassicalBook("SGK3", 170f , "Kim Đồng", true);
		
		Book rb1 = new ReferenceBook("STK1", 40f, "Nhi Đồng" , 10f) ;
		Book rb2 = new ReferenceBook("STK2", 150f, "Kim Đồng" , 15f) ;
		
		Book[] books = {cb1, cb2, cb3, rb1, rb2};
		System.out.println("sách thuộc nhà xuất bản Nhi Đồng");
		PrintResult(findBookByPublisher(books));
		System.out.println("sách có đơn giá nhỏ hơn 50");
		PrintResult(findBookByPrice(books));
		System.out.println("sách giáo khoa có đơn giá từ 100 đến 200");
		PrintResult(findClassicalBookByPriceInRange(books));
		
		Book[] booksOrdered = {cb1, rb1};
		System.out.println("Tổng tiền phải thanh toán: " + totalOfBill(booksOrdered));
	}
	
	public static Book[] findBookByPublisher(Book[] books) {
		Book[] searchedBook = new Book[books.length];
		int index = 0;
		for (Book book : books) {
			if(book.getPublisher().compareTo("Nhi Đồng") == 0) {
				searchedBook[index++] = book;
			}
		}
		
		return Arrays.copyOfRange(searchedBook, 0, index);
		
	}
	
	public static Book[] findBookByPrice(Book[] books) {
		Book[] searchedBook = new Book[books.length];
		int index = 0;
		for (Book book : books) {
			if(book.getPrice() < 50) {
				searchedBook[index++] = book;
			}
		}
		
		return Arrays.copyOfRange(searchedBook, 0, index);
		
	}
	
	public static Book[] findClassicalBookByPriceInRange(Book[] books) {
		Book[] searchedBook = new Book[books.length];
		int index = 0;
		for (Book book : books) {
			if(book instanceof ClassicalBook)
				if(book.getPrice() > 100 && book.getPrice() < 200) {
					searchedBook[index++] = book;
				}
		}
		
		return Arrays.copyOfRange(searchedBook, 0, index);
		
	}
	
	public static float totalOfBill(Book[] books) {
		float totalBill = 0;
		for (Book book : books) {
			float billtemp = 0;
			if(book instanceof ClassicalBook) {
				ClassicalBook cb = (ClassicalBook)book;
				billtemp += cb.getPrice();
				// status true là sách mới
				if(!cb.getStatus()) {
					billtemp -= (billtemp*0.3);
				}
			}
			
			if(book instanceof ReferenceBook) {
				ReferenceBook rb = (ReferenceBook)book;
				billtemp += rb.getPrice() * (1 + rb.getTax()/100);
			}
			
			totalBill += billtemp;
			
		}
		return totalBill;
	}
	
	public static void PrintResult(Book[] books) {
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}
}
