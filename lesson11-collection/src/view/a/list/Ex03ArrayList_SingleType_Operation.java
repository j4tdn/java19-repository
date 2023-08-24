package view.a.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03ArrayList_SingleType_Operation {
	public static void main(String[] args) {
		List<String> bookIds = mockData();
		
		//interal attribute of ArrayList is array: E[]
		bookIds.add(2, "STK-9");
		
		bookIds.addAll(List.of("T-1", "T-2"));
		
		//remove ay index
		bookIds.remove(0);
		
		//remove bt value
		bookIds.remove("SKG-2");
		
		//2 operation(loop, remove) access bookId concurrent
		//cos the phan tu chua duyet den da bi remove
//		for(String bookId:bookIds) {
//			if(bookId.startsWith("STK")) {
//				bookIds.remove(bookId);
//			}
//		}
		
		bookIds.removeIf(bookId -> bookId.startsWith("STK"));
		
		
		printf(bookIds);
		System.out.println("===============");
//		printfWithIterator(bookIds);
		
		//contains -> true/false
		
		System.out.println("test contains --> "+ bookIds.contains("SGK-2"));
		
		System.out.println("test index of --> " + bookIds.indexOf("SGK-4"));
		
		System.out.println("test forEach with Consumer");
		bookIds.forEach(System.out::println);
	}
	
	private static List<String> mockData(){
		List<String> bookIds = new ArrayList<String>();
		bookIds.add("SGK-1");
		bookIds.add("SGK-2");
		bookIds.add("SGK-5");
		bookIds.add("SGK-4");
		bookIds.add("SGK-3");
		bookIds.add("SGK-7");
		bookIds.add("SGK-6");
		bookIds.add("SGK-8");
		
		return bookIds;
	}
	
	private static void printf(List<String> elements) {
		for(String e: elements) {
			System.out.println(e);
		}
	}
	
	private static void printfWithIterator(List<String> elements) {
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());;
		}
	}
}
