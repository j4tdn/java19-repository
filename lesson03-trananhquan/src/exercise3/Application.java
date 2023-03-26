package exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) { 
		 Scanner sc = new Scanner(System.in);
		 ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		 
		 System.out.print("- Enter number of vehicle: ");
		 int length = sc.nextInt();
		 
		 for(int i = 0; i < length; i++) {
			 Vehicle v = new Vehicle();
			 System.out.printf("=== Enter vehicle[%d] ===\n", i + 1);
			 v.input();
			 vehicleList.add(v);
		 }
		 
		 System.out.printf("%-25s%-20s%10s%30s%20s\n","Tên chủ xe","Loại xe","Dung tích", "Trị giá", "Thuế phải nộp");
		 System.out.println("===========================================================================================================");
		 for(Vehicle v : vehicleList) {
			 v.output();
		 }
	}
		
}
