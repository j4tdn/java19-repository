package bai5;

import java.util.Arrays;

public class Manager {
	public static void main(String[] args) {
		findBookByPublisher(EnterDB());
//		for(Book book: findBookByPublisher(EnterDB())) {
//			System.out.println(book);
//		}
		
//		for(Book book: findBookByPrice(EnterDB())) {
//			System.out.println(book);
//		}
		
//		for(Book book: findBookByBetween(EnterDB())) {
//			System.out.println(book);
//		}
		
		Textbook textbook = new Textbook("SGK03", 80D, "Nhi Dong", true);
		
		Referencebooks referencebooks =new Referencebooks("STK01", 45D, "Kim Dong",2f);
		
		System.out.println(payment(textbook,referencebooks));
	}
	
	static double payment(Textbook textbook, Referencebooks referBook) {
		double prices = 0;
		if(!textbook.isStatus()) prices += textbook.getPrices()*0.3;
		else prices += textbook.getPrices();
		
		prices += referBook.getPrices()*(1+referBook.getTax());
		return prices;
	}
	
	static Book[] EnterDB() {
		Book[] books = {
				new Textbook("SGK01", 40D, "Kim Dong", false),
				new Textbook("SGK02", 60D, "Kim Dong", true),
				new Textbook("SGK03", 80D, "Nhi Dong", true),
				
				new Referencebooks("STK01", 45D, "Kim Dong",2f),
				new Referencebooks("STK02", 120D, "Nhi Dong", 1.6f),
		};
		return books;
	}
	
	static Book[] findBookByPublisher(Book[] books) {
		Book[] results = new Book[books.length];
		int j=0;
		for(int i =0; i< books.length;i++) {
			if(books[i].getPublisher().equals("Nhi Dong")) {
				results[j++] = books[i];
			}
		}
		Book[] finalResult = Arrays.copyOfRange(results, 0, j);
		return finalResult;
	}
	
	static Book[] findBookByPrice(Book[] books) {
		Book[] results = new Book[books.length];
		int j=0;
		for(int i =0; i< books.length;i++) {
			if(books[i].getPrices()<50) {
				results[j++] = books[i];
			}
		}
		Book[] finalResult = Arrays.copyOfRange(results, 0, j);
		return finalResult;
	}
	
	static Book[] findBookByBetween(Book[] books) {
		Book[] results = new Book[books.length];
		int j=0;
		for(int i =0; i< books.length;i++) {
			if(100<= books[i].getPrices() &&books[i].getPrices() <=200) {
				results[j++] = books[i];
			}
		}
		Book[] finalResult = Arrays.copyOfRange(results, 0, j);
		return finalResult;
	}
}
