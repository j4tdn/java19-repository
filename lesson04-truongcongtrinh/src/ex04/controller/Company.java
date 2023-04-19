package ex04.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex04.model.Employee;
import ex04.model.Leader;
import ex04.model.Manager;
import ex04.model.Person;
import ex04.validation.Validation;

public class Company {

	private List<Person> employees;

	public Company() {
		employees = new ArrayList<>();
	}
	
	// Implement print all employees
	public void printAllEmployees() {
		employees.forEach(System.out::println);
	}

	// Implement get List of Employee
	public List<Person> getEmpolyeeList() {
		return this.employees;
	}

	public void inputInfo(Person person) {
		Scanner sc = new Scanner(System.in);
		String name;
		String dOb;
		String coefSlry;
		String coefJob;
		String numsOfEmply;
		String department;
		do {
			System.out.print("Enter name: ");
			name = sc.nextLine();
		} while (!Validation.isValidName(name));
		person.setName(Validation.normalizeName(name));
		do {
			System.out.print("Enter Date Of Birth (dd/mm/yyyy): ");
			dOb = sc.nextLine();
		} while (!Validation.isValidDate(dOb));
		person.setDateOfBirth(dOb);
		do {
			System.out.print("Enter Coefficient Salary: ");
			coefSlry = sc.nextLine();
		} while (!Validation.isValidCoef(coefSlry));
		person.setCoefSalary(Float.parseFloat(coefSlry));
		if (person instanceof Manager) {
			do {
				System.out.print("Enter Coefficient Job: ");
				coefJob = sc.nextLine();
			} while (!Validation.isValidCoef(coefJob));
			((Manager) person).setCoefJob(Float.parseFloat(coefJob));
			employees.add(person);
		} else if (person instanceof Leader) {
			do {
				System.out.print("Enter Number Of Employees: ");
				numsOfEmply = sc.nextLine();
			} while (!Validation.isValidIntNumber(numsOfEmply));
			((Leader) person).setNumOfEmpys(Integer.parseInt(numsOfEmply));
			employees.add(person);
		} else if (person instanceof Employee) {
			do {
				System.out.print("Enter Name Of Department: ");
				department = sc.nextLine();
			} while (!Validation.isValidName(department));
			((Employee) person).setDepartment(department);
			employees.add(person);
		}
	}

	// Implement show info method
	public void showInfo(int choice) {
		int check = 0;
		switch (choice) {
		case 1:
			for (Person p : employees) {
				if (p instanceof Manager) {
					System.out.println(p);
					check++;
				}
			}
			if (check == 0)
				System.out.println("There is no manager to show!");
			break;
		case 2:
			check = 0;
			for (Person p : employees) {
				if (p instanceof Leader) {
					System.out.println(p);
					check++;
				}
			}
			if (check == 0)
				System.out.println("There is no leader to show!");
			break;
		default:
			check = 0;
			for (Person p : employees) {
				if (p instanceof Employee) {
					System.out.println(p);
					check++;
				}
			}
			if (check == 0)
				System.out.println("There is no employee to show!");

		}
	}

	// Implement calculate and print out salary method
	public double calSalary(Person person) {
		if (person instanceof Manager)
			return (3000000 * ((((Manager) person).getCoefJob()) + person.getCoefSalary()));
		else if (person instanceof Leader)
			return (2200000 * person.getCoefSalary());
		else
			return (1250000 * person.getCoefSalary());
	}
	
	public void printAllSalary() {
		for(Person person:employees) {
			System.out.println(person);
			System.out.printf("Salary: " + "%.0f",this.calSalary(person));
		}
	}
	
}
