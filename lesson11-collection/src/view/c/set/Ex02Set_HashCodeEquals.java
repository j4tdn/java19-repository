package view.c.set;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Employee;
import bean.Item;

public class Ex02Set_HashCodeEquals {
	public static void main(String[] args) {
		Set<Item> items = new HashSet<Item>();
		
		items.add(new Item(1,"Item 1A", BigDecimal.TEN, 102));
		items.add(new Item(2,"Item 2A", BigDecimal.ONE, 104));
		items.add(new Item(2,"Item 2A", BigDecimal.ONE, 104));
		System.out.println("item --> size = " + items.size());
		
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee(55, "NLam", List.of("FE"), 2000d));
		employees.add(new Employee(77, "BBay", List.of("BE"), 1800d));
		employees.add(new Employee(77, "BBay", List.of("BE"), 1800d));
		
		
		System.out.println("employee --> size = " + employees.size());
	}
}
