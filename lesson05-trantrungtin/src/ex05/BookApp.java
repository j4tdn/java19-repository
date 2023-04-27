package ex05;

import java.util.Arrays;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK01", 35, "Nhi Dong", false);
		TextBook tb2 = new TextBook("SGK02", 40, "B", true);
		TextBook tb3 = new TextBook("SGK03", 55, "C", false);

		ReferenceBook rb1 = new ReferenceBook("STK01", 50, "Nhi Dong", 8);
		ReferenceBook rb2 = new ReferenceBook("STK02", 45, "A", 10);

		Book[] books = { tb1, tb2, tb3, rb1, rb2 };
		
		Customer c1 = new Customer(01, "tin", "0123456789", "japan");
		
		
		
		// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
		Book[] bookByPublisher = findBookByPublisher(books);
		System.out.println("BookByPublisher --> \n"+ Arrays.toString(bookByPublisher));
		System.out.println("---------");
		
		//Tìm toàn bộ sách có đơn giá nhỏ hơn 50
		Book[] bookByPrice = findBookByPrice(books);
		System.out.println("BookBybookByPrice --> \n"+ Arrays.toString(bookByPrice));
		System.out.println("---------");
		
		// //Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
		Book[] textBookByPrice = findTextBookByPrice(books);
		System.out.println("textBookByPrice --> \n"+ Arrays.toString(textBookByPrice));
		System.out.println("---------");
		
	}

	// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
	private static Book[] findBookByPublisher(Book[] books) {
		Book[] result = new Book[books.length];
		int i = 0;

		for (Book book : books) {
			if (book.getPublisher().equals("Nhi Dong")) {
				result[i++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}
	
	//Tìm toàn bộ sách có đơn giá nhỏ hơn 50
	private static Book[] findBookByPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int i = 0;

		for (Book book : books) {
			if (book.getPrice() < 50) {
				result[i++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}
	
	//Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
	private static Book[] findTextBookByPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int i = 0;

		for (Book book : books) {
			if (book instanceof TextBook) {
				TextBook textBook = (TextBook)book;
				if (textBook.getPrice() >= 0 && textBook.getPrice() <= 100 ) {
					result[i++] = textBook;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}
}
