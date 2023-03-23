package ex3;

public class App {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Future Neo ", 100, 35000000.00d);
		Vehicle v2 = new Vehicle("Ford Ranger", 3000, 250000000.00d);
		Vehicle v3 = new Vehicle("Landscape  ", 1500, 1000000000.00d);
		
		Owners o1 = new Owners("Nguyễn Thu Loan   ", 123456);
		Owners o2 = new Owners("Lê Minh Tính      ", 234567);
		Owners o3 = new Owners("Nguyễn Minh Triết ", 345678);
		
		Register[] registers = new Register[] {
			new Register(o1, v1),
			new Register(o2, v2),
			new Register(o3, v3)
		};
		
		System.out.println("Tên chủ xe\t\tLoại xe\t\tDung tích\tTrị giá\t\tThuế phải nộp");
		System.out.println("======================================================================================");
		for (Register id : registers) {
			RegisterUtil.result(id);
		}
		

		
		
		
	}

}
