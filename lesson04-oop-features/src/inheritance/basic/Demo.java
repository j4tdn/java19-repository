package inheritance.basic;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		ClassicalBook cb1 = new ClassicalBook(1, "Toán", "Nhi Đồng", true);
		ClassicalBook cb2 = new ClassicalBook(2, "Lý", "Nhi Đồng", false);
		ClassicalBook cb3 = new ClassicalBook(3, "Hoá", "Kim Đồng", true);
		ClassicalBook cb4 = new ClassicalBook(4, "Văn", "Kim Đồng", true);
		
		ReferenceBook rb1 = new ReferenceBook(5, "STL Toán", "Nhi Đồng", 12d);
		ReferenceBook rb2 = new ReferenceBook(6, "STL Lý", "Nhi Đồng", 8d);
		ReferenceBook rb3 = new ReferenceBook(7, "STL Hoá", "Kim Đồng", 22d);
		ReferenceBook rb4 = new ReferenceBook(8, "STL Văn", "Kim Đồng", 9d);
		
		Book[] books = {cb1,cb2,cb3,cb4,rb1,rb2,rb3,rb4};
		Book[] bookByIds = findBookByIds(books);
//		System.out.println(Arrays.toString(bookByIds));
		Book[] bookByTax = findBookByTax(books);
		System.out.println(Arrays.toString(bookByTax));
		
	}
	
	private static Book[] findBookByIds(Book[] books) {
		Book[] result = new Book[books.length];
		int index = 0;
		for (Book book : books) {
			if(book.getId() < 6) {
				result[index++] = book;
			}
		}
		
//		Book[] finalResult = new Book[index];
//		for (int i = 0; i < index; i++) {
//			finalResult[i] = result[i];
//		}
		return Arrays.copyOfRange(result, 0, index);
		
	}
	
	private static Book[] findBookByTax(Book[] books) {
		Book[] result = new Book[books.length];
		int index = 0;
		for (Book book : books) {
//			if(book != null && book.getClass() == ReferenceBook.class) {
				if(book instanceof ReferenceBook) {
				ReferenceBook rb = (ReferenceBook) book;
				if(rb.getTax() > 10) {
					result[index++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
	


}
