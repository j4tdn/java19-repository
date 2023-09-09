package view;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

import static java.util.Comparator.*;

public class TraderExecutingTransactionApp {
	public static void main(String[] args) {
		List<Transaction> transactions = mockData();

		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
		transactions.stream()
					.filter(t -> t.getYear() == 2011)
					.sorted(comparing(Transaction::getValue))
					.forEach(System.out::println);
		
		System.out.println("\n2. Find all transactions have value greater than 300 and sort them by trader�s city");
		transactions.stream()
					.filter(t -> t.getValue() > 300)
					.sorted(comparing(TraderExecutingTransactionApp::mapCity))
					.forEach(System.out::println);
		
		
		System.out.println("\n3. What are all the unique cities where the traders work?");

		transactions.stream()
				.filter(c -> Collections.frequency(transactions, c) == 1)
				.map(TraderExecutingTransactionApp::mapCity)
				.forEach(System.out::println);

					
		
		System.out.println("\n4. Find all traders from Cambridge and sort them by name desc.");
		transactions.stream()
					.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
					.sorted(comparing(TraderExecutingTransactionApp::mapName, reverseOrder()))
					.forEach(System.out::println);
		
		System.out.println("\n5. Return a string of all traders� names sorted alphabetically.");
		String s = 	transactions.stream()
								.sorted(comparing(TraderExecutingTransactionApp::mapName))
								.map(TraderExecutingTransactionApp::mapName)
								.collect(Collectors.joining());
		System.out.println(s);
		
		System.out.println("\n6. Are any traders based in Milan?");
		boolean isExistTraderInMilan = transactions.stream()
					.anyMatch(t -> "Milan".equals(t.getTrader().getCity()));
		System.out.println(isExistTraderInMilan);			
		
		System.out.println("\n7. Count the number of traders in Milan.");
		long milanCount = transactions.stream()
					.filter(t -> "Milan".equals(t.getTrader().getCity()))
					.count();
		System.out.println(milanCount);
		
		System.out.println("\n8. Print all transactions� values from the traders living in Cambridge.");
		transactions.stream()
					.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
					.map(Transaction::getValue)
					.forEach(System.out::println);
		
		System.out.println("\n9. What�s the highest value of all the transactions?");
		transactions.stream()
					.sorted(comparing(Transaction::getValue, reverseOrder()))
					.mapToInt(Transaction::getValue)
					.limit(1)
					.forEach(System.out::println);
		
		System.out.println("\n10.Find the transaction with the smallest value.");
		transactions.stream()
		.sorted(comparing(Transaction::getValue))
		.limit(1)
		.forEach(System.out::println);
	}
	
	
	private static String mapName(Transaction t) {
		return t.getTrader().getName();
	}
	
	private static String mapCity(Transaction t) {
		return t.getTrader().getCity();
	}

	private static List<Transaction> mockData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
						new Transaction(brian, 2011, 300),
						new Transaction(raoul, 2012, 1000), 
						new Transaction(raoul, 2011, 400),
//						new Transaction(mario, 2012, 710), 
						new Transaction(mario, 2012, 700), 
						new Transaction(alan, 2012, 950));
		return transactions;
	}

}
