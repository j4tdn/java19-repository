package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;

public class Apptrading {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), 
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), 
				new Transaction(mario, 2012, 700), 
				new Transaction(alan, 2012, 950));

		List<Trader> traders = new ArrayList<>();
		traders.add(new Trader("Alice", "London"));
		traders.add(new Trader("Bob", "New York"));
		traders.add(new Trader("Charlie", "Cambridge"));
		traders.add(new Trader("David", "Cambridge"));

		// Query 1: Find all transactions from year 2011 and sort them by value (small
		// to high).

		List<Transaction> tr2011 = transactions.stream()
				.filter(transaction -> transaction.getYear() == 2011)
				.sorted(comparing(Transaction::getValue))
				.collect(toList());
		System.out.println(tr2011);
		System.out.println("\n=======================\n");

		// Query 2: Find all transactions have value greater than 300 and sort them by
		// trader’s city

		List<Transaction> filteredTransactions = transactions.stream()
				.filter(transaction -> transaction.getValue() > 300)
				.collect(Collectors.toList());

		Collections.sort(filteredTransactions, Comparator.comparing(transaction -> transaction.getTrader().getCity()));
		for (Transaction transaction : filteredTransactions) {
			System.out.println("Year: " + transaction.getYear());
			System.out.println("Trader: " + transaction.getTrader().getName());
			System.out.println("City: " + transaction.getTrader().getCity());
			System.out.println("Value: " + transaction.getValue());
		}
		System.out.println("\n===================\n");

		// Query 3: What are all the unique cities where the traders work.

		List<String> cities = transactions.stream()
				.map(transaction -> transaction.getTrader().getCity())
				.distinct()
				.collect(toList());
		System.out.println(cities);

		System.out.println("\n========================\n");

		// Query 4: Find all traders from Cambridge and sort them by name desc.

		List<Trader> cambridgeTraders = traders.stream()
				.filter(trader -> "Cambridge".equals(trader.getCity()))
				.collect(Collectors.toList());

		Collections.sort(cambridgeTraders, (trader1, trader2) -> trader2.getName()
				.compareTo(trader1.getName()));

		for (Trader trader : cambridgeTraders) {
			System.out.println("Name: " + trader.getName());
			System.out.println("City: " + trader.getCity());
		}
		System.out.println("\n===========================\n");

		// Query 5: Return a string of all traders’ names sorted alphabetically.

		String traderStr = transactions.stream().map(transaction -> transaction.getTrader().getName())
				.distinct()
				.sorted()
				.reduce("", (n1, n2) -> n1 + n2);
		System.out.println(traderStr);
		System.out.println("\n======================\n");

		// Query 6: Are there any trader based in Milan?

		boolean milanBased = transactions.stream()
				.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
		System.out.println(milanBased);
		System.out.println("\n======================\n");

		// Query 7: Count the number of traders in Milan.

		long milanTraderCount = traders.stream().filter(trader -> "Milan".equals(trader.getCity())).count();

		System.out.println("Number of Traders in Milan: " + milanTraderCount);
		System.out.println("\n======================\n");

		// Query 8: Print all transactions’ values from the traders living in Cambridge.

		transactions.stream().filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
				.forEach(transaction -> System.out.println("Transaction Value: " + transaction.getValue()));
		System.out.println("\n======================\n");

		// Query 9: What's the highest value in all the transactions?
		int highestValue = transactions.stream()
				.map(Transaction::getValue)
				.reduce(0, Integer::max);
		System.out.println(highestValue);
		System.out.println("\n======================\n");

		// Query 10: Find the transaction with the smallest value.

		Optional<Transaction> smallestTransaction = transactions.stream()
				.min(Comparator.comparingDouble(Transaction::getValue));

		if (smallestTransaction.isPresent()) {
			Transaction transaction = smallestTransaction.get();
			System.out.println("Smallest Transaction Value: " + transaction.getValue());
			System.out.println("Trader: " + transaction.getTrader().getName());
			System.out.println("City: " + transaction.getTrader().getCity());
		} else {
			System.out.println("No transactions found.");
		}
	}
}
