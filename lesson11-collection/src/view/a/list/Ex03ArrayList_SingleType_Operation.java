package view.a.list;

import java.util.ArrayList;
import java.util.List;

public class Ex03ArrayList_SingleType_Operation {
	public static void main(String[] args) {
		List<String> bookIds = mockData();
		
	}
	
	private static List<String> mockData(){
		List<String> bookIds = new ArrayList<>();
		bookIds.add("SGK-1");
		bookIds.add("SGK-2");
		bookIds.add("SGK-3");
		bookIds.add("SGK-4");
		bookIds.add("SGK-5");
		bookIds.add("STK-6");
		bookIds.add("STK-7");
		bookIds.add("STK-8");
		bookIds.add("STK-9");
		return bookIds;
	}
}	
