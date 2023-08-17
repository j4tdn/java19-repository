package view.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TransactionApp {
	
	public static void main(String[] args) {
		List<Transaction> transactions = mockData();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
//		List<Transaction> ex1 = new ArrayList<Transaction>();
//		ex1 =  transactions.stream().filter(t -> t.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).toList();
//		for (Transaction transaction : ex1) {
//			System.out.println(transaction);
//		}
		
		System.out.println("++++++++1+++++++");
		printf(ex1(transactions));
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("+++++++2+++++++");
		printf(ex2(transactions));
		// 3. What are all the unique cities where the traders work?
		System.out.println("++++++++3++++++");
		ex3(transactions).forEach(System.out::println);
		// 4. Find all traders from Cambridge and sort them by name desc.
		System.out.println("++++++++4++++++");
		printf(ex4(transactions));
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("++++++++5++++++");
		ex5(transactions).forEach(System.out::println);
		// 6. Are any traders based in Milan?
		System.out.println("++++++++6+++++++");
			System.out.println(ex6(transactions));
			
		// 7. Count the number of traders in Milan.
			System.out.println("++++++++7+++++++");
			System.out.println(ex7(transactions));
		// 8. Print all transactions’ values from the traders living in Cambridge.
			System.out.println("+++++++8++++++++");
			ex8(transactions).forEach(System.out::println);
		// 9. What’s the highest value of all the transactions?
			System.out.println("+++++++9++++++++");
			System.out.println(ex9(transactions));
		// 10. Find the transaction with the smallest value
			System.out.println("+++++++10++++++++");
			System.out.println(ex10(transactions));
		
		
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
	
	private static Set<String> ex3(List<Transaction> transactions){
		Set<String> result = new HashSet<String>();
		for (Transaction transaction : transactions) {
			result.add(transaction.getTrader().getLivingCity());
		}
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
	
	
	private static Set<String> ex5(List<Transaction> transactions){
		Set<String> result = new TreeSet<>();
		for (Transaction transaction : transactions) {
			result.add(transaction.getTrader().getFullname());
		}
		return result;
	}
	
	private static boolean ex6(List<Transaction> transactions) {
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getLivingCity().equals("Milan")) {
				return true;
			}
		}
		return false;
	}
	
	private static int ex7(List<Transaction> transactions) {
		int result = 0;
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getLivingCity().equals("Milan")) {
				result++;
			}
		}
		return result;
	}
	
	
	private static List<Long> ex8(List<Transaction> transactions){
		List<Long> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getLivingCity().equals("Cambridge")) {
				result.add(transaction.getValue());
			}
		}
		return result;
	}
	
	private static Long ex9(List<Transaction> transactions) {
		Long result = Long.MIN_VALUE;
		for(Transaction transaction:transactions) {
			if(transaction.getValue() > result) {
				result = transaction.getValue();
			}
		}
		return result;
	}
	
	public static Transaction ex10(List<Transaction> transactions) {
		Transaction result = transactions.get(0);
		for (Transaction transaction : transactions) {
			if(transaction.getValue() < result.getValue()) {
				result = transaction;
			}
		}
		return result;
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