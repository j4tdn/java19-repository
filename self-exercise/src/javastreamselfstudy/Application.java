package javastreamselfstudy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Application {
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
			new Transaction(alan, 2012, 950)
			);
	
	// 1. Find all transactions in the year 2011 and sort them by value (small to high).
	List<Transaction> transaction2011 = transactions.stream()
			.filter(transaction -> transaction.getYear() == 2011)
			.sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
	transaction2011.forEach(System.out::println);
	System.out.println("==================================");
	// 2. Find all transactions have value greater than 300 and sort them by trader’s city
	List<Transaction> transaction300 = transactions.stream()
			.filter(transaction -> transaction.getValue() > 300)
			.sorted(Comparator.comparing(transaction ->  transaction.getTrader().getCity()))
			.collect(Collectors.toList());
	transaction300.forEach(System.out::println);
	System.out.println("==================================");
	//3. What are all the unique cities where the traders work?
	List<String> cities = transactions.stream()
			.map(transaction -> transaction.getTrader().getCity())
			.distinct().collect(Collectors.toList());
	cities.forEach(System.out::println);
	System.out.println("==================================");
	//4. Find all traders from Cambridge and sort them by name desc.
	List<Trader> traderCambridge = transactions.stream().map(Transaction::getTrader)
			.filter(trader -> trader.getCity().equals("Cambridge"))
			.sorted(Comparator.comparing(Trader::getName).reversed())
			.collect(Collectors.toList());
	traderCambridge.forEach(System.out::println);
	System.out.println("==================================");
	//5. Return a string of all traders’ names sorted alphabetically.
	
}
}
