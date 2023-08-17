package view.b.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex02MapCustomTypeKeyDemo {
	public static void main(String[] args) {
		// map để lưu trữ k = manager
		// v = list of employees are managed by k
	}

	private static Map<Employee, List<Employee>> loadData(){
		Map<Employee, List<Employee>> map = new HashMap<>();
		
		List<Employee> list1 = List.of(
				new Employee(100, "E100",List.of("Java, C#"),2000d),
				);
		
	}
}
