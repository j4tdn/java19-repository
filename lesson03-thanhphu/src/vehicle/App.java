package vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		ArrayList<Vehicle> listVehicle = new ArrayList<>();
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap so luong xe :");
		int n = ip.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("Nhap ten chu xe: ");
			String name = ip.next();
			System.out.print("Nhap loai xe: ");
			String type = ip.next();
			System.out.print("Nhap dung tich xe: ");
			int cap = ip.nextInt();
			System.out.print("Nhap gia xe: ");
			double cost = ip.nextDouble();
			double tax = App.calTax(cap, cost);
			Vehicle v1 = new Vehicle(name, type, cap, cost, tax);
			listVehicle.add(v1);

		}
		
		System.out.println("");
		System.out.println(" Ten chu xe\t" + "\tLoai xe\t" + "\tDung tich\t" + "\tTri gia\t" + "\tThue phai nop\t");
		System.out.println(
				"===============================================================================================");
		for (int j = 0; j < listVehicle.size(); j++) {
			System.out.println(listVehicle.get(j));
		}
		System.out.println("");
	}

	private static double calTax(int cap, double cost) {
		double taxPercentage = 1;

		if (cap < 100) {
			taxPercentage = 0.01;
		} else if (cap <= 200) {
			taxPercentage = 0.03;
		} else {
			taxPercentage = 0.05;
		}

		return taxPercentage * cost;
	}
}
