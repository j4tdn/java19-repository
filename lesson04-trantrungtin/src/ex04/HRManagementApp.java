package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ex01.Student;

public class HRManagementApp {
	public static void main(String[] args) {
		//Nhập dữ liệu gồm 1 Giám đốc, 1 Trưởng phòng, 2 Nhân viên
		
		Director director = new Director("Mr.Boss", "1990/05/05", 3f, 0.2f);
		
		Manager manager = new Manager("Mr.Manager", "1991/12/05", 3f, 10);

		Employee employee1 = new Employee("Staff 01", "1995/01/01", 2.4f, "R&D");
		Employee employee2 = new Employee("Staff 02", "1997/11/9", 2.4f, "HR");
		
		//Hiển thị thông tin các nhân sự có trong công ty
		HRMember[] HrList = {director, manager, employee1, employee2};
		
		System.out.println("thông tin các nhân sự có trong công ty: \n");
		for (HRMember member : HrList) {
		    System.out.println(member.toString()+"\n");
		}
		
		System.out.println("=======================================================");
		
		//Tính và in ra mức lương của từng loại nhân sự
		
		System.out.println("mức lương của từng loại nhân sự: \n ");
		System.out.println("Director: " + director.getSalary());
		System.out.println("Manager: " + manager.getSalary());
		System.out.println("Employee: " + employee1.getSalary());

		
	}
}
