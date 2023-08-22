package view.b.map;

import java.util.HashMap;
import java.util.Map;

import utils.CollectionUtils;

public class Ex03TreeMapDemo {
public static void main(String[] args) {
	Map<String, Integer> weekDays = new HashMap<>();
	weekDays.put("Monday",   2);
	weekDays.put("Tuesday",  3);
	weekDays.put("Wednesday",4);
	weekDays.put("Thursday", 5);
	weekDays.put("Friday",   6);
	weekDays.put("Saturday", 7);
	
	
	
	CollectionUtils.generate("1A. Các ngày trong tuần ", weekDays);
}
}
