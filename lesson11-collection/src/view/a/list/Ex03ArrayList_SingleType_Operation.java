package view.a.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03ArrayList_SingleType_Operation {
	
	public static void main(String[] args) {
		List<String> bookIds = mockData();
		
		//internal attribute of ArrayList is array: E[]
		
		//add at index
		bookIds.add(2,"STK-9");
		
		//add collection to list
		bookIds.addAll(List.of("T-1", "T-2"));
		
		//remove by index
		bookIds.remove(0);
		
		//remove by value
		bookIds.remove("SGK-2");
		
		//remove by condition
		bookIds.removeIf(bookId -> bookId.startsWith("STK"));
		
		System.out.println("\n===== printWithForEach =====\n");
		printWithForEach(bookIds);
		
		
		System.out.println("\n===== printWithInterator =====\n");
		
		for (String bookId : bookIds) {
			if (bookId.startsWith("STK")) {
				bookIds.remove(bookId);
			}
		}
		bookIds.removeIf(bookId -> bookId.startsWith("STK"));
		
		printWithInterator(bookIds);
		
		
		
		
	}
	
	private static List<String> mockData(){
		List<String> bookIds = new ArrayList<>();
		
		//add element to the end
		bookIds.add("SGK-1");
		bookIds.add("SGK-2");
		bookIds.add("SGK-3");
		bookIds.add("SGK-4");
		bookIds.add("SGK-5");
		bookIds.add("STK-7");
		bookIds.add("STK-6");
		bookIds.add("STK-8");
		
		return bookIds;
	}
	
	private static void printWithForEach(List<String> elements) {
		//for index, for each
		
		// can access any element even not run up to
		
		for (String element : elements) {
			System.out.println(element);
		}
	}
	
	private static void printWithInterator(List<String> elements) {
		//iterator: duyet tuan tu
		
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}
}
