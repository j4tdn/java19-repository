package view;

public class Ex02Local_Global_Variable {
	
	public static int gA = 5;
	
	public static void main(String[] args) {
		// Phạm vi sử dụng của biến --> trong block scpoe {}
		// Biến cục bộ: Biển được khai báo trong 1 hàm nào đó 
		// Biến toàn cục (thuộc tính): Biến được khai báo trong 1 class nào đó
		System.out.println(gA);
		test();;
	}
	public static void test() {
		System.out.println(gA);
	}
}
