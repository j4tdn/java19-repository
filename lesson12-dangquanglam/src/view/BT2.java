package view;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

import static java.util.Comparator.*;

public class BT2 {
	public static void main(String[] args) {
		List<Transaction> transactions = moockData();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		var transactionsIn2011 = transactions.stream()
				.filter(transaction -> transaction.getYear() == 2011)
				.sorted(comparing(Transaction::getValue))
				.collect(Collectors.toList());

		System.out.println("Transactions in 2011 (sorted by value):");
		for (Transaction transaction : transactionsIn2011) {
			System.out.println(transaction.getTrader().getName() + " - " + transaction.getValue());
		}
		
		System.out.println("==========================================");

		// 2. Find all transactions have value greater than 300 and sort them bytrader’s city
		var transactionsWithValueGreaterThan300 = transactions.stream()
				.filter(transaction -> transaction.getValue() > 300)
				.sorted(comparing(transaction -> transaction.getTrader().getCity()))
				.collect(Collectors.toList());

		System.out.println("Transactions with value greater than 300 (sorted by trader's city):");
		for (Transaction transaction : transactionsWithValueGreaterThan300) {
			System.out.println(transaction.getTrader().getName() + " - " + transaction.getTrader().getCity());
		}
		
		System.out.println("==========================================");

		// 3. What are all the unique cities where the traders work?
		var uniqueCities = transactions.stream()
				.map(transaction -> transaction.getTrader().getCity())
				.collect(Collectors.toSet());

		System.out.println("Unique cities where the traders work:");
		for (String city : uniqueCities) {
			System.out.println(city);
		}
		
		System.out.println("==========================================");

		// 4. Find all traders from Cambridge and sort them by name desc.
		var tradersFromCambridge = transactions.stream()
				.map(Transaction::getTrader)
				.filter(trader -> trader.getCity().equals("Cambridge"))
				.sorted(comparing(Trader::getName).reversed())
				.collect(Collectors.toList());

		System.out.println("Traders from Cambridge (sorted by name desc):");
		for (Trader trader : tradersFromCambridge) {
			System.out.println(trader.getName());
		}
		
		System.out.println("==========================================");

		// 5. Return a string of all traders’ names sorted alphabetically.
		var allTradersNames = transactions.stream()
				.map(transaction -> transaction.getTrader().getName()).distinct()
				.sorted()
				.collect(Collectors.joining(", "));

		System.out.println("All traders' names sorted alphabetically: " + allTradersNames);

		System.out.println("==========================================");
		
		// 6. Are any traders based in Milan?
		var tradersBasedInMilan = transactions.stream()
				.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));

		System.out.println("Are any traders based in Milan? " + tradersBasedInMilan);

		System.out.println("==========================================");
		
		// 7. Count the number of traders in Milan.
		var tradersCountInMilan = transactions.stream()
				.map(Transaction::getTrader)
				.filter(trader -> trader.getCity().equals("Milan"))
				.count();

		System.out.println("Number of traders in Milan: " + tradersCountInMilan);

		System.out.println("==========================================");
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		var transactionsValuesFromCambridge = transactions.stream()
				.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue)
				.collect(Collectors.toList());

		System.out.println("Transactions' values from the traders living in Cambridge:");
		for (Long value : transactionsValuesFromCambridge) {
			System.out.println(value);
		}

		System.out.println("==========================================");
		
		// 9. What’s the highest value of all the transactions?
		var highestValue = transactions.stream()
				.mapToLong(Transaction::getValue)
				.max()
				.orElse(0L);// trả về giá trị 0L nếu không tìm thấy giá trị lớn nhất.

		System.out.println("Highest value of all the transactions: " + highestValue);

		System.out.println("==========================================");
		
		// 10. Find the transaction with the smallest value.
		var transactionWithSmallestValue = transactions.stream()
				.min(comparing(Transaction::getValue))
				.orElse(null); //trả về giá trị null nếu không tìm thấy giá trị lớn nhất.

		System.out.println("Transaction with the smallest value: "
				+ (transactionWithSmallestValue != null ? transactionWithSmallestValue.getValue()
						: "No transaction found."));
	}

	public static List<Transaction> moockData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		Trader tera = new Trader("Tera", "DaNang");

		return List.of(new Transaction(brian, 2011, 300L), new Transaction(raoul, 2012, 1000L),
				new Transaction(tera, 2011, 400L), new Transaction(mario, 2012, 710L),
				new Transaction(mario, 2012, 700L), new Transaction(tera, 2012, 950L),
				new Transaction(alan, 2011, 320L), new Transaction(tera, 2015, 670L),
				new Transaction(alan, 2014, 990L));
	}
}
