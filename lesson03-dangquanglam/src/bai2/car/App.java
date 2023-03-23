package bai2.car;

import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
		Vehicle myCar1 = new Vehicle("Nguyen Thai Hoang", "Toyota Camry", 35000000.00, 100);
		Vehicle myCar2 = new Vehicle("Nguyen Thai Truong", "Honda Civic", 250000000.00, 3000);
		Vehicle myCar3 = new Vehicle("Truong Thanh Dat", "Ford Mustang", 1000000000.00, 1500);
		System.out.println("Tên chủ xe\t\tLoại xe\t\tDung tích\tTrị giá\t\t\tThuế phải nộp");
		System.out.println("======================================================================================");
		System.out.println(myCar1.getMake() + "\t" + myCar1.getModel() + "\t" + myCar1.getCylinderCapacity() + "\t\t$" + decimalFormat.format(myCar1.getPrice()) + "\t\t$" + decimalFormat.format(myCar1.calculateTax()));
		System.out.println(myCar2.getMake() + "\t" + myCar2.getModel() + "\t" + myCar2.getCylinderCapacity() + "\t\t$" + decimalFormat.format(myCar2.getPrice()) + "\t\t$" + decimalFormat.format(myCar2.calculateTax()));
		System.out.println(myCar3.getMake() + "\t" + myCar3.getModel() + "\t" + myCar3.getCylinderCapacity() + "\t\t$" + decimalFormat.format(myCar3.getPrice()) + "\t$" + decimalFormat.format(myCar3.calculateTax()));

		
		System.exit(0);
	}

}
