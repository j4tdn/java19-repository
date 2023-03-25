package exercise03.vehicle;

import java.util.Scanner;

public class AppCar {

	static Scanner sc = new Scanner(System.in);

	static void importCar(Vehicle car) {
		System.out.println("Tên chủ xe: ");
		car.setOwner(sc.nextLine());

		System.out.println("Loại xe: ");
		car.setRange(sc.nextLine());

		System.out.println("Dung tích: ");
		car.setCapacity(sc.nextInt());

		System.out.println("Giá trị: ");
		car.setPrice(sc.nextDouble());
		sc.nextLine();

		System.out.println("Thuế phải nộp: ");
		car.setTax(sc.nextLine());
	}

	public static void main(String[] args) {
		Vehicle v[] = null;
		int a = 0;
		int n = 0;
		boolean flag = true;

		do {
			System.out.println("==============");
			System.out.println(
					"1. Nhập thông tin \n" + "2. Xuất bảng kê khai tiền thuế của các xe \n" + "3. Nhập số khác để thoát");
			a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("Nhập số xe muốn khai báo thuế: ");
				n = sc.nextInt();

				v = new Vehicle[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Xe thứ " + (i + 1));
					v[i] = new Vehicle();
					importCar(v[i]);
				}
				break;
			case 2:
				System.out.printf("%5s %5s %5s %10s %10s %8s \n ", "owner", "range", "capacity", "price", "tax");
				for (int i = 0; i < n; i++) {
					v[i].intax();
				}
				break;
			default:
				System.out.println("bye");
				flag = false;
				break;
			}

		} while (flag);
	}
}
