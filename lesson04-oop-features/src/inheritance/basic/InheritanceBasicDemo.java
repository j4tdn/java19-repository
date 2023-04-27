package inheritance.basic;

import java.util.Arrays;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		//sách giáo khoa: id, name, publisher, isNew
		//sách tham khảo: id, name, publisher, tax
		
		ClassicalBook cb1 = new ClassicalBook(1, "Toán", "Nhi Đồng", true);
		ClassicalBook cb2 = new ClassicalBook(2, "Lí", "Nhi Đồng", false);
		ClassicalBook cb3 = new ClassicalBook(3, "Hoá", "Kim Đồng", true);
		ClassicalBook cb4 = new ClassicalBook(4, "Lịch sử", "Kim Đồng", true);
		
		ReferenceBook rb1 = new ReferenceBook(5, "STK Toán 1", "Nhi Đồng", 12d);
		ReferenceBook rb2 = new ReferenceBook(6, "STK Lí 2", "Nhi Đồng", 8d);
		ReferenceBook rb3 = new ReferenceBook(7, "STK Văn", "Nhi Đồng", 22d);
		ReferenceBook rb4 = new ReferenceBook(8, "STK Công Nghệ", "Nhi Đồng", 2d);
		
		Book[] books = {cb1, cb2, cb3, cb4, rb1, rb2, rb3, rb4};
		
		
		//Viết hàm tìm những cuốn sách có id < 6
		Book[] booksByIds = findBookByIds(books);
		System.out.println("booksByIds --> " + Arrays.toString(booksByIds));
		//Viết hàm tìm những cuốn sách có thuế > 10%
		Book[] booksByTax = findBookByTax(books);
		System.out.println("booksByTax --> " + Arrays.toString(booksByTax));
	}
	
	private static Book[] findBookByIds(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			if (book.getId() < 6) {
				result[running++] = book;
			}
		}
		//running = 5 (số phần tử thật sự cần lưu trong mảng result)
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static Book[] findBookByTax(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			if (book instanceof ReferenceBook) {
				if (((ReferenceBook)book).getTax() > 10) {
					result[running++] = book;
				}
			}
		}
		//running = 5 (số phần tử thật sự cần lưu trong mảng result)
		return Arrays.copyOfRange(result, 0, running);
	}

}
