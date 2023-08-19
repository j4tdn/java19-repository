package view.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TransactionApp {
	public static void main(String[] args) {
		List<Transaction> transactions = mockData();
		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		print(findTransactionsInYearAndSort(transactions, 2011));

		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		print(findTransactionsWithValueGreaterThanAndSort(transactions, 300L));

		// 3. What are all the unique cities where the traders work?
		print(findUniqueCities(transactions));

		// 4. Find all traders from Cambridge and sort them by name desc.
		print(ex04(transactions, "Cambridge"));

		// 5. Return a string of all traders’ names sorted alphabetically.
		print(getNameTraderSortedAlphabetically(transactions));

		// 6. Are any traders based in Milan?
		System.out.println(isMilan(transactions, "Milan"));

		// 7. Count the number of traders in Milan.
		System.out.println(getCountNumberOfTradersInMilan(transactions, "Milan"));

		// 8. Print all transactions’ values from the traders living in Cambridge.
		print(getAllTransactionsValueFromCambridge(transactions, "Cambridge"));
		// 9. What’s the highest value of all the transactions?
		System.out.println(getHighestValue(transactions));

		// 10. Find the transaction with the smallest value
		System.out.println(getSmallestValue(transactions));

	}

	private static List<Transaction> findTransactionsInYearAndSort(List<Transaction> transactions, Integer value) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getYear().equals(value)) {
				result.add(transaction);
			}
		}
		result.sort(Comparator.comparing(Transaction::getValue));
		return result;
	}

	private static List<Transaction> findTransactionsWithValueGreaterThanAndSort(List<Transaction> transactions,
			Long value) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getValue() > value) {
				result.add(transaction);
			}
		}
		result.sort(Comparator.comparing(transaction -> transaction.getTrader().getLivingCity()));
		return result;
	}

	private static List<String> findUniqueCities(List<Transaction> transactions) {
		List<String> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (!result.contains(transaction.getTrader().getLivingCity())) {
				result.add(transaction.getTrader().getLivingCity());
			}
		}
		return result;
	}

	private static List<Trader> ex04(List<Transaction> transactions, String name) {
		List<Trader> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getLivingCity().equals(name)) {
				result.add(transaction.getTrader());
			}
		}
		result.sort(Comparator.comparing(Trader::getLivingCity).reversed());
		return result;
	}

	private static List<String> getNameTraderSortedAlphabetically(List<Transaction> transactions) {
		List<String> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			result.add(transaction.getTrader().getFullname());
		}
		result.sort(Comparator.naturalOrder());
		return result;
	}

	private static boolean isMilan(List<Transaction> transactions, String living) {
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getLivingCity().equals(living))
				return true;
		}
		return false;
	}

	private static int getCountNumberOfTradersInMilan(List<Transaction> transactions, String living) {
		List<Trader> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (!result.contains(transaction.getTrader()) && transaction.getTrader().getLivingCity().equals(living)) {
				result.add(transaction.getTrader());
			}
		}
		return result.size();
	}

	private static List<Long> getAllTransactionsValueFromCambridge(List<Transaction> transactions, String living) {
		List<Long> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getLivingCity().equals(living)) {
				result.add(transaction.getValue());
			}
		}
		return result;
	}

	private static Long getHighestValue(List<Transaction> transactions) {
		Long maxValue = Long.MIN_VALUE;
		for (Transaction transaction : transactions) {
			Long valueTrader = transaction.getValue();
			if (valueTrader > maxValue)
				maxValue = valueTrader;
		}
		return maxValue;
	}

	private static Long getSmallestValue(List<Transaction> transactions) {
		Long minValue = Long.MAX_VALUE;
		for (Transaction transaction : transactions) {
			Long valueTrader = transaction.getValue();
			if (valueTrader < minValue)
				minValue = valueTrader;
		}
		return minValue;
	}

	private static <Element> void print(List<Element> result) {
		System.out.println(result);
		System.out.println("===========================================");
	}

	private static List<Transaction> mockData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		return List.of(new Transaction(brian, 2011, 300L), new Transaction(raoul, 2012, 1000L),
				new Transaction(raoul, 2011, 400L), new Transaction(mario, 2012, 710L),
				new Transaction(mario, 2012, 700L), new Transaction(alan, 2012, 950L));
	}

}
