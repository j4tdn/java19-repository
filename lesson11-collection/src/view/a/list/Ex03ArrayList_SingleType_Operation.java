package view.a.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03ArrayList_SingleType_Operation {
	
	public static void main(String[] args) {
		List<String> bookIds = mockData();
		
		// interal attribute of ArrayList is array: E[]
		
		// add at index
		bookIds.add(2, "STK-9");
		
		// add [index] the collection to list
		bookIds.addAll(List.of("T1", "T2"));
		
		// remove at index
		bookIds.remove(0);
		
		// remove by value
		bookIds.remove("SGK-2");
		
		// remove by condition
		
		/*
		 if (filter.test(each.next())) {
                each.remove();
                removed = true;
            }
            
            why collection using 'iterator to loop' when code removeIf function 
            why not for index, each
            
            let's try --> lock
			2 operations(loop, remove) access bookId concurrent
			  throw concurrent modification exception
			cÃ³ thá»ƒ pháº§n tá»­ chÆ°a duyá»‡t Ä‘áº¿n Ä‘Ã£ bá»‹ remove rá»“i
			for (String bookId: bookIds) {
				if (bookId.startsWith("STK")) {
					bookIds.remove(bookId);
				}
			}
		 */
		
		// remove if with iterator
		bookIds.removeIf(bookId -> bookId.startsWith("STK"));
		
		printWithIterator(bookIds);
		
		// contains --> true/false
		System.out.println("tets contains(SGK-2) --> " + bookIds.contains("SGK-2"));
		
		// indexOf --> val/-1
		System.out.println("test indexOf(SGK-4) --> " + bookIds.indexOf("SGK-4"));
		
		// forEach
		// bookId -> System.out.println(bookId) (lambda)
		// System.out::println
		System.out.println("test forEach with Consumer");
		bookIds.forEach(System.out::println);
	}
	
	private static List<String> mockData() {
		List<String> bookIds = new ArrayList<>();
		// add element to the end
		bookIds.add("SGK-1");
		bookIds.add("SGK-2");
		bookIds.add("SGK-5");
		bookIds.add("SGK-4");
		bookIds.add("SGK-3");
		bookIds.add("STK-7");
		bookIds.add("STK-6");
		bookIds.add("STK-8");
		return bookIds;
	}
	
	private static void printWithForEach(List<String> elements) {
		// for index, each
		
		// cÃ³ thá»ƒ truy cáº­p Ä‘áº¿n pháº§n tá»­ báº¥t ká»³ tháº­m chÃ­ khi chÆ°a duyá»‡t Ä‘áº¿n
		for(String element: elements) {
			System.out.println(element);
		}
	}
	
	private static void printWithIterator(List<String> elements) {
		// iterator --> duyá»‡t tuáº§n tá»±(lÆ°u trá»¯ collection)
		// 1 thá»?i Ä‘iá»ƒm chá»‰ truy cáº­p Ä‘Æ°á»£c 1 pháº§n tá»­
		
		// chá»‰ cho phÃ©p truy cáº­p pháº§n tá»­ thá»© k khi iterator duyá»‡t Ä‘áº¿n pháº§n tá»­ k
		// náº¿u iterator Ä‘ang á»Ÿ pháº§n tá»­ k - x thÃ¬ ko thá»ƒ truy cáº­p pháº§n tá»­ k Ä‘Æ°á»£c
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}
}
