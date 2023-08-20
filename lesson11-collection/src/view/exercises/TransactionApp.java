package view.exercises;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;


import static java.util.Comparator.*;
import static utils.CollectionUtils.*;

public class TransactionApp {
	
	public static void main(String[] args) {
		// immutable list
		List<Transaction> transactions = mockData();
		
		// 1. Find all transactions in the year 2012 and sort them by value (small to high).
		List<Transaction> result = filter(transactions, t -> t.getYear() == 2012);
		result.sort(comparing(t -> t.getValue()));
		generate("1. Find all transactions in the year 2012 and sort them by value (small to high)", result);
		
		reset(result);
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		result = filter(transactions, t -> t.getValue() > 300);
		result.sort(comparing(t -> t.getTrader().getCity()));
		generate("2. Find all transactions have value greater than 300 and sort them by trader’s city", result);
		
		// 3. What are all the unique cities where the traders work?
		// Collection<T> --> Collection<X> <==> X is an attribute of T
		// mapping
		Set<String> cities = new HashSet<>(mapping(transactions, t -> t.getTrader().getCity()));
		generate("3. What are all the unique cities where the traders work?", cities);
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> traders = filter(transactions, t -> "Cambridge".equals(t.getTrader().getCity()), t -> t.getTrader());
		generate("4. Find all traders from Cambridge and sort them by name desc.", traders);
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		Set<String> traderNames = new TreeSet<>(mapping(transactions, t -> t.getTrader().getFullname()));
		System.out.println("5. Return a string of all traders’ names sorted alphabetically --> " +  String.join(", ", traderNames));
		
		Set<Trader> milanTraders = Set.copyOf(filter(transactions, t -> "Milan".equals(t.getTrader().getCity()), t -> t.getTrader()));
		List<String> milanTradersAsString = mapping(milanTraders, t -> t.getFullname());
		String intergratedMilanTraders = String.join(",", milanTradersAsString);
		
		// 6. Are there any traders based in Milan?
		System.out.println("\n6. Are there any traders based in Milan --> " 
					    +  (milanTraders.size() > 0) + "{" + intergratedMilanTraders  + "}");
		
		// 7. Count the number of traders in Milan.
		System.out.println("\n7. Count the number of traders in Milan --> " 
						+ milanTraders.size() 
						+ "{" + intergratedMilanTraders + "}");
		
		// 8. Print all transactions’ values from the traders working in Cambridge.
		List<Entry<String, Long>> transactionValues = new ArrayList<>();
		transactions.forEach(t -> {
			Trader trader = t.getTrader();
			if ("Cambridge".equals(trader.getCity())) {
				transactionValues.add(new SimpleEntry<>(trader.getFullname(), t.getValue()));
			}
		});
		
		generate("\n8. Print all transactions’ values from the traders working in Cambridge", transactionValues);
		
		// 9. What’s the highest value of all the transactions?
		long maxTransactionValue = Long.MIN_VALUE;
		for(Transaction t: transactions) {
			if (t.getValue() > maxTransactionValue) {
				maxTransactionValue = t.getValue();
			}
		}
		System.out.println("9. What’s the highest value of all the transactions --> " + maxTransactionValue);
		
		// 10. Find the transaction with the smallest value
		long minTransactionValue = Long.MAX_VALUE;
		for(Transaction t: transactions) {
			if (t.getValue() < minTransactionValue) {
				minTransactionValue = t.getValue();
			}
		}
		System.out.println("\n10. Find the transaction with the smallest value --> " + minTransactionValue);
		
		// Thời gian: 30p --> 9h17
		// Push lên nhánh workspace-hoten của chính mình
	}
	
	// Tìm kiếm những phần tử trong elements thỏa mãn điều kiện ở predicate
	// List<E> elements
	private static <E, R> List<R> filter(List<E> elements, Predicate<E> predicate, Function<E, R> function) {
		List<R> result = new ArrayList<>();
		elements.forEach(e -> {
			if (predicate.test(e)) {
				result.add(function.apply(e));
			}
		});
		return result;
	}
	
	// Tìm kiếm những phần tử trong elements thỏa mãn điều kiện ở predicate
	// List<E> elements
	private static <E> List<E> filter(List<E> elements, Predicate<E> predicate) {
		List<E> result = new ArrayList<>();
		elements.forEach(e -> {
			if (predicate.test(e)) {
				result.add(e);
			}
		});
		return result;
	}
	
	// Collection<E> --> Collection<R> <==> R is an attribute of E
	// mapping
	private static <E, R> List<R> mapping(Collection<E> elements, Function<E, R> function) {
		List<R> result = new ArrayList<>();
		elements.forEach(e -> {
			result.add(function.apply(e));
		});
		return result;
	}
	
	private static List<Transaction> mockData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		Trader tera = new Trader("Tera", "DaNang");
		
		// immutable list
		return List.of(
			new Transaction(brian, 2011, 300L),
			new Transaction(raoul, 2012, 1000L), 
			new Transaction(tera, 2011, 400L),
			new Transaction(mario, 2012, 710L), 
			new Transaction(mario, 2012, 700L), 
			new Transaction(tera, 2012, 950L),
			new Transaction(alan, 2011, 320L),
			new Transaction(tera, 2015, 670L),
			new Transaction(alan, 2014, 990L)
		);
	}
}
