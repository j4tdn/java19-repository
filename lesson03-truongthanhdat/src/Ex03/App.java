package Ex03;

public class App {

	public static void main(String[] args) {
		Vehicle ve1 = new Vehicle(1, "Feature neo", 100, 35000000.00);
//		Vehicle ve2 = new Vehicle(2, "Ford ranger", 3000, 250000000.00);
		Vehicle ve3 = new Vehicle(3, "Landscape", 1500, 1000000000.00);
		
		User user1 = new User(1, "Thành Đạt");
		User user2 = new User(2, "Curtis");
		
		TaxMoney tax1 = new TaxMoney(user1, ve1);
		System.out.println(tax1);
		
		System.out.println("===========================");
		
		TaxMoney tax2 = new TaxMoney(user2, ve3);
		System.out.println(tax2);
	}	

}
