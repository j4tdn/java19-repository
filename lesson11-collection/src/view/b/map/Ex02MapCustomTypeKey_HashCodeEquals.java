package view.b.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import bean.Employee;

public class Ex02MapCustomTypeKey_HashCodeEquals {
	 public static void main(String[] args) {
			//map de luu tru k = manager
	    	//               v = list of employees are managed by k
	    	Map<Employee, List<Employee>> map = loadData();
	    	System.out.println();
		 
		 
		}
	 
	 private static void printf(String prefix, Map<Integer, String> map) {
	    	System.out.println("\n" + prefix);
	    	
	    	Set<Entry<Integer, String>> entries = map.entrySet();
	    	for(Entry<Integer, String> entry: entries) {
	    		System.out.println(entry.getKey() + "--> " + entry.getValue());
	    	}
	    }
	 private static Map<Employee, List<Employee>> loadData(){
		 Map<Employee, List<Employee>> map = new HashMap<>();
		 
		 Employee m1 = new Employee(100, "E100", List.of("Java, C#"), 2000d);
		 List<Employee> list1 = List.of(
				 new Employee(4, "E1", List.of("Java"), 1000d),
				 new Employee(5, "E2", List.of("C#"), 1200d),
				 new Employee(3, "E3", List.of("C++"), 1800d)
				 
				 );
		 
		 
		 Employee m2 = new Employee(100, "E100", List.of("Java, C#"), 2000d);
		 
		 Employee m3 = new Employee(100, "E100", List.of("Java, C#"), 2000d);
		 

		 return map;
	 }
}
