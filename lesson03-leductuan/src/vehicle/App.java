package vehicle;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.ListView;

public class App {
	public static void main(String[] args) {
		
		ArrayList<Vehicle> listVehicle = new ArrayList<>();
		
		while(true) {
			System.out.println("+---------------------------------+");
			System.out.println("| 1.Nhập thông tin.               |");
			System.out.println("| 2.Xuất bản kê khai tiền thuế.   |");
			System.out.println("| 3.Thoát chương trình.           |");
			System.out.println("+---------------------------------+");
			System.out.print("Chọn chức năng: ");
			Scanner scanner = new Scanner(System.in);
			int a =scanner.nextInt();
			scanner.nextLine();
			
			if (a==1) {
				
				System.out.print("Nhập tên chủ xe: ");
				String name= scanner.nextLine();
				System.out.print("Nhập loại xe: ");
				String type= scanner.nextLine();
				System.out.print("Nhập dung tích xe: ");
				int cap = scanner.nextInt();
				System.out.print("Nhập giá xe: ");
				double price = scanner.nextDouble();
				double tax = App.calTax(cap, price);
				Vehicle v1 = new Vehicle(name,type,cap,price,tax);
				listVehicle.add(v1);								
			}
			else if(a==2) {
				System.out.println("");
				System.out.println(" Tên chủ xe\t" + "\tLoại xe\t" + "\tDung tích\t" + "Trị giá" + "\t\t" +"\tThuế phải nộp");
				System.out.println("===============================================================================================");
				for (int i = 0; i < listVehicle.size(); i++) {		           
		            System.out.println(listVehicle.get(i));
				}
				System.out.println("");
				
			}
			else if(a==3) {
				break;
			}
			else System.out.println("Vui lòng chọn lại!!");
			
			
			
			
		}
		
		
	}
	
	public static double calTax(int cap, double price) {
		double discount=1;
		if(cap<100) {
			discount=0.01;
		}
		if(cap>=100&&cap<=200) {
			discount=0.03;
		}
		if(cap>200) {
			discount=0.05;
		}

		return price*discount;
	}
	
}
