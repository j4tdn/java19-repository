package view.b.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex02MapCustomTypeKeyDemo {
public static void main(String[] args) {
	
}
private static Map<Employee, List<Employee>> loadData(){
	Map<Employee, List<Employee>> map = new HashMap<>();
	Employee m1 = new Employee(100, "E100", List.of("Java, C#"), 2000d);
	List<Employee> list2 = List.of(
			new Employee(4, "E4", List.of("HTML"), 1000d),
			new Employee(7, "E5", List.of("CSS"), 1200d)
			);
	Employee m2 = new Employee(300, "E300", List.of("JavaScript, Python"), 3800d);
	List<Employee> list3 = List.of(
			new Employee()
			);
}
}
