package ex03;

public class CarPurchaseTax {
	public static void main(String[] args) {
		// touch object
		Vehicle v1 = new Vehicle("Nguyễn Thu Loan", "Furture Neo", 100, 35000000);
		Vehicle v2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000);
		Vehicle v3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);

		// count tax
		v1.setTax(countTax(v1.getCapacity(), v1.getPrice()));
		v2.setTax(countTax(v2.getCapacity(), v2.getPrice()));
		v3.setTax(countTax(v3.getCapacity(), v3.getPrice()));
		
		//output

		System.out.printf(" | %-20s | %-15s | %-10s | %-20s | %-20s |%n",
				"NAME", "NAME CAR", "CAPACITY", "PRICE", "TAX");
		System.out.printf(" | %-20s | %-15s | %-10d | %-,20.2f | %-,20.2f |%n",
				v1.getNameCarOwner(), v1.getCarName(), v1.getCapacity(), v1.getPrice(), v1.getTax());
		System.out.printf(" | %-20s | %-15s | %-10d | %-,20.2f | %-,20.2f |%n",
				v2.getNameCarOwner(), v2.getCarName(), v2.getCapacity(), v2.getPrice(), v2.getTax());
		System.out.printf(" | %-20s | %-15s | %-10d | %-,20.2f | %-,20.2f |%n",
				v3.getNameCarOwner(), v3.getCarName(), v3.getCapacity(), v3.getPrice(), v3.getTax());
		
		
	}

	public static double countTax(int capacity, double price) {
		double tax;
		if (capacity < 100) {
			tax = price / 100;
		} else if (capacity < 200) {
			tax = price / 100 * 3;
		} else {
			tax = price / 100 * 5;
		}
		return tax;
	}
}
