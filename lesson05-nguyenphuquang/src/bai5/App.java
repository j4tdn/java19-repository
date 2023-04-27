package bai5;

public class App {

	public static void main(String[] args) {
		Book[] books = initBook();
		findPublisher("Nhi Dong",books );
	}

	public static Book[] initBook() {
		Book[] books = new Book[5];
		books[0] = new ClassicalBook("SGK1", 10, "Giao Duc", true);
		books[1] = new ClassicalBook("SGK2", 150, "Nhi Dong", false);
		books[2] = new ClassicalBook("SGK3", 250, "Tuoi Tre", true);
		books[3] = new ReferenceBook("STK1", 120, "Nhi Dong", 2.3);
		books[4] = new ReferenceBook("STK2", 30, "Nhi Dong", 5.3);
		return books;
	}
	
	public static void findPublisher(String string, Book[] books) {
		for (Book book:books) {
			if (book.getPublisher()==string) {
				System.out.println(book);
			}
		}
	}
}
