package view.b.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utils.CollectionUtils;

public class Ex03TreeMapDemo {
	public static void main(String[] args) {
		
		//mặc định sắp xếp theo key tăng dần
		Map<Integer, String> weekDays = new HashMap<>();
		
		weekDays.put(2, "monday");
		weekDays.put(6, "friday");
		weekDays.put(4, "wednesday");
		CollectionUtils.generate("weekDays", weekDays);
		System.out.println("++++++");
		weekDays.put(5, "thursday");
		weekDays.put(7, "saturday");
		weekDays.put(3, "tuesday");
		
		
		//sắp xếp theo value tăng dần
		CollectionUtils.generate("weekDays", weekDays);
	}

}
