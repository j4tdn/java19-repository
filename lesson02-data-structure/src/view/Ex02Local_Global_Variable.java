package view;

import datastructure.object.custom.Item;

// cần import Item

/*	Class
 * 	thuộc tính 
 * 	phương thức
 * 
 */
public class Ex02Local_Global_Variable {

	public static int gA = 999;
	
	public static void main(String[] args) {
		//phạm vi sử dụng của biến --> trong block scope {}
		//biến cục bộ là biến được khai báo trong hàm nào đó, 100% dùng trong block {}
		//biến toàn cục (thuộc tính): biến được khai báo trong class nào đó, ngang với hàm thuộc class (có thể gọi từ bên ngoài)
		
		//Cú pháp:
		//	biến toàn cục:	[access modifier][static][final] data_type variable_name;
		//	biến cục bộ: 	[final] data_type variable_name;
		int a = 8;
		final float PI = 3.14f; //final: không cho thay đổi giá trị tại STACK (ko cho sử dụng toán tử =)
		
		String text = "hello";
		Item itA = new Item();
		
		test(a);
		
		System.out.println("gA1: "+ gA);
	}

	private static void test(int input) {
		input = 10;
		System.out.println("gA2: "+ gA);
	}
}
