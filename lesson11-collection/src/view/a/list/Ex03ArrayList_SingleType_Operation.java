package view.a.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

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
		 */
		
		// let's try --> lock
		// 2 operations(loop, remove) access bookId concurrent
		// --> throw concurrent modification excetpion
		// có thể phần tử chưa duyệt đến đã bị remove rồi
//		for (String bookId:bookIds) {
//			if (bookId.startsWith("STK")) {
//				bookIds.remove(bookId);
//			}
//		}
		
		// duyệt tuần tự
		bookIds.removeIf(bookId -> bookId.startsWith("STK"));
		
		printWithIterator(bookIds);
		
		
		// forEach

		// bookId -> System.out.print1n(bookId) (lambda)
		// System.out::printin

		System.out.println("Test forEach with Consumer") ;
		bookIds.forEach(System.out::println) ;
		
		
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
		
		// có thể truy cập đến phần tử bất kỳ thậm chí khi chưa duyệt đến
		for(String element: elements) {
			System.out.println(element);
		}
	}
	
	private static void printWithIterator(List<String> elements) {
		// iterator --> duyệt tuần tự(lưu trữ collection)
		// 1 th�?i điểm chỉ truy cập được 1 phần tử
		
		// chỉ cho phép truy cập phần tử thứ k khi iterator duyệt đến phần tử k
		// nếu iterator đang ở phần tử k - x thì ko thể truy cập phần tử k được
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}
}