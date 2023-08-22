package view.a.ist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02ArrayList_SingleType_Operation {
public static void main(String[] args) {
	List<String> bookIds = mockData();
	for(String bookId: bookIds) {
		if(bookId.startsWith("STK")) {
			bookIds.remove(bookId);
		}
	}
	bookIds.removeIf(bookId -> bookId.startsWith("STK"));
	printf(bookIds);
	System.out.println("test contains -> " + bookIds.contains("SGK-2"));
	System.out.println("test indexOf(SGK-2) " + bookIds.indexOf("SGK-2"));
	System.out.println("test foreach with Consumer");
	bookIds.forEach(System.out::println);
	}


private static List<String> mockData(){
	List<String> bookIds = new ArrayList<>();
	bookIds.add("SGK-1");
	bookIds.add("SGK-2");
	bookIds.add("SGK-3");
	bookIds.add("SGK-4");
	bookIds.add("SGK-5");
	bookIds.add("SGK-6");
	bookIds.add("SGK-7");
	return bookIds;
}
private static void printf(List<String> elements) {
	for(String element: elements) {
		System.out.println(element);
	}
}
}
