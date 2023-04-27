package ex05;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Book tb1 = new Textbook(1, 10, "Nhi Dong", false);
		Book tb2 = new Textbook(2, 150, "Phan Thi", true);
		Book tb3 = new Textbook(3, 110, "Than Dong", true);
		Book rb1 = new ReferenceBook(4, 70, "Kim Dong", 9.5f);
		Book rb2 = new ReferenceBook(5, 170, "Nhi Dong", 10f);
		Book[] books = { tb1, tb2, tb3, rb1, rb2 };
		System.out.println(pay(tb1, rb2));
	}

	private static Book[] findAuthor(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book.getAuthor() == "Nhi Dong") {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Book[] findPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book.getPrice() < 50f) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Book[] findRangePrice(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book.getClass() == Textbook.class) {
				if (book.getPrice() >= 100f && book.getPrice() <= 200f) {
					result[count++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static float pay(Book tb, Book rb) {
		float result = 0;
		Book[] temp = { rb, tb };
		for (Book temps : temp) {
			if (temps.getClass() == ReferenceBook.class) {
				result += rb.getPrice() * (1 + ((ReferenceBook) rb).getTax() / 100);
			}
			if (((Textbook) tb).getStatus() == false) {
				result += 0.3 * tb.getPrice();
			}
		}
		return result;
	}
}