package stream.view;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import stream.bean.Trader;
import stream.bean.Transaction;
import utils.CollectionUtils;

public class ManageTransaction {
	public static void main(String[] args) {
		List<Transaction> transactions = mockData();
		
//		1. Find all transactions in the year 2011 and sort them by value (small to high).
		CollectionUtils.generate("1. Find all transactions in the year 2011 and sort them by value (small to high)" ,
				transactions.stream()
				.filter(transaction -> transaction.getYear() == 2011)
				.sorted(comparing(Transaction::getValue))
				.collect(Collectors.toList()));
		
//		2. Find all transactions have value greater than 300 and sort them by trader’s city
		CollectionUtils.generate("2. Find all transactions have value greater than 300 and sort them by trader’s city" ,
				transactions.stream()
				.filter(transaction -> transaction.getValue() > 300)
				.sorted(comparing(transaction -> transaction.getTrader().getCity()))
				.collect(Collectors.toList()));
		
//		3. What are all the unique cities where the traders work?
		CollectionUtils.generate("3. What are all the unique cities where the traders work" ,
				transactions.stream()
				.map(transaction -> transaction.getTrader().getCity())
				.distinct()
	            .collect(Collectors.toList()));
		
//		4. Find all traders from Cambridge and sort them by name desc.
		CollectionUtils.generate("4. Find all traders from Cambridge and sort them by name desc" ,
				transactions.stream().filter(transaction -> transaction.getTrader().getCity() == "Cambridge")
				.sorted(comparing(transaction -> transaction.getTrader().getName()))
	            .collect(Collectors.toList()));
		
//		5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("5. Return a string of all traders’ names sorted alphabetically: \n" +
				transactions.stream()
				.map(transaction -> transaction.getTrader().getName())
				.distinct()
				.sorted()
				.collect(Collectors.joining (", ")));
		
//		6. Are any traders based in Milan?
		System.out.println("\n6. Are any traders based in Milan? " + transactions.stream().anyMatch(transaction -> transaction.getTrader().getCity() == "Milan"));
		
//		7. Count the number of traders in Milan.
		System.out.println("\n7. Count the number of traders in Milan: " +
				transactions.stream().map(Transaction::getTrader)
				.filter(trader -> trader.getCity() == "Milan").distinct().count() + "\n");
		
//		8. Print all transactions’ values from the traders living in Cambridge.
		CollectionUtils.generate("8. Print all transactions’ values from the traders living in Cambridge" ,
				transactions.stream()
				.filter(transaction -> transaction.getTrader().getCity() == "Cambridge")
				.map(Transaction::getValue)
	            .collect(Collectors.toList()));
//		9. What’s the highest value of all the transactions?
		CollectionUtils.generate("9. What’s the highest value of all the transactions :" ,
				transactions.stream()
				.sorted(comparing(Transaction::getValue).reversed())
	            .map(Transaction::getValue)
	            .limit(1).collect(Collectors.toList()));
//		10. Find the transaction with the smallest value.
		CollectionUtils.generate("9. What’s the highest value of all the transactions :" ,
				transactions.stream()
				.sorted(comparing(Transaction::getValue))
	            .limit(1).collect(Collectors.toList()));
	}
	
	private static List<Transaction> mockData(){
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
				);
		return transactions;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
