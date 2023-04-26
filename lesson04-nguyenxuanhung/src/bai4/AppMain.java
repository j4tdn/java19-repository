package bai4;

public class AppMain {
	public static void main(String[] args) {

		Director director = new Director("Xuan Hung", "09/05/2002", 2, 2);

		Manager manager = new Manager("Manage", "01/01/2002", 1.5, 5);

		Employee employee1 = new Employee("Emp1", "02/02/2002", 1.2, "PB1");

		Employee employee2 = new Employee("Emp2", "03/03/2002", 1.1, "PB2");

		Person[] persons = { director, manager, employee1, employee2 };

		printInfo(persons);
		System.out.println("======================");
		calcAndPrintSalary(persons);

	}

	public static void calcAndPrintSalary(Person[] persons) {
		double result = 0;
		for (Person person : persons) {
			Class<?> personRuntimeClass = person.getClass();
			if (personRuntimeClass == Director.class) {
				Director castDirector = (Director) person;
				result = (castDirector.getCoefficientsSalary() + castDirector.getCoefficientsPosition()) * 3000000;
				System.out.println(castDirector + ", Salary: " + result);
			} else if (personRuntimeClass == Manager.class) {
				Manager castManager = (Manager) person;
				result = castManager.getCoefficientsSalary() * 2200000;
				System.out.println(castManager + ", Salary: " + result);
			} else if (personRuntimeClass == Employee.class) {
				Employee castEmployee = (Employee) person;
				result = castEmployee.getCoefficientsSalary() * 1250000;
				System.out.println(castEmployee + ", Salary: " + result);
			} else {
				System.out.println("Not found");
			}
		}

	}

	public static void printInfo(Person[] persons) {
		for (Person person : persons) {
			Class<?> personRuntimeClass = person.getClass();
			if (personRuntimeClass == Director.class) {
				Director castDirector = (Director) person;
				System.out.println(castDirector);
			} else if (personRuntimeClass == Manager.class) {
				Manager castManager = (Manager) person;
				System.out.println(castManager);
			} else if (personRuntimeClass == Employee.class) {
				Employee castEmployee = (Employee) person;
				System.out.println(castEmployee);
			} else {
				System.out.println(person);
			}

		}
	}
}
