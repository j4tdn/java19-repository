package ex04;

public class App {
	public static void main(String[] args) {
		Person p1 = new Manager("Do Thien Hoa", "20/10/2002", 3.5f, 15);
		Person p2 = new Director("Nguyen Viet Thanh Huyen", "02/10/2003", 4.5f, 100f);
		Person p3 = new Staff("Ho Tan Dat", "20/01/2002", 5.5f, "Nhan Su");
		Person[] persons = { p1, p2, p3 };
		showInfo(persons);
		salary(persons);
	}

	public static void salary(Person[] persons) {
		for (Person person : persons) {
			if (person instanceof Director) {
				Director d1 = (Director) person;
				float salary = (d1.getCoefficientsSalary() + d1.getJobCoefficient()) * 3000000;
				showSalary(d1, salary);
			} else if (person instanceof Manager) {
				Manager m1 = (Manager) person;
				float salary = (m1.getCoefficientsSalary()) * 2200000;
				showSalary(m1, salary);
			} else {
				Staff s1 = (Staff) person;
				float salary = (s1.getCoefficientsSalary()) * 1250000;
				showSalary(s1, salary);
			}
		}

	}

	public static void showSalary(Person person, float salary) {
		System.out.println(person.getName() + ": " + salary);

	}

	public static void showInfo(Person[] persons) {
		for (Person person : persons) {
			System.out.println(person);
		}
	}

}
