package vehicle;


public class Exercise03 {
	public static void main(String[] args) {
		Vehicle c1 = new Vehicle("Hưng", "Future", 100, 35000000);
		Vehicle c2 = new Vehicle("Chánh", "AB", 1500, 1000000000);
		Vehicle c3 = new Vehicle("Bảo Thi", "Ford", 3000, 250000000);
		
		System.out.println("Tên chủ xe\t" + "Loại xe\t" + "\tDung tích\t" + "Trị giá" + "\t\t" +"Thuế phải nộp");
		System.out.println("=============================================================================");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
