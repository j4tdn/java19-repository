package view.b.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import bean.Employee;

import java.util.Map.Entry;

public class Ex02MapCustomTypeKeyDemo {
	public static void main(String[] args) {

		// map để lưu trữ k = manager
		// v = list of employees are managed by k

		Map<Employee, List<Employee>> map = loadData();

		System.out.println("map size before --> " + map.size());

		// Employee m4 = new Employee(400, "E400", List.of("database"), 1500d);
		Employee m4 = new Employee(100, "E100", List.of("Java, C#"), 2000d);

		List<Employee> list4 = List.of(
				new Employee(44, "E44", List.of("database"), 1000d)
		);

		// khi put một phần tử entry mới vào map
		// yêu cầu phần tử mới có key chưa "trùng" với key của phần tử nào trong map, nếu trùng 1 là ghi đè, 2 là ko cho put

		// trùng: kiểm tra hash của key trong entry mới có trùng với hash của key nào trong entries của map hiện tại ko
		//     và kiểm tra xem key trong entry mới có equals với key nào trong entries của map hiện tại ko

		// tồn tại: hashcode & equals

		// quyết định: hashcode và equals theo thuộc tính nào


		map.put(m4, list4);

		System.out.println("map size after --> " + map.size());
		printf("map --> ", map);
	}

	private static void printf(String prefix, Map<Employee, List<Employee>> map) {
		System.out.println("\n" + prefix);

		Set<Entry<Employee, List<Employee>>> entries = map.entrySet();

		for (Entry<Employee, List<Employee>> entry: entries) {
			System.out.println(entry.getKey() + " --> {\n " + entry.getValue() + "\n}");
		}
	}

	private static Map<Employee, List<Employee>> loadData() {
		Map<Employee, List<Employee>> map = new HashMap<>();

		Employee m1 = new Employee(100, "E100", List.of("Java, C#"), 2000d);
		List<Employee> list1 = List.of(
				new Employee(1, "E1", List.of("Java"), 1000d),
				new Employee(2, "E2", List.of("C#"), 1200d),
				new Employee(3, "E3", List.of("C++"), 1800d)
		);

		Employee m2 = new Employee(200, "E200", List.of("HTML, CSS"), 4000d);
		List<Employee> list2 = List.of(
				new Employee(4, "E4", List.of("HTML"), 1000d),
				new Employee(5, "E5", List.of("CSS"), 1200d)
		);

		Employee m3 = new Employee(300, "E300", List.of("JavaScript, Python"), 3800d);
		List<Employee> list3 = List.of(
				new Employee(6, "E6", List.of("JavaScript"), 1000d),
				new Employee(7, "E7", List.of("Python"), 1200d),
				new Employee(8, "E8", List.of("JavaScript"), 1800d),
				new Employee(9, "E9", List.of("v"), 1800d)
		);

		map.put(m1, list1);
		map.put(m2, list2);
		map.put(m3, list3);

		return map;
	}
}
