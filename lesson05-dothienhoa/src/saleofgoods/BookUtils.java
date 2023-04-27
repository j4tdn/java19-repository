package saleofgoods;

import java.util.Arrays;

public class BookUtils {

	private BookUtils() {

	}

	public static Book[] findBookNhiDong(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book.getPublisher().equals("Nhi Đồng")) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	public static Book[] findBookPrice(Book[] books, double price) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book.getPrice() < price) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	public static Book[] findBookPriceToPrice(Book[] books, double downPrice, double upPrice) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book.getPrice() > downPrice && book.getPrice() < upPrice) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

}
