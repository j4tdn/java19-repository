package bai5;

public class App {

	public static void main(String[] args) {

	}
public static Book[] initBook() {
	Book[] books = new Book[5];
	books[0] = new ClassicalBook("SGK1",10000,"Giao Duc",true);
	books[1] = new ClassicalBook("SGK2",15000,"Giao Duc",false);
	books[2] = new ClassicalBook("SGK3",20000,"Tuoi Tre",true);
	books[3] = new ReferenceBook("STK1",52000,"Văn Hóa",2.3);
	books[4] = new ReferenceBook("STK2",67000,"Thông Tin",5.3);
	return books;
}
}
