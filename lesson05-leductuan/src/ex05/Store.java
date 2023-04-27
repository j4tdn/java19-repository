package ex05;

import java.util.ArrayList;

public class Store {
	public static void main(String[] args) {
		
	}
	public static Book[] createData() {
		Book[] books = new Book[] {
	            new TextBook("SGK001", 155, "Nhi Đồng", "mới"),
	            new TextBook("SGK002", 120, "Kim Đồng", "cũ"),
	            new TextBook("SGK003", 135, "Nhi Đồng", "mới"),
	            new ReferBook("STK001", 80, "Kim Đồng", 10),
	            new ReferBook("STK002", 110, "Nhi Đồng", 12)
	        };
		return books;
	}
	public static Book[] findBookByPublishingCompany(Book[] books) {
		 ArrayList<Book> result = new ArrayList<>();
	        for (Book book : books) {
	            if (book.getPublisher().equals("Nhi Đồng")) {
	                result.add(book);
	            }
	        }
	        return result.toArray(new Book[result.size()]);
      }
	
}
