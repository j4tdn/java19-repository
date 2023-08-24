package exercises;

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

public class TransactionApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Transaction> transactions = mockData();

		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> result = fitter(transactions, t -> t.getYear() == 2012);
		//Function<Transaction, Long> f = (Transaction t) -> t.getValue()
		//Function<Transaction, Long> f = Transaction::getValue
		result.sort(comparing(t -> t.getValue()));
		generate("1. Find all transactions in the year 2011 and sort them by value (small to high): ", result);
		
		reset(result);
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		result = fitter(transactions, t -> t.getValue() > 300);
		result.sort(comparing(t -> t.getTrader().getLivingCity()));
		generate("Find all transactions have value greater than 300 and sort them by trader’s city: ", result);
		
		// 3. What are all the unique cities where the traders work?
		Set<String> cities = new HashSet<>(mapping(transactions, t -> t.getTrader().getLivingCity()));
		generate("What are all the unique cities where the traders work?:", cities);
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> traders = new ArrayList<>();
		transactions.forEach(t -> {
			Trader trader = t.getTrader();
			if("Cambridge".equals(trader.getLivingCity())) {
				traders.add(trader);
			}
		});
		generate("Find all traders from Cambridge and sort them by name desc:", traders);
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		Set<String> traderNames = new TreeSet<>(mapping(transactions, t -> t.getTrader().getFullname()));
		System.out.println("5. Return a string of all traders’ names sorted alphabetically --> " +  String.join(", ", traderNames));

		// 6. Are any traders based in Milan?
		

		// 7. Count the number of traders in Milan.
		

		// 8. Print all transactions’ values from the traders working in Cambridge.
		
		
		// 9. What’s the highest value of all the transactions?
		
		
		// 10. Find the transaction with the smallest value
		
	}
	
	// Tìm kiếm những phần tử trong elements thỏa mãn điều kiện ở predicate
	// List<E> elements
	private static <E> List<E> fitter(List<E> elements, Predicate<E> predicate) {
		List<E> result = new ArrayList<>();
		elements.forEach(e -> {
			if(predicate.test(e)) {
				result.add(e);
			}
		});
		return result;
	}
	
	private static <E, R> List<R> mapping(Collection<E> elements, Function<E, R> function) {
		List<R> result = new ArrayList<>();
		elements.forEach(e -> {
			result.add(function.apply(e));
		});
		return result;
	}
	
	
	private static <E> void reset(List<E> elements){
		elements.removeAll(elements);
	}
	
	public static <E> void generate(String prefix, Collection<E> collection) {
		System.out.println(prefix + " --> {");

		for (E element : collection) {
			System.out.println("     " + element);
		}

		System.out.println("}\n");
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

