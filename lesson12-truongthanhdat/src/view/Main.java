package view;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class Main {
	public static void main(String[] args) {
		List<Transaction> transactions =mockData();
		
		var transactionsIn2011 = transactions.stream().filter(t -> t.getYear() == 2011)
		.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());

		System.out.println("Transactions in the year 2011 sort them by value (small to high):");
		printf(transactionsIn2011);
		
		
		var transactionsWithValueGreaterThan300 = transactions.stream().filter(t -> t.getValue() > 300)
				.sorted(Comparator.comparing(t -> t.getTrader().getCity())).collect(Collectors.toList());

		System.out.println("\n\nTransactions have value greater than 300 (Sort them by trader’s city):");
		printf(transactionsWithValueGreaterThan300);

		
		var uniqueCities = transactions.stream().map(t -> t.getTrader().getCity()).collect(Collectors.toSet());
		System.out.println("\n\nThe unique cities where the traders work:");
		for (var elm : uniqueCities) {
			System.out.println(elm);
		}
		
		var tradersFromCambridge = transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.sorted(Comparator.comparing(t -> ((Transaction) t).getTrader().getName()).reversed())
				.collect(Collectors.toList());
		
		System.out.println("\n\nTraders from Cambridge (sort them by name desc):");
		printf(tradersFromCambridge);
		
		
		var allTradersNames = transactions.stream().map(t -> t.getTrader().getName()).sorted().collect(Collectors.toList());
		String stringName = "";
		for (var elm : allTradersNames) {
			stringName += elm;
		}
		
		System.out.println("\n\nString of all traders’ names sorted alphabetically:");
		System.out.println(stringName);
		
		
		var tradersBasedInMilan = transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"));
		System.out.println("\n\nAre any traders based in Milan?");
		System.out.println(tradersBasedInMilan);

		
		var tradersCountInMilan = transactions.stream().filter(t -> t.getTrader().getCity().equals("Milan")).count();
		System.out.println("\n\nThe number of traders in Milan:");
		System.out.println(tradersCountInMilan);
		
		
		var transactionsValuesFromCambridge = transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).map(t -> t.getValue())
				.collect(Collectors.toList());
		System.out.println("\n\nTransactions’ values from the traders living in Cambridge:");
		printf(transactionsValuesFromCambridge);
		

		var highestValue = transactions.stream().map(t -> t.getValue()).collect(Collectors.toList());
		long value = Collections.max(highestValue);
		System.out.println("\n\nHighest value of all the transactions:");
		System.out.println(value);
		
		
		var transactionWithSmallestValue = transactions.stream().min(Comparator.comparing(Transaction::getValue));
		System.out.println("\n\nThe transaction with the smallest value:");
		System.out.println(transactionWithSmallestValue);
	}

	public static List<Transaction> mockData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
		return transactions;
	}

	private static <E> void printf(List<E> list) {
		for (E e : list) {
			System.out.println(e);
		}
	}

}
