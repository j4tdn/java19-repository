package view.b.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import bean.Employees;

public class Ex02MapCustomTypeKeyDemo {
	public static void main(String[] args) {
		Map<Employees, List<Employees>> map = loadData();
		
		System.out.println("map size before --> " + map.size());
		Employees m4 = new Employees(100, "E100", List.of("Java", "C#"), 2000d);
		List<Employees> list4 = List.of(
			new Employees(100, "E1", List.of("Java", "C#"), 2000d)
		);
		
		map.put(m4, list4);
		System.out.println("map size after --> " + map.size());
		printf("map --> ", map);
	}

	private static Map<Employees, List<Employees>> loadData(){
		Map<Employees, List<Employees>> map = new HashMap<>();
		Employees m1 = new Employees(100, "E100", List.of("Java", "C#"), 2000d);
		List<Employees> list1 = List.of(
			new Employees(100, "E1", List.of("Java", "C#"), 2000d),
			new Employees(100, "E2", List.of("Java", "C#"), 2000d),
			new Employees(100, "E3", List.of("Java", "C#"), 2000d)
		);
		
		Employees m2 = new Employees(2100, "E200", List.of("HTML", "CSS"), 4000d);
		List<Employees> list2 = List.of(
			new Employees(100, "E4", List.of("Java", "C#"), 2000d),
			new Employees(100, "E5", List.of("Java", "C#"), 2000d),
			new Employees(100, "E6", List.of("Java", "C#"), 2000d)
		);
		
		Employees m3 = new Employees(300, "E300", List.of("JavaScript", "Python"), 6000d);
		List<Employees> list3 = List.of(
			new Employees(100, "E7", List.of("Java", "C#"), 2000d),
			new Employees(100, "E8", List.of("Java", "C#"), 2000d),
			new Employees(100, "E9", List.of("Java", "C#"), 2000d)
		);
		map.put(m1, list1);
		map.put(m2, list2);
		map.put(m3, list3);
		return map;
	}
	
	private static void printf(String prefix, Map<Employees, List<Employees>> map) {
		System.out.println("\n" + prefix);
		Set<Entry<Employees, List<Employees>>> entries = map.entrySet();
		for(Entry<Employees, List<Employees>> entry: entries) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
