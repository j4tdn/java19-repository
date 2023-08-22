package view.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TransactionApp {
public static void main(String[] args) {
	
	List<Transaction> transactions = mockData();
	// 1. Find all transactions in the year 2011 and sort them by value (small to high).
	List<Transaction> result1s = new ArrayList<>();
	transactions.forEach(transaction -> {
		if(transaction.getYear() == 2011) {
			result1s.add(transaction);
			
		}
		
	});
	Collections.sort(result1s, Comparator.comparingLong(Transaction::getValue));
	for(Transaction result: result1s) {
		System.out.println(result);
	};
	// 2. Find all transactions have value greater than 300 and sort them by trader’s city
	List<Transaction> results2 = new ArrayList<>();
		for(Transaction value : transactions) {
			if(value.getValue() > 300) {
				results2.add(value);
			}
		}
		
		
		;
	// 3. What are all the unique cities where the traders work?
			
	// 4. Find all traders from Cambridge and sort them by name desc.
			
	// 5. Return a string of all traders’ names sorted alphabetically.
			
	// 6. Are any traders based in Milan?
			
	// 7. Count the number of traders in Milan.
			
	// 8. Print all transactions’ values from the traders living in Cambridge.
			
	// 9. What’s the highest value of all the transactions?
			
	// 10. Find the transaction with the smallest value
			
}

private static List<Transaction> mockData(){
	Trader raoul = new Trader("Raoul", "Cambridge");
	Trader mario = new Trader("Mario", "Milan");
	Trader alan = new Trader("Alan", "Cambridge");
	Trader brian = new Trader("Brian", "Cambridge");
	return List.of(
		new Transaction(brian, 2011, 300L),
		new Transaction(raoul, 2012, 1000L), 
		new Transaction(raoul, 2011, 400L),
		new Transaction(mario, 2012, 710L), 
		new Transaction(mario, 2012, 700L), 
		new Transaction(alan,  2012, 950L)
			);
}
}
