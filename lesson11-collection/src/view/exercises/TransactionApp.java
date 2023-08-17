package view.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TransactionApp {
	public static void main(String[] args) {
		List<Transaction> transactions = mockData();

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		List<Transaction> result1 = ex01(transactions, 2011);
		System.out.println(result1);

		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		List<Transaction> result2 = ex02(transactions, 300);
		System.out.println(result2);

		// 3. What are all the unique cities where the traders work?
		List<String> result3 = ex03(transactions);
		System.out.println(result3);

		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> result4 = ex04(transactions, "Cambridge");
		System.out.println(result4);

		// 5. Return a string of all traders’ names sorted alphabetically.
		String result5 = ex05(transactions);
		System.out.println(result5);

		// 6. Are any traders based in Milan?
		boolean result6 = ex06(transactions, "Milan");
		System.out.println(result6);
		// 7. Count the number of traders in Milan.

		// 8. Print all transactions’ values from the traders living in Cambridge.

		// 9. What’s the highest value of all the transactions?

		// 10. Find the transaction with the smallest value

	}

	private static List<Transaction> ex01(List<Transaction> transactions, int year) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getYear() == year) {
				result.add(transaction);
			}
		}
		result.sort(Comparator.comparing(Transaction::getValue));
		return result;
	}

	private static List<Transaction> ex02(List<Transaction> transactions, long value) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getValue() > value) {
				result.add(transaction);
			}
		}
		result.sort(Comparator.comparing(transaction -> transaction.getTrader().getLivingCity()));
		return result;
	}

	private static List<String> ex03(List<Transaction> transactions) {
		List<String> uniqueCities = new ArrayList<>();
		for (Transaction transaction : transactions) {
			String city = transaction.getTrader().getLivingCity();
			if (!uniqueCities.contains(city)) {
				uniqueCities.add(city);
			}
		}
		return uniqueCities;
	}

	private static List<Trader> ex04(List<Transaction> transactions, String city) {
		List<Trader> tradersFromCity = new ArrayList<>();
		for (Transaction transaction : transactions) {
			Trader trader = transaction.getTrader();
			if (trader.getLivingCity().equals(city)) {
				tradersFromCity.add(trader);
			}
		}
		tradersFromCity.sort(Collections.reverseOrder(Comparator.comparing(Trader::getFullname)));
		return tradersFromCity;
	}

	private static String ex05(List<Transaction> transactions) {
		List<String> traderNames = new ArrayList<>();
		for (Transaction transaction : transactions) {
			String name = transaction.getTrader().getFullname();
			if (!traderNames.contains(name)) {
				traderNames.add(name);
			}
		}
		Collections.sort(traderNames);
		return String.join(", ", traderNames);
	}

	private static boolean ex06(List<Transaction> transactions, String city) {
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getLivingCity().equals(city)) {
				return true;
			}
		}
		return false;
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
