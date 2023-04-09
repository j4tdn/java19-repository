package Exercise3Vehicle;

public class Carriage {
	public static void main(String[] args) {
		CustomerOfVehicle c1 = new CustomerOfVehicle("Nguyễn Thu Loan");
		CustomerOfVehicle c2 = new CustomerOfVehicle("Lê Minh Tính");
		CustomerOfVehicle c3 = new CustomerOfVehicle("Nguyễn Minh Triết");

		Vehicle v1 = new Vehicle("Mercedes", 100, 12000);
		Vehicle v2 = new Vehicle("Audi", 500, 36000);
		Vehicle v3 = new Vehicle("Camry", 300, 52000);

		Register[] rgts = new Register[] { new Register(c1, v1), new Register(c2, v2), new Register(c3, v3) };

		System.out.printf("%-12s%-12s%s\n", "Tên chủ xe  ", "Loại xe  ", "Dung tích", "Trị giá  ", "Thuế phải nộp  ");

		System.out.println("\n===================\n");

		for (Register rgt : rgts) {
			Register2.Tax(rgt);
		}

	}

}
