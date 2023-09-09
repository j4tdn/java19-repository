package view;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
public class TransactionApp {
	public static void main(String[] args) {
		 List<Transaction> transactions =mockData();
		// printf(transactions);
		 
		 /*
		  * 1. Find all transactions in the year 2011 and sort them by value (small to high).
			2. Find all transactions have value greater than 300 and sort them by trader’s city
			3. What are all the unique cities where the traders work?
			4. Find all traders from Cambridge and sort them by name desc.
			5. Return a string of all traders’ names sorted alphabetically.
			6. Are any traders based in Milan?
			7. Count the number of traders in Milan.
			8. Print all transactions’ values from the traders living in Cambridge.
			9. What’s the highest value of all the transactions?
			10. Find the transaction with the smallest value.
		  * 
		 */
		 var ex1 = transactions.stream()
				 				.filter(t->t.getYear()==2011)
				 				.sorted(Comparator.comparing(Transaction::getValue))
				 				.collect(Collectors.toList());
		 System.out.println("==========================EX01==========================");
		 System.out.println();
		 System.out.println("All transactions in the year 2011 sort them by value (small to high):");
		 printf(ex1);
		 System.out.println();
		 var ex2 = transactions.stream()
				 .filter(t->t.getValue()>300)
				 .sorted(Comparator.comparing(t->t.getTrader().getCity()))
				 .collect(Collectors.toList());
		 
		 System.out.println("==========================EX02==========================");
		 System.out.println();
		 System.out.println("All transactions have value greater than 300 (Sort them by trader’s city):");
		 printf(ex2);
		 System.out.println();
		 var ex3 = transactions.stream()
				 .map(t->t.getTrader().getCity())
				 .collect(Collectors.toSet());
		 System.out.println("==========================EX03==========================");
		 System.out.println();
		 System.out.println("All the unique cities where the traders work:");
		 for(var elm:ex3) {
			 System.out.println(elm);
		 }
		 System.out.println();
		 var ex4 = transactions.stream()
				 .filter(t->t.getTrader().getCity().equals("Cambridge"))
				 .sorted(Comparator.comparing(t->((Transaction) t).getTrader().getName()).reversed())
				 .collect(Collectors.toList());
		 System.out.println("==========================EX04==========================");
		 System.out.println();
		 System.out.println("All traders from Cambridge (sort them by name desc):");
		 printf(ex4);
		 System.out.println();
		 var ex5 = transactions.stream()
				 .map(t->t.getTrader().getName())
				 .sorted()
				 .collect(Collectors.toList());
		 String stringName="";
		 for(var elm:ex5) {
			 stringName+=elm;
		 }
		 System.out.println("==========================EX05==========================");
		 System.out.println();
		 System.out.println("String of all traders’ names sorted alphabetically:");
		 System.out.println(stringName);
		 System.out.println();
		 var ex6 = transactions.stream()
				 .anyMatch(t->t.getTrader().getCity().equals("Milan"));
		 System.out.println("==========================EX06==========================");
		 System.out.println();
		 System.out.println("Are any traders based in Milan?");
		 System.out.println(ex6);
		 
		 
		 var ex7 = transactions.stream()
				 .filter(t->t.getTrader().getCity().equals("Milan"))
				 .count();
		 System.out.println("==========================EX07==========================");
		 System.out.println();
		 System.out.println("Count the number of traders in Milan:");
		 System.out.println(ex7);
		 System.out.println();
		 var ex8 = transactions.stream()
				 .filter(t->t.getTrader().getCity().equals("Cambridge"))
				 .map(t->t.getValue())
				 .collect(Collectors.toList());
		 System.out.println("==========================EX08==========================");
		 System.out.println();
		 System.out.println("All transactions’ values from the traders living in Cambridge:");
		 printf(ex8);
		 System.out.println();
		
		 var ex9 =transactions.stream()
				 .map(t->t.getValue())
				 .collect(Collectors.toList());
		 
		 long value = Collections.max(ex9);
		 System.out.println("==========================EX09==========================");
		 System.out.println();
		 System.out.println("Highest value of all the transactions:");
		 System.out.println(value);
		 System.out.println();		
		 var ex10 = transactions.stream()
				 .min(Comparator.comparing(Transaction::getValue));
		 System.out.println("==========================EX10==========================");
		 System.out.println();
		 System.out.println("The transaction with the smallest value:");
		 System.out.println(ex10);
		 
		 
				 
				 
	}
	public static List<Transaction> mockData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		 List<Transaction> transactions =Arrays.asList(
				new Transaction(brian,2011,300l),
				new Transaction(raoul,2012,1000l),
				new Transaction(raoul,2011,400l),
				new Transaction(mario,2012,710l),
				new Transaction(mario,2012,700l),
				new Transaction(alan,2012,950l)
				 );
		 return transactions;
	}
	private static <E> void printf(List<E> list) {
		for (E e : list) {
			System.out.println(e);
		}
	}
}
