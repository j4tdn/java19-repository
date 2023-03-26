package bai3_vehicle;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {

	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
	
		
		int choose;
		int quantity = 0;
		Vehicle[] arr = null;
		do {
			System.out.println("Chọn chức năng bạn muốn sử dụng: \n" + "1.Nhập thông tin và tạo N đối tượng xe \n"
					+ "2.Xuất bảng kê khai tiền thuế của các xe.\n" + "3.Thoát chương trình. \n"
					+ "=====================================================");

			choose = sc.nextInt();
			sc.nextLine();
			switch (choose) {
			case 1: {
				System.out.println("Nhập số lượng xe");
				quantity = sc.nextInt();
				sc.nextLine();
				arr = new Vehicle[quantity];
				for (int i = 0; i < arr.length; i++) {
					System.out.println("Nhập xe thứ [" + (i + 1) + "]");
					input(arr[i] = new Vehicle());
				}
				break;
			}
			case 2: {
				System.out.printf("%-20s%-20s%20s%20s%20s \n\n", "Tên chủ xe", "Loại xe", "Dung tích",
						"Trị giá", "Thuế");
				for (int i = 0; i < quantity; i++) {
					arr[i].show();
				}
				break;
			}

			default:
				System.out.println("Exited");
				break;
			}
		} while (choose == 1 || choose == 2);
	}

	static void input(Vehicle veh) {
		System.out.print("Nhập Tên chủ xe: ");
		veh.setVehicleOwnerName(sc.nextLine());
		System.out.print("Nhập loại xe: ");
		veh.setTypeOfVehicle(sc.nextLine());
		System.out.print("Nhập dung tích: ");
		veh.setCapacity(sc.nextInt());
		System.out.print("Nhập trị giá: ");
		veh.setPrice(sc.nextDouble());
		sc.nextLine();
	}

}
