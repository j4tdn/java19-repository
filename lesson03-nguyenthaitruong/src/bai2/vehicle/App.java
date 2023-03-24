package bai2.vehicle;

public class App {
	public static void main(String[] args) {
		Vehicle vhc1 = new Vehicle("Đặng Quang Lâm", "G63", 300, 1800);
		Vehicle vhc2 = new Vehicle("Nguyễn Thái Trường", "FORD Raptor", 200, 1500);
		Vehicle vhc3 = new Vehicle("Trương Thành Đạt", "Audi A8", 500, 3500);
		System.out.println("Tên chủ xe\t\tLoại xe\t\tDung tích\tTrị giá\t\t\tThuế phải nộp");
		System.out.println("======================================================================================");
		System.out.println(vhc1);
		System.out.println(vhc2);
		System.out.println(vhc3);
		
	}
}
