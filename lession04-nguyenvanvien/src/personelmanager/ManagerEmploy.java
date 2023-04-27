package personelmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagerEmploy {
	public static void main(String[] args) {
		Person direc = new Director("Nguyen Van A", "28/02/2002", 5.6f, 1.3f);
		
		Person mana = new Manager("Nguyen Van B", "23/02/2002", 4.6f, 100);
		
		Person employee1 = new Employee("Nguyen Van C", "24/02/2002", 3.6f, "Phong ban 1");
		Person employee2 = new Employee("Nguyen Van D", "25/02/2002", 3.6f, "Phong ban 2");
		
		List<Person> persons = new ArrayList<>();
		persons.add(direc);
		persons.add(mana);
		persons.add(employee1);
		persons.add(employee2);
		
		viewInfo(persons);
		
		viewPayroll(persons);
		
	}
	
	public static void viewInfo(List<Person> persons) {
		System.out.println("===== Danh sach nhanh vien =====\n");
		for(Person person : persons) {
			System.out.println(person.toString());
		}
	}
	
	public static void viewPayroll(List<Person> persons) {
		System.out.println("\n===== Danh sach luong nhan vien =====\n");
		for(Person person : persons) {
			System.out.printf(person.getName() + "\t" + "%.0f",person.Payroll());
			System.out.print("\n");
		}
	}
}
