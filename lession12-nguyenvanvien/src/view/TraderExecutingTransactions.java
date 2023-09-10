package view;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.Comparator.*;

import bean.Trader;
import bean.Transaction;

public class TraderExecutingTransactions {
	private static List<Transaction> transactions;

	public static void main(String[] args) {
		transactions = mockData();

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).

		var transactionsIn2011 = findAllTran(t -> t.getYear().equals(2011),
				comparing(Transaction::getValue));
		generate("1. Find all transactions in the year 2011 and sort them by value (small to high).",
				transactionsIn2011);

		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		
		var transactionsValueGreaterThan300 = findAllTran(t -> t.getValue() >= 300,
				comparing(t -> t.getTrader().getCity()));
		generate("2. Find all transactions have value greater than 300 and sort them by trader’s city",
				transactionsValueGreaterThan300);

		// 3. What are all the unique cities where the traders work?
		
		var uniqueCities = transactions.stream()
				.map(t -> t.getTrader().getCity())
				.distinct()
				.collect(Collectors.toList());
		generate("3. What are all the unique cities where the traders work?",
				uniqueCities);
		// 4. Find all traders from Cambridge and sort them by name desc.
		
		var findTradersFromCambridge = transactions.stream()
				.map(Transaction::getTrader)
				.filter(trader ->trader.getCity().equals("Cambridge"))
				.sorted(comparing(Trader::getName).reversed())
				.distinct()
				.collect(Collectors.toList());
		generate("4. Find all traders from Cambridge and sort them by name desc.",
				findTradersFromCambridge);
		// 5. Return a string of all traders’ names sorted alphabetically.
		
		var getTradersNames = transactions.stream()
				.map(t->t.getTrader().getName())
				.sorted()
				.collect(Collectors.toList());
		generate("5. Return a string of all traders’ names sorted alphabetically.",
				getTradersNames);
		// 6. Are any traders based in Milan?
		
		var hasTradersInMilan = transactions.stream()
				.anyMatch(t -> t.getTrader().getCity().equals("Milan"));
		System.out.println("6. Are any traders based in Milan? " + hasTradersInMilan);
		
		// 7. Count the number of traders in Milan.
		
		var numberOfTradersMilan = transactions.stream()
				.map(Transaction::getTrader)
				.distinct()
				.filter(t -> t.getCity().equals("Milan"))
				.count();
		System.out.println("7. Count the number of traders in Milan :  " + numberOfTradersMilan);
		// 8. Print all transactions’ values from the traders living in Cambridge.
		
		var transactionsValues = transactions.stream()
				.filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue)
				.collect(Collectors.toList());
		generate("8. Print all transactions’ values from the traders living in Cambridge.", transactionsValues);
		
		// 9. What’s the highest value of all the transactions?
		
		var highestValueOfTransactions = transactions.stream()
				.mapToInt(Transaction::getValue)
				.max().getAsInt();
		System.out.println("9. The highest value of all the transactions :  " + highestValueOfTransactions);
		
		// 10. Find the transaction with the smallest value.
		var minValueOfTransactions = transactions.stream()
				.mapToInt(Transaction::getValue)
				.min().getAsInt();
		System.out.println("10. The smallest value of all the transactions :  " + minValueOfTransactions);
	}

	private static List<Transaction> findAllTran(Predicate<Transaction> tranPredicate,
			Comparator<Transaction> tranComparator) {
		return transactions.stream().filter(tranPredicate).sorted(tranComparator).collect(Collectors.toList());
	}

	private static <E> void generate(String prefix, Collection<E> collection) {
		System.out.println(prefix + "{\n");
		for (E element : collection) {
			System.out.println("	" + element);
		}
		System.out.println("\n}");
	}

	private static List<Transaction> mockData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		Trader tera = new Trader("Tera", "DaNang");

		return List.of(new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000),
				new Transaction(tera, 2011, 400), new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700),
				new Transaction(tera, 2012, 950), new Transaction(alan, 2011, 320), new Transaction(tera, 2015, 670),
				new Transaction(alan, 2014, 990));
	}
}

