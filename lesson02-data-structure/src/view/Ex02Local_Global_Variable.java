package view;

public class Ex02Local_Global_Variable {
	public static int gA=10;
	public static void main(String[] args) {
		// Phạm vi sử dụng của biến --> block scope {}
		// Biến cục bộ: biến đucợ khai báo trong một hàm nào đó
		// Biến toàn cục(thuộc tính): Biến được khai báo trong một class nào đó
		// Cú pháp biến cục bộ: final] data_type variable_name
		int a=8;
		String text ="hello";
		test(a);
		System.out.println("gA");
	}
	public static void test(int input) {
		input =10;
	}
}
