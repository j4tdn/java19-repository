package view.a.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03ArrayList_SingleType_Operation {
     public static void main(String[] args) {
		List<String> bookIds = mockData();
		
		bookIds.add(2, "STK-9");
		
		//add the collection to the list
		
		bookIds.addAll(List.of("T-1", "T-2"));
		
		//remove at index
		bookIds.remove(0);
		
		//remove by value
		bookIds.remove("SGK-2");
		
		//remove by condition
		//bookIds.removeIf(bookId -> bookId.startsWith("STK"));
		
		//printf(bookIds);
		
		for (String bookId: bookIds) {
			if(bookId.startsWith("STK")) {
				bookIds.remove(bookId);
			}
		}
		bookIds.removeIf(bookId -> bookId.startsWith("STK"));
		
		printWithIterator(bookIds);
		//contains
		System.out.println("texts contains -->" + bookIds.contains("SGK-4"));
		System.out.println("test indexOf(SGK-2) -->" + bookIds.indexOf("SGK-2"));
	    
		//forEach
		//bookId -> System.out.println(bookId) -> lambda
		//system.out::println
		System.out.println("test forEach with consumer");
		bookIds.forEach(bookId -> System.out.println(bookId));
     
     }
     private static List<String> mockData(){
    	 List<String> bookIds = new ArrayList<>();
    	 // add element to the end
    	 bookIds.add("SGK-1");
    	 bookIds.add("SGK-2");
    	 bookIds.add("SGK-3");
    	 bookIds.add("SGK-4");
    	 bookIds.add("SGK-5");
    	 bookIds.add("SGK-6");
    	 bookIds.add("SGK-7");
    	 bookIds.add("SGK-8");
    	 return bookIds;
   	 
    	 
     }
     private static void printWithForEach(List<String> elements) {
    	 //for index, for each
    	 // co the truy cap den phan tu bat ky tham chi dang duyet
    	 for(String element: elements) {
    		 System.out.println(element);
    	 }
     }
     private static void printWithIterator(List<String> elements) {
    	 //iterator --> duyet tuan tu(luu tru collection)
    	 //mot thoi diem chi truy cap 1 phan tu
    	 //Chi cho phep truy cap phan tu thu k khi iteraror duyet den phan tu thu k
    	 //Neu iterator dang o phan tu k - x thi ko the truy cap phan tu k
    	 Iterator<String> iterator = elements.iterator();
    	 while(iterator.hasNext()) {
    		 String element = iterator.next();
    		 System.out.println(element);
    	 }
     }
}
