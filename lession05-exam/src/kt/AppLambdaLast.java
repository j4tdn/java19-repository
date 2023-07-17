package kt;

import java.util.Arrays;

public class AppLambdaLast {
	public static void main(String[] args) {
		
		// Opt3 : Anonymous function, required (at least JDK 1.8)
		
		Condition lt50 = (Book book)->{
			return book.getPrices() < 50;
		};
		
		Book[] booksOpt3 = filter(EnterDB(),lt50 );
		System.out.println(Arrays.toString(booksOpt3));
		
		// Opt1 : Use Anonymous
		
		Condition condition = new Condition() {
			
			@Override
			public boolean check(Book book) {
				return book.getPrices() >= 100 &&  book.getPrices() <= 600;
			}
		};
		
		// Opt2 : Implementation class from strategy interface
		Condition pcd = new PublisherCondition("Nhi Dong");
		Book[] bookB = filter(EnterDB(), pcd);
		System.out.println(Arrays.toString(bookB));
	}
	
	// strategy(behavior, function) pattern
	// pass a parameter as a behavior, function
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
