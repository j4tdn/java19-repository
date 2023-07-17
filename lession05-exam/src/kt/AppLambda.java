package kt;

import java.util.Arrays;

public class AppLambda {
	public static void main(String[] args) {
		Book[] booksOpt3 = filter(EnterDB(),book-> book.getPrices() < 50 );
		System.out.println(Arrays.toString(booksOpt3));
	}
	private static Book[] filter(Book[] books, Condition condition) {
		Book[] result = new Book[books.length];
		int index =0;
		for(Book book : books) {
			// strategy
			if(condition.check(book)) {
				result[index++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
	static Book[] EnterDB() {
		Book[] books = {
				new TextBook("SGK01", 40D, "Kim Dong", false),
				new TextBook("SGK02", 60D, "Kim Dong", true),
				new TextBook("SGK03", 80D, "Nhi Dong", true),
				
				new ReferenceBooks("STK01", 45D, "Kim Dong",2f),
				new ReferenceBooks("STK02", 120D, "Nhi Dong", 1.6f),
		};
		return books;
	}
}
