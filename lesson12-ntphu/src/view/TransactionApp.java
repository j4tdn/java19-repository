package view;

import static java.util.Comparator.*;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

import static utils.CollectionUtils.*;

public class TransactionApp {
	
	public static void main(String[] args) {
		
				List<Transaction> transactions = mockData();
				
				// 1. Find all transactions in the year 2011 and sort them by value (small to high).
				var result1 = transactions.stream()
						.filter(transaction -> transaction.getYear() == 2011)
						.sorted(comparing(Transaction::getValue))
						.collect(Collectors.toList());
				
				generate("1. Find all transactions in the year 2012 and sort them by value (small to high)", result1);
				
				
				// 2. Find all transactions have value greater than 300 and sort them by trader’s city
				
				var result2 = transactions.stream()
						.filter(transaction -> transaction.getValue() > 300)
						.sorted(comparing(transaction -> transaction.getTrader().getCity()))
						.collect(Collectors.toList());
				
				
				
				
				generate("2. Find all transactions have value greater than 300 and sort them by trader’s city", result2);
				
				// 3. What are all the unique cities where the traders work?
				
				var result3 = transactions.stream()
						.map(transaction -> transaction.getTrader().getCity())
						.collect(Collectors.toSet());
				
				generate("3. What are all the unique cities where the traders work?", result3);
				
				// 4. Find all traders from Cambridge and sort them by name desc.
				
				var result4 = transactions.stream()
						.map(Transaction::getTrader)
						.filter(trader -> trader.getCity().equals("Cambridge"))
						.sorted(comparing(Trader::getName).reversed())
						.collect(Collectors.toList());
				
				generate("4. Find all traders from Cambridge and sort them by name desc.", result4);
				
				// 5. Return a string of all traders’ names sorted alphabetically.
				
				var result5 = transactions.stream()
						.map(transaction -> transaction.getTrader().getName()).distinct()
						.sorted()
						.collect(Collectors.joining(", "));
				
				System.out.println("5. Return a string of all traders’ names sorted alphabetically --> " + result5);
				
				// 6. Are there any traders based in Milan?
				
				var result6 = transactions.stream()
						.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
				
				System.out.println("\n6. Are there any traders based in Milan --> " + result6  );
				
				// 7. Count the number of traders in Milan.
				var result7 = transactions.stream()
						.map(Transaction::getTrader)
						.filter(trader -> trader.getCity().equals("Milan"))
						.count();
				System.out.println("\n7. Count the number of traders in Milan. --> " + result7  );
				
				// 8. Print all transactions’ values from the traders working in Cambridge.
				
				var result8 = transactions.stream()
						.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
						.map(Transaction::getValue)
						.collect(Collectors.toList());
				
				generate("\n8. Print all transactions’ values from the traders working in Cambridge", result8);
				
				// 9. What’s the highest value of all the transactions?
				
				var result9 = transactions.stream()
						.max(comparing(Transaction::getValue));
				
				
				System.out.println("\n9. What’s the highest value of all the transactions -->" + result9);
				
				// 10. Find the transaction with the smallest value
				
				var result10 = transactions.stream()
						.min(comparing(Transaction::getValue));
				
				
				System.out.println("\n10. Find the transaction with the smallest value " + result10);
				
				// Thời gian: 30p --> 9h17
				// Push lên nhánh workspace-hoten của chính mình
				
				
				
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
