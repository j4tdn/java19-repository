package view;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class App {

	public static void main(String[] args) {
		List<Transaction> transactions = mockData();

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		List<Transaction> transactionsIn2011 = transactions.stream()
				.filter(transaction -> transaction.getYear() == 2011)
				.sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());

		// 2. Find all transactions with value greater than 300 and sort them by
		// trader's city.
		List<Transaction> highValueTransactions = transactions.stream()
				.filter(transaction -> transaction.getValue() > 300)
				.sorted(Comparator.comparing(transaction -> transaction.getTrader().getCity()))
				.collect(Collectors.toList());

		// 3. What are all the unique cities where the traders work?
		List<String> uniqueCities = transactions.stream().map(transaction -> transaction.getTrader().getCity())
				.distinct().collect(Collectors.toList());

		// 4. Find all traders from Cambridge and sort them by name in descending order.
		List<Trader> tradersInCambridge = transactions.stream().map(Transaction::getTrader)
				.filter(trader -> trader.getCity().equals("Cambridge"))
				.sorted(Comparator.comparing(Trader::getName).reversed()).collect(Collectors.toList());

		// 5. Return a string of all traders' names sorted alphabetically.
		String traderNames = transactions.stream().map(transaction -> transaction.getTrader().getName()).distinct()
				.sorted().collect(Collectors.joining(", "));

		// 6. Are any traders based in Milan?
		boolean tradersInMilan = transactions.stream()
				.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));

		// 7. Count the number of traders in Milan.
		long countTradersInMilan = transactions.stream().map(transaction -> transaction.getTrader())
				.filter(trader -> trader.getCity().equals("Milan")).count();

		// 8. Print all transactions' values from the traders living in Cambridge.
		transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue).forEach(System.out::println);

		// 9. What's the highest value of all the transactions?
		OptionalInt maxTransactionValue = transactions.stream().mapToInt(Transaction::getValue).max();

		// 10. Find the transaction with the smallest value.
		Optional<Transaction> minTransaction = transactions.stream()
				.min(Comparator.comparingInt(Transaction::getValue));

		// In ra kết quả
		System.out.println("1. Transactions in 2011 sorted by value: " + transactionsIn2011);
		System.out.println("2. High value transactions sorted by trader's city: " + highValueTransactions);
		System.out.println("3. Unique cities where traders work: " + uniqueCities);
		System.out.println("4. Traders in Cambridge sorted by name (desc): " + tradersInCambridge);
		System.out.println("5. All traders' names sorted alphabetically: " + traderNames);
		System.out.println("6. Are there any traders in Milan? " + tradersInMilan);
		System.out.println("7. Number of traders in Milan: " + countTradersInMilan);
		System.out.println("8. Transaction values from traders in Cambridge:");
		System.out.println("9. Highest transaction value: "
				+ (maxTransactionValue.isPresent() ? maxTransactionValue.getAsInt() : "N/A"));
		System.out.println("10. Transaction with the smallest value: "
				+ (minTransaction.isPresent() ? minTransaction.get() : "N/A"));
	}

	private static List<Transaction> mockData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
		return transactions;
	}
}
