package ex03;

public class Ex03 {
	public static void main(String[] args) {
		Director director = new Director("Đặng Quang Lâm", "28/11/2000", 22f, 9.5f);
		Manager manager = new Manager("Nguyễn Thái Trường", "16/5/2000", 55f, 2);
		Staff staff = new Staff("Trương Thành Đạt", "20/11/2000", 3.0f, "AS12");

		Person[] list = { director, manager, staff};
		System.out.println("\nHiển thị thông tin các nhân sự có trong công ty:\n");
		for (Person persons : list) {
			System.out.println(persons);
		}
		System.out.println("\n=================================");
		System.out.println("\nTính và in ra mức lương của từng loại nhân viên:\n");

		System.out.println(director.getName() + ": " + director.salary());
		System.out.println(manager.getName() + ": " + manager.salary());
		System.out.println(staff.getName() + ": " + staff.salary());
	}

}
