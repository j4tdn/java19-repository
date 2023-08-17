package view.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class TransactionApp {
	public static void main(String[] args) {
		List<Transaction> transactions = mockData();

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		printf("\nTransactions in the year 2011 and sort them by value ASC ", findAllTransactions(transactions,
				transaction -> transaction.getYear() == 2011, Comparator.comparing(Transaction::getValue)));

		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		printf("\nTransactions have value greater than 300 and sort them by trader’s city ",
				findAllTransactions(transactions, transaction -> transaction.getValue() > 300,
						Comparator.comparing(transaction -> transaction.getTrader().getCity())));

		// 3. What are all the unique cities where the traders work?
		printf("\nAll the unique cities where the traders work ", findAllUniqueCitiesInTraders(transactions));

		// 4. Find all traders from Cambridge and sort them by name desc.
		printf("\nFind all traders from Cambridge and sort them by name desc ", findAllTradersFromCitySortBy(
				tradersFromCity(transactions, "Cambridge"), Comparator.comparing(Trader::getName).reversed()));

		// 5. Return a string of all traders’ names sorted alphabetically.
		printf("\nReturn a string of all traders’ names sorted alphabetically",
				getTradersNamesSortedAlphabetically(transactions));

		// 6. Are any traders based in Milan?
		boolean hasTradersInMilan = hasTradersInCity(transactions, "Milan");
		System.out.println("\nAre any traders based in Milan? " + hasTradersInMilan);

		// 7. Count the number of traders in Milan.
		long countTradersInMilan = countTradersInCity(transactions, "Milan");
		System.out.println("\nNumber of traders in Milan: " + countTradersInMilan);

		// 8. Print all transactions’ values from the traders working in Cambridge.
		printf("\n Transactions’ values from the traders working in Cambridge ",
	               transactionValues(transactions, transaction -> transaction.getTrader().getCity().equals("Cambridge")));
		// 9. What’s the highest value of all the transactions?
		List<Long> transactionValue = transactionValues(transactions, null);
		transactionValue.sort(Comparator.naturalOrder());
		System.out.println("The highest value of all the transactions : " + transactionValue.get(transactionValue.size() - 1));
		// 10. Find the transaction with the smallest value
		System.out.println("The highest value of all the transactions : " + transactionValue.get(0));
	}

	private static List<Long> transactionValues(List<Transaction> transactions, Predicate<Transaction> filter) {
		List<Long> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if(filter != null) {
				if (filter.test(transaction)) {
					result.add(transaction.getValue());
				}
			}
			else {
				result.add(transaction.getValue());
			}
		}
		return result;
    }


	private static boolean hasTradersInCity(List<Transaction> transactions, String city) {
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals(city)) {
				return true;
			}
		}
		return false;
	}

	private static long countTradersInCity(List<Transaction> transactions, String city) {
		long count = 0;
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals(city)) {
				count++;
			}
		}
		return count;
	}

	private static List<String> getTradersNamesSortedAlphabetically(List<Transaction> transactions) {
		Set<String> names = new TreeSet<>();
		for (Transaction transaction : transactions) {
			names.add(transaction.getTrader().getName());
		}
		return new ArrayList<>(names);
	}

	private static List<Trader> findAllTradersFromCitySortBy(List<Trader> traders, Comparator<Trader> comparator) {
		List<Trader> sortedTraders = new ArrayList<>(traders);
		sortedTraders.sort(comparator);
		return sortedTraders;
	}

	private static List<Trader> tradersFromCity(List<Transaction> transactions, String city) {
		List<Trader> traders = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals(city)) {
				traders.add(transaction.getTrader());
			}
		}
		return traders;
	}

	private static List<String> findAllUniqueCitiesInTraders(List<Transaction> transactions) {
		Set<String> uniqueCities = new HashSet<>();
		for (Transaction transaction : transactions) {
			uniqueCities.add(transaction.getTrader().getCity());
		}
		return new ArrayList<>(uniqueCities);
	}

	private static <T> List<T> findAllTransactions(List<T> items, Predicate<T> filter, Comparator<T> comparator) {
		List<T> result = new ArrayList<>();
		for (T item : items) {
			if (filter.test(item)) {
				result.add(item);
			}
		}
		result.sort(comparator);
		return result;
	}

	private static <E> void printf(String prefix, List<E> lstE) {
		System.out.println(prefix + "\n");
		for (E e : lstE) {
			System.out.println(e);
		}
	}

	private static List<Transaction> mockData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		return List.of(new Transaction(brian, 2011, 400L), new Transaction(raoul, 2012, 1000L),
				new Transaction(raoul, 2011, 300L), new Transaction(mario, 2012, 710L),
				new Transaction(mario, 2012, 700L), new Transaction(alan, 2012, 950L));
	}

}
