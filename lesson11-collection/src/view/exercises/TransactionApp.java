package view.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import static java.util.Comparator.*;
public class TransactionApp {
	public static void main(String[] args) {

		List<Transaction> transactions = mockData();
		
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high)."); 
		List<Transaction> ex01List = filterAndSort(
				  transactions,
				  Transaction::getYear, 
				  year -> ((Integer) year).compareTo(Integer.valueOf(2011)) == 0,
				  comparing(Transaction::getValue)
				);
		print("ex01List",ex01List);
		
		System.out.println("\n2. Find all transactions have value greater than 300 and sort them by trader’s city."); 
		List<Transaction> ex02List = filterAndSort(
				transactions, 
				Transaction::getValue, 
				value -> ((Long) value).compareTo(Long.valueOf(300)) > 0, 
				comparing(t -> ((Transaction) t).getTrader().getWoringCity()) 
				);
		print("ex02List",ex02List);
		
		
		System.out.println("\n3. What are all the unique cities where the traders work?");
		List<String> ex03List = getUniqueWorkingCity(transactions);
		print("ex03List", ex03List);
		
		
		System.out.println("\n4. Find all traders from Cambridge and sort them by name desc.");
		List<Trader> ex04List = new ArrayList<>();	
			filterAndSort(
				transactions,
				  t -> t.getTrader().getWoringCity(),
				  city -> city.equals("Cambridge"), 
				  comparing((Function<Transaction, String>) t -> t.getTrader().getName())
				).forEach(t -> {
					if(!ex04List.contains(t.getTrader()))
					ex04List.add(t.getTrader());
				});;
		print("ex04List", ex04List);
		
		System.out.println("\n5. Return a string of all traders’ names sorted alphabetically."); 
		List<String> ex05List = getSortedTraderName(transactions);
		print("ex05List", ex05List);
		
		System.out.println("\n6. Are any traders based in Milan?"); 
		List<Trader> ex06List = new ArrayList<>();	
		filterAndSort(
			transactions,
			  t -> t.getTrader().getWoringCity(),
			  city -> city.equals("Milan"), 
			  comparing((Function<Transaction, String>) t -> t.getTrader().getName())
			).forEach(t -> {
				if(!ex06List.contains(t.getTrader()))
				ex06List.add(t.getTrader());
			});;
		print("ex06List", ex06List);
		
		System.out.println("\n7. Count the number of traders in Milan."); 
		List<Trader> ex07List = new ArrayList<>();
		filterAndSort(
			transactions,
			  t -> t.getTrader().getWoringCity(),
			  city -> city.equals("Milan"), 
			  comparing((Function<Transaction, String>) t -> t.getTrader().getName())
			).forEach(t -> {
				if(!ex07List.contains(t.getTrader())) {
					ex07List.add(t.getTrader());
				}
			});
		System.out.println(ex07List.size() + " trader(s) in Milan:");
		print("ex07List", ex07List);
		
		System.out.println("\n8. Print all transactions’ values from the traders living in Cambridge."); 
		List<Long> ex08List = new ArrayList<>();
				filterAndSort(
					transactions,
					  t -> t.getTrader().getWoringCity(),
					  city -> city.equals("Milan"), 
					  comparing((Function<Transaction, String>) t -> t.getTrader().getName())
					).forEach(t -> {
							ex08List.add(t.getValue());
					});
		print("ex08List",ex08List);
		
		System.out.println("\n9. What’s the highest value of all the transactions?"); 
		List<Transaction> ex09List = new ArrayList<>();
		List<Transaction> filtedList =	filterAndSort(
				transactions, 
				Transaction::getValue, 
				value -> value > 0, 
				comparing(Transaction::getValue).reversed());
		Long max = filtedList.get(0).getValue();
		for(int i = 0;i<filtedList.size();i++) {
			if(filtedList.get(i).getValue().equals(max)) {
				ex09List.add(filtedList.get(i));
			}
		}
		print("ex09List",ex09List);
		
		System.out.println("\n10. Find the transaction with the smallest value"); 
		List<Transaction> ex10List = new ArrayList<>();
		Long min = filtedList.get(filtedList.size()-1).getValue();
		for(int i = 0;i<filtedList.size();i++) {
			if(filtedList.get(i).getValue().equals(min)) {
				ex10List.add(filtedList.get(i));
			}
		}
		print("ex10List",ex10List);
	}
	
	
	private static List<String> getSortedTraderName(List<Transaction> transactions){
		Set<String> names = new TreeSet<>();
		for(Transaction transaction: transactions) {
			 names.add(transaction.getTrader().getName());
		}
		List<String> namesSorted = new ArrayList<>(names);
		return namesSorted;
	}
	
	private static List<String> getUniqueWorkingCity(List<Transaction> transactions) {
		Set<String> uniqueCity = new HashSet<>();
		transactions.forEach(t -> uniqueCity.add(t.getTrader().getWoringCity()));
		return new ArrayList<>(uniqueCity);
	}

	
// idea: write a function to filter and sort by any attribute of any list
	public static <T, R extends Comparable<R>> List<T> filterAndSort(
			  List<T> items,
			  Function<T, R> accessor, 
			  Predicate<R> filterPredicate,
			  Comparator<T> comparator) {

			  List<T> results = new ArrayList<>();

			  for(T item : items) {
			    R value = accessor.apply(item);
			    if(filterPredicate.test(value)) {
			      results.add(item);
			    } 
			  }

			  results.sort(comparator);

			  return results;
			}
	
	private static <E> void print(String prefix, List<E> elements) {
		if(elements.isEmpty()) System.out.println("There is nothing in "+ prefix);
		else {
			System.out.println(prefix + " -->");
			elements.forEach(System.out::println);
		}
	}
	
	private static List<Transaction> mockData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		return List.of(new Transaction(brian, 2011, 300L), new Transaction(raoul, 2012, 1000L),
				new Transaction(raoul, 2011, 400L), new Transaction(mario, 2012, 1710L),
				new Transaction(mario, 2012, 400L), new Transaction(alan, 2012, 1710L));
	}
}


// idea: write a function to filter depend on value of any attribute ,sort By Any Trader Attribute of any Transaction List. 
//private static <T extends Comparable<T>> List<Trader> filterAndSort1(List<Transaction> transactions,
//		Function<Trader, T> accessor, Predicate<T> filterPredicate,
//		Comparator<? super Trader> comparator) {
//	List<Trader> results = new ArrayList<>();
//	for (Transaction t : transactions) {
//		T value = (T) accessor.apply(t.getTrader());
//		if (filterPredicate.test(value)) {
//			results.add(t.getTrader());
//		}
//	}
//	results.sort(comparator);
//	return results;
//}
//
//// idea: write a function to filter depend on value of any attribute ,sort By Any Transaction Attribute of any Transaction List. 
//private static <T extends Comparable<T>> List<Transaction> filterAndSort
//			(List<Transaction> transactions, Function<Transaction, T> accessor, 
//					Predicate<T> filterPredicate, Comparator<? super Transaction> comparator) {
//	List<Transaction> results = new ArrayList<>();
//	for (Transaction t : transactions) {
//		T value = (T) accessor.apply(t);
//		if (filterPredicate.test(value)) {
//			results.add(t);
//		}
//	}
//	results.sort(comparator);
//	return results;
//}

