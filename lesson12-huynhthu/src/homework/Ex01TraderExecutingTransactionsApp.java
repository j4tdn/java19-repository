package homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import utils.CollectionUtils;

public class Ex01TraderExecutingTransactionsApp {
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
    	
		//Find all transactions in the year 2011 and sort them by value (small to high).
		
		List<Transaction> transactionYear = transactions.stream()
				.filter( t -> t.getYear() == 2011)
				.sorted((t1, t2) -> t1.getValue() - t2.getValue())
				.collect(Collectors.toList());
		CollectionUtils.generate("1.Find all transactions in the year 2011 and sort them by value (small to high)", transactionYear);
		
	
		
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> transactionValue = transactions.stream()
				.filter(t -> t.getValue() > 300)
				.sorted((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()))
				.collect(Collectors.toList());
		CollectionUtils.generate("2. Find all transactions have value greater than 300 and sort them by trader’s city",transactionValue );
		
		//3. What are all the unique cities where the traders work?
		List<String> uniqueCity = transactions.stream()
				.map(t -> t.getTrader().getCity())
				.distinct()
				.collect(Collectors.toList());
		CollectionUtils.generate("3. What are all the unique cities where the traders work?", uniqueCity);
		
		//4. Find all traders from Cambridge and sort them by name desc
		
		List<Transaction> traders = transactions.stream()
				.filter(t -> t.getTrader().getCity() == "Cambridge")
				.sorted((t1, t2) -> t1.getTrader().getName().compareTo(t2.getTrader().getName()))
				.collect(Collectors.toList());
		CollectionUtils.generate("4. Find all traders from Cambridge and sort them by name desc", traders);
		
		//5. Return a string of all traders’ names sorted alphabetically.
		String traderNames = transactions.stream()
				.map(t -> t.getTrader().getName())
				.sorted()
				.collect(Collectors.joining(" "));
		System.out.println("5. Return a string of all traders’ names sorted alphabetically: " + traderNames + "\n");
		
		
		//6. Are any traders based in Milan?

		List<Transaction> milanTrader = transactions.stream()
				.filter(t -> t.getTrader().getCity() == "Milan")
				.collect(Collectors.toList());
		CollectionUtils.generate("6. Are any traders based in Milan?", milanTrader);
		
		
		//7. Count the number of traders in Milan.
		
		Long countTraders = transactions.stream()
				.filter(t -> t.getTrader().getCity().equals("Milan"))
				.count();
		System.out.println("7. Count the number of traders in Milan: " + countTraders );
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		List<Transaction> tradersp = transactions.stream()
				.filter(t -> t.getTrader().getCity() == "Cambridge")
				.sorted((t1, t2) -> t1.getTrader().getName().compareTo(t2.getTrader().getName()))
				.collect(Collectors.toList());
		CollectionUtils.generate("8. Print all transactions’ values from the traders living in Cambridge.", tradersp);
		
		//9. What’s the highest value of all the transactions?
		Transaction maxTransaction = transactions.stream()
				.max(Comparator.comparing(Transaction::getValue))
				.orElse(new Transaction());
		
		System.out.println("9. What’s the highest value of all the transactions? \n" + maxTransaction);
		
		
		//10. Find the transaction with the smallest value.
		Transaction minTransaction = transactions.stream()
				.min(Comparator.comparing(Transaction::getValue))
				.orElse(new Transaction());
		
		System.out.println("10. Find the transaction with the smallest value: \n" + minTransaction);

	}
    
    
    
}
