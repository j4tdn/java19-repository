package excercise;

import bean.Employee;

public class Ex4 {

	public static void main(String[] args) {
		Employee boss = new bean.Boss("Pham Nhat Vu", "11.2.1990", 11f, 4.3f);
		Employee manager = new bean.Manager("Nguyen A", "31.5.1992", 5f, 2);
		Employee staff1 = new bean.Staff("Le X", "13.3.1993", 0.9f, "IT");
		Employee staff2 = new bean.Staff("Vo Z", "22.9.2000", 2f, "HR");

		Employee[] list = { boss, manager, staff1, staff2 };
		for (Employee employee : list) {
			System.out.println(employee);
			System.out.println("\n======\n");
		}
		System.out.println("\n===Salary===\n");

		System.out.println(boss.getName() + ": " + boss.salary());
		System.out.println(manager.getName() + ": " + manager.salary());
		System.out.println(staff1.getName() + ": " + staff1.salary());
		System.out.println(staff2.getName() + ": " + staff2.salary());
	}

}
