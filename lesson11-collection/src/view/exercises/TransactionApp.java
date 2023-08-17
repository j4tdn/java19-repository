package view.exercises;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TransactionApp {
	
	public static void main(String[] args) {
		List<Transaction> transactions = mockData();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		printf(getTransactionByYear(transactions, 2011));
		
		// 2. Find all transactions have value greater than 300 and sort them by trader�s city
		printf(getTransactionByValueHigherThan(transactions, 300));
		
		// 3. What are all the unique cities where the traders work?
		getUniqueCity(transactions);
		System.out.println("--------------------------------------------");
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		printf(getTraderByCity(transactions, "Cambridge"));
		
		// 5. Return a string of all traders� names sorted alphabetically.
		printf(getAllTraderName(transactions));
		
		// 6. Are any traders based in Milan?
		printf(getTraderByCity(transactions, "Milan"));
		
		// 7. Count the number of traders in Milan.
		System.out.println(getTraderByCity(transactions, "Milan").size());
		System.out.println("--------------------------------------------");
		
		// 8. Print all transactions� values from the traders living in Cambridge.
		printf(getTransactionValueByCity(transactions, "Cambridge"));
		
		// 9. What�s the highest value of all the transactions?
		List<Transaction> tempTransactions = new ArrayList<>(transactions);
		tempTransactions.sort(comparing(Transaction::getValue));
		System.out.println("Highest value: "+ tempTransactions.get(tempTransactions.size() - 1).getValue());
		System.out.println("--------------------------------------------");
		
		// 10. Find the transaction with the smallest valu
		System.out.println("Transaction with the smallest value: "+ tempTransactions.get(0));
		
	}
	
	
	
	private static List<Transaction> getTransactionByYear(List<Transaction> transactions, Integer year) {	
		List<Transaction> transactionsInYear = new ArrayList<>();
		for(Transaction transaction: transactions) {
			 if(transaction.getYear().equals(year)) {
				 transactionsInYear.add(transaction);
			 }
		}
		transactionsInYear.sort(comparing(Transaction::getValue));
		return transactionsInYear;
	}
	
	private static List<Transaction> getTransactionByValueHigherThan(List<Transaction> transactions, Integer value) {	
		List<Transaction> transactionsHigherThan = new ArrayList<>();
		for(Transaction transaction: transactions) {
			 if(transaction.getValue() > value) {
				 transactionsHigherThan.add(transaction);
			 }
		}
		
		transactionsHigherThan.sort(comparing(transaction -> transaction.getTrader().getCity()));
		return transactionsHigherThan;
	}
	
	private static void getUniqueCity(List<Transaction> transactions) {	
		Set<String> citys = new HashSet<>();
		for(Transaction transaction: transactions) {
			 citys.add(transaction.getTrader().getCity());
		}
		citys.forEach(city -> System.out.println(city));
	}
	
	private static List<Trader> getTraderByCity(List<Transaction> transactions, String city){
		List<Trader> traderByCity = new ArrayList<>();
		for(Transaction transaction: transactions) {
			 if(transaction.getTrader().getCity().equals(city)) {
				 traderByCity.add(transaction.getTrader());
			 }
		}
		traderByCity.sort(comparing(Trader::getName,reverseOrder()));
		return traderByCity;
	}
	
	private static List<String> getAllTraderName(List<Transaction> transactions){
		Set<String> names = new HashSet();
		for(Transaction transaction: transactions) {
			 names.add(transaction.getTrader().getName());
		}
		List<String> namesSorted = new ArrayList<>(names);
		namesSorted.sort(null);
		return namesSorted;
	}
	
	private static List<Long> getTransactionValueByCity(List<Transaction> transactions, String city){
		List<Long> values = new ArrayList<>();
		for(Transaction transaction: transactions) {
			 if(transaction.getTrader().getCity().equals(city)) {
				 values.add(transaction.getValue());
			 }
		}
		return values;
	}
	
	
	private static <Element>void printf(List<Element> elements) {
		for (Element element : elements) {
			System.out.println(element);
		}
		System.out.println("--------------------------------------------");
	}
	
	private static List<Transaction> mockData() {
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
			new Transaction(alan, 2012, 950L)
		);
	}
	
	
	
	
	
	
	
	
}