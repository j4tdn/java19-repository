package ex04;

public class PersonelManager {
	public static void main(String[] args) {
		Personel ceo = new CEO("Lê Đức Tuấn", "11-2-2002", 5f, 2.5f);
		Personel manager = new Manager("Nguyen Thanh Phu", "25-12.2002", 3f, 2);
		Personel employee1 = new Employee("Trần Ngọc Quốc", "07-05-2002", 1.4f, "P104");
		Personel employee2 = new Employee("Phạm Huỳnh Văn Phát", "21-12-2002", 1.3f, "p202");

		Personel[] list = {ceo,manager,employee1,employee2};
		for (Personel personel : list) {
			System.out.println(personel);
			System.out.println("===============================");
		}
		System.out.println("Mức lương của từng chức vụ:");

		System.out.println("Mức lương của giám đốc: " + ceo.calSalary());
		System.out.println("Mức lương của trưởng phòng: " + manager.calSalary());
		System.out.println("Mức lương của nhân viên "+employee1.getName()+": " + employee1.calSalary());
		System.out.println("Mức lương của nhân viên "+employee2.getName()+": " + employee2.calSalary());
		
	}
}
