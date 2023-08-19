package view.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TransactionApp {
	
	public static void main(String[] args) {
		List<Transaction> transactions = mockData();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		System.out.println("=======================================================================");
		System.out.println();
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
		printf(findTransactionIn2011(transactions));
		System.out.println();
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println();
		System.out.println("=======================================================================");
		System.out.println();
		System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city");
		printf(findTransactionGreaterThan300(transactions));
		System.out.println();
		// 3. What are all the unique cities where the traders work?
		System.out.println("=======================================================================");
		System.out.println();
		System.out.println("3. What are all the unique cities where the traders work?");
		printf(uniqueCity(transactions));
		System.out.println();

		// 4. Find all traders from Cambridge and sort them by name desc.
		System.out.println("=======================================================================");
		System.out.println();
		System.out.println("4. Find all traders from Cambridge and sort them by name desc.");
		printf(traderFromCambridge(transactions));
		System.out.println();

		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("=======================================================================");
		System.out.println();
		System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
		printf(stringTraderName(transactions));
		System.out.println();

		// 6. Are any traders based in Milan?
		System.out.println("=======================================================================");
		System.out.println();
		System.out.println("6. Are any traders based in Milan?");
		if(areTradersInMilan(transactions)) {
		System.out.println("YES");}
		System.out.println();
		// 7. Count the number of traders in Milan.
		System.out.println("=======================================================================");
		System.out.println();
		System.out.println("7. Count the number of traders in Milan.");
		System.out.println(countTraderInMilan(transactions));
		System.out.println();

		// 8. Print all transactions’ values from the traders living in Cambridge.
		System.out.println("=======================================================================");
		System.out.println();
		System.out.println("8. Print all transactions’ values from the traders living in Cambridge.");
		printf(valueTransactionFromCambridge(transactions));
		System.out.println();

		// 9. What’s the highest value of all the transactions?
		System.out.println("=======================================================================");
		System.out.println();
		System.out.println("9. What’s the highest value of all the transactions?");
		System.out.println(maxValue(transactions));
		System.out.println();
		// 10. Find the transaction with the smallest value
		System.out.println("=======================================================================");
		System.out.println();
		System.out.println("10. Find the transaction with the smallest value.");
		System.out.println(transactionWithMinValue(transactions));
		System.out.println();

		
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
	
	private static List<Transaction> findTransactionIn2011(List<Transaction> transactions){
		List<Transaction> list = new ArrayList<Transaction>();
		for (Transaction transaction : transactions) {
			if(transaction.getYear() == 2011) {
				list.add(transaction);
			}
		}
		list.sort(Comparator.comparing(Transaction::getValue));
		return list;
	}
	
	private static List<Transaction> findTransactionGreaterThan300(List<Transaction> transactions){
		List<Transaction> list = new ArrayList<Transaction>();
		for (Transaction transaction : transactions) {
			if(transaction.getValue() > 300) {
				list.add(transaction);
			}
		}
		list.sort(Comparator.comparing(c -> ((Transaction) c).getTrader().getLivingCity()));
		return list;
	}
	
	private static List<String> uniqueCity(List<Transaction> transactions){
		Set<String> set = new HashSet<String>();
		for (Transaction transaction : transactions) {
			set.add(transaction.getTrader().getLivingCity());
		}
		return new ArrayList<>(set);
	}
	
	private static List<Transaction> traderFromCambridge(List<Transaction> transactions){
		List<Transaction> list = new ArrayList<Transaction>();
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getLivingCity().equals("Cambridge")) {
				list.add(transaction);
			}
		}
		list.sort(Comparator.comparing(c -> ((Transaction) c).getTrader().getFullname()).reversed());
		return list;
	}
	
	
	private static List<String> stringTraderName(List<Transaction> transactions){
		Set<String> set = new TreeSet<>();
		for (Transaction transaction : transactions) {
			set.add(transaction.getTrader().getFullname());
		}
		return new ArrayList<>(set);
	}
	
	private static boolean areTradersInMilan(List<Transaction> transactions) {
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getLivingCity().equals("Milan")) {
				return true;
			}
		} 
		return false;
	}
	
	private static int countTraderInMilan(List<Transaction> transactions) {
		int count = 0;
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getLivingCity().equals("Milan")) {
				count++;
			}
		}
		return count;
	}
	
	
	private static List<Long> valueTransactionFromCambridge(List<Transaction> transactions){
		List<Long> list = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getLivingCity().equals("Cambridge")) {
				list.add(transaction.getValue());
			}
		}
		return list;
	}
	
	private static Long maxValue(List<Transaction> transactions) {
		Long max = 0L;
		for(Transaction transaction:transactions) {
			if(transaction.getValue() > max) {
				max = transaction.getValue();
			}
		}
		return max;
	}
	
	public static Transaction transactionWithMinValue(List<Transaction> transactions) {
		Long max = maxValue(transactions);
		Transaction resutl =new Transaction();
		for (Transaction transaction : transactions) {
			if(transaction.getValue() < max) {
				max = transaction.getValue();
				resutl = transaction;
			}
		}
		return resutl;
	}
	
	private static <E> void printf(List<E> list) {
		for (E e : list) {
			System.out.println(e);
		}
	}
}