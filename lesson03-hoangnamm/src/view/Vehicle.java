package view;

import java.util.Scanner;

public class Vehicle {
	private String own;
    private String name;
    private int engineSize;
    private double value;

    public Vehicle(String own, String name, int engineSize, double value) {
    	this.name = own;
        this.name = name;
        this.engineSize = engineSize;
        this.value = value;
    }

    public double calculateTax() {
        if (engineSize < 100) {
            return value * 0.01;
        } else if (engineSize >= 100 && engineSize <= 200) {
            return value * 0.03;
        } else {
            return value * 0.05;
        }
    }

    public void displayInfo() {
        System.out.println("Tên chủ xe: " + own);
        System.out.println("Tên xe: " + name);
        System.out.println("Dung tích xylanh: " + engineSize);
        System.out.println("Trị giá xe: " + value);
        System.out.println("Thuế phải nộp: " + calculateTax());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng xe: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin xe thứ " + (i + 1) + ":");
            System.out.print("Tên chủ xe: ");
            String own = scanner.nextLine();
            System.out.print("Tên xe: ");
            String name = scanner.nextLine();
            System.out.print("Dung tích xylanh: ");
            int engineSize = scanner.nextInt();
            System.out.print("Trị giá xe: ");
            double value = scanner.nextDouble();
            scanner.nextLine(); // đọc bỏ dòng mới thừa
            vehicles[i] = new Vehicle(own, name, engineSize, value);
        }
        System.out.println("Bảng kê khai tiền thuế trước bạ của các xe:");
        for (int i = 0; i < n; i++) {
            vehicles[i].displayInfo();
            System.out.println("--------------------");
        }
        System.out.println("Thoát chương trình.");
    }
}
