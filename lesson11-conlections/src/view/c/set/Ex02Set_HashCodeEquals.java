package view.c.set;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Employee;
import bean.ItemDetail;

public class Ex02Set_HashCodeEquals {
	public static void main(String[] args) {

		Set<ItemDetail> items = new HashSet<>();

		items.add(new ItemDetail(1, "Item 1A", BigDecimal.TEN, 102));
		items.add(new ItemDetail(2, "Item 2A", BigDecimal.ONE, 104));
		items.add(new ItemDetail(2, "Item 2A", BigDecimal.ONE, 104));

		System.out.println("items ---> size = " + items.size());

		Set<Employee> employees = new HashSet<>();

		employees.add(new Employee(55, "NLam", List.of("FE"), 2000d));
		employees.add(new Employee(77, "BBay", List.of("BE"), 1800d));
		employees.add(new Employee(77, "BBay", List.of("BE"), 1800d));

		System.out.println("employees ---> size = " + employees.size());

	}
}
