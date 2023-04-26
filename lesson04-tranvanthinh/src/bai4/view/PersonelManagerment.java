package bai4.view;

import bai4.bean.Director;
import bai4.bean.Employee;
import bai4.bean.Manager;
import utils.Utils;

public class PersonelManagerment {
	public static void main(String[] args) {
		Director d = new Director();
		Utils.inputEmployee(d);

		Manager m = new Manager();
		Utils.inputEmployee(m);

		Employee e1 = new Employee();
		Utils.inputEmployee(e1);

		Employee e2 = new Employee();
		Utils.inputEmployee(e2);
		
		System.out.println(d);
		System.out.println(m);
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println("Lương của các nhân viên: ");
		System.out.println("Giám đốc: " + d.calcSalary());
		System.out.println("Trưởng phòng: " + m.calcSalary());
		System.out.println("Nhân viên 1: " + e1.calcSalary());
		System.out.println("Nhân viên 2: " + e2.calcSalary());
	}
}
