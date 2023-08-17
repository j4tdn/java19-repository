package view.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TransactionApp {
	
	public static void main(String[] args) {
		List<Transaction> transactions = mockData();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
//		List<Transaction> ex1 = new ArrayList<Transaction>();
//		ex1 =  transactions.stream().filter(t -> t.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).toList();
//		for (Transaction transaction : ex1) {
//			System.out.println(transaction);
//		}
		
		printf(ex1(transactions));
		System.out.println("+++++++++++++++");
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		printf(ex2(transactions));
		System.out.println("+++++++++++++++");
		// 3. What are all the unique cities where the traders work?
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		printf(ex4(transactions));
		System.out.println("+++++++++++++++");
		// 5. Return a string of all traders’ names sorted alphabetically.

		// 6. Are any traders based in Milan?
			ex06(transactions);
		// 7. Count the number of traders in Milan.
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		
		// 9. What’s the highest value of all the transactions?
		
		// 10. Find the transaction with the smallest value
		
		
	}
	
	private static List<Transaction> ex1(List<Transaction> transactions){
		List<Transaction> result = new ArrayList<Transaction>();
		for (Transaction transaction : transactions) {
			if(transaction.getYear() == 2011) {
				result.add(transaction);
			}
		}
		result.sort(Comparator.comparing(Transaction::getValue));
		return result;
	}
	
	private static List<Transaction> ex2(List<Transaction> transactions){
		List<Transaction> result = new ArrayList<Transaction>();
		for (Transaction transaction : transactions) {
			if(transaction.getValue() > 300) {
				result.add(transaction);
			}
		}
		result.sort(Comparator.comparing(c -> ((Transaction) c).getTrader().getLivingCity()));
		return result;
	}
	
	
	private static List<Transaction> ex4(List<Transaction> transactions){
		List<Transaction> result = new ArrayList<Transaction>();
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getLivingCity().equals("Cambridge")) {
				result.add(transaction);
			}
		}
		result.sort(Comparator.comparing(c -> ((Transaction) c).getTrader().getFullname()).reversed());
		return result;
	}
	
	
	private static List<String> ex5(List<Trader> traders){
		List<String> result = new ArrayList<String>();
		for (Trader trader : traders) {
			result.add(trader.getFullname());
		}
		result.sort(Comparator.comparing(String::toString));
		
		return result;
	}
	
	private static boolean ex06(List<Transaction> transactions) {
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getLivingCity().equals("Milan")) {
				return true;
			}
		}
		return false;
	}
	
	public static void printf(List<Transaction> transactions) {
		for (Transaction transaction : transactions) {
			System.out.println(transaction);
		}
	}
	
	private static List<Transaction> mockData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		return List.of(
			new Transaction(brian, 2011, 300L),
			new Transaction(raoul, 2012, 1000L), 
			new Transaction(raoul, 2011, 400L),
			new Transaction(mario, 2012, 710L), 
			new Transaction(mario, 2012, 700L), 
			new Transaction(alan, 2012, 950L)
		);
	}
}