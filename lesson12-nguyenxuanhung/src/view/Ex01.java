package view;

import java.lang.invoke.VarHandle;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import static utils.CollectionUtils.*;

public class Ex01 {
	public static void main(String[] args) {
		List<Transaction> transactions = mockData();
		//1. Find all transactions in the year 2011 and sort them by value (small to high).
		var transIn2011ValueASC = transactions.stream()
											.filter(t -> t.getYear() == 2011)
											.sorted(Comparator.comparing(Transaction::getValue))
											.collect(Collectors.toList());
		generate("1. Find all transactions in the year 2011 and sort them by value (small to high)", transIn2011ValueASC);
		
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		var transValueThan300TraderCityASC = transactions.stream()
												.filter(t -> t.getValue() > 300)
												.sorted(Comparator.comparing(t -> t.getTrader().getLivingCity()))
												.collect(Collectors.toList());
		generate("2. Find all transactions have value greater than 300 and sort them by trader’s city", transValueThan300TraderCityASC);
												
		//3. What are all the unique cities where the traders work?
		var allUniqueCityTraderWork = transactions.stream()
											.map(t -> t.getTrader().getLivingCity())
											.collect(Collectors.toSet());
		generate("3. What are all the unique cities where the traders work?", allUniqueCityTraderWork);
		
		//4. Find all traders from Cambridge and sort them by name desc.
		var traderFromCambrideNameDESC = transactions.stream()
											.filter(t ->  "Cambridge".equals(t.getTrader().getLivingCity()))
											.map(Transaction::getTrader)
											.distinct()
											.sorted(Comparator.comparing(Trader::getFullname).reversed())
											.collect(Collectors.toList());
		generate("4. Find all traders from Cambridge and sort them by name desc.", traderFromCambrideNameDESC);
		
		//5. Return a string of all traders’ names sorted alphabetically.
		
		var traderNameAlphaASC = transactions.stream()
											.map(t -> t.getTrader().getFullname())
											.sorted()
											.collect(Collectors.toSet());
		generate("5. Return a string of all traders’ names sorted alphabetically", traderNameAlphaASC);
		
		//6. Are any traders based in Milan?
		boolean areAnyTraderInMilan = transactions.stream()
											.anyMatch(t -> "Milan".equals(t.getTrader().getLivingCity()));
		System.out.println( "6. Are any traders based in Milan? --> "+ areAnyTraderInMilan);
		
		//7. Count the number of traders in Milan.
		Long countOfTraderInMilan = transactions.stream()
											.filter(t -> "Milan".equals(t.getTrader().getLivingCity()))
											.map(Transaction::getTrader)
											.distinct()
											.count();
		System.out.println("7. Count the number of traders in Milan. ==> " + countOfTraderInMilan );
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		
		var transValueFromTraderInCambrige = transactions.stream()
											.filter(t -> "Cambridge".equals(t.getTrader().getLivingCity()))
											.map(Transaction::getValue)
											.reduce(0L, (a, b) -> a + b);
		
		System.out.println("8. Print all transactions’ values from the traders living in Cambridge. -->"+ transValueFromTraderInCambrige);
		
		////9. What’s the highest value of all the transactions?
		var highestValueOfAllTrans = transactions.stream()
										.map(Transaction::getValue)
										.reduce(Long::max).get();
		System.out.println("9. What’s the highest value of all the transactions? --> " + highestValueOfAllTrans);
		
		
		//10. Find the transaction with the smallest value.
		var transHaveSmallestValue = transactions.stream()
										.reduce((a, b) -> a.getValue() <= b.getValue() ? a : b).get();
		System.out.println("10. Find the transaction with the smallest value. --> " + transHaveSmallestValue);
	}
	
	
	
	
	private static List<Transaction> mockData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		return List.of(new Transaction(brian, 2011, 300L),
				new Transaction(raoul, 2012, 1000L),
				new Transaction(raoul, 2011, 400L),
				new Transaction(mario, 2012, 710L),
				new Transaction(mario, 2012, 700L),
				new Transaction(alan, 2012, 950L));
	}
}
