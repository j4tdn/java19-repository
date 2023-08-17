package view.b.map;

import java.util.LinkedHashMap;
import java.util.Map;

import utils.CollectionUtils;

public class Ex05LinkedHashMap {
	public static void main(String[] args) {
		Map<String, Integer> weekDays = new LinkedHashMap<>();

		weekDays.put("Monday", 2);
		weekDays.put("Friday", 6);
		weekDays.put("Tuesday", 3);
		weekDays.put("Thursday", 5);
		weekDays.put("Wednesday", 4);

		CollectionUtils.generate("1A. Các ngày trong tuần", weekDays);
	}
}
