package view;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		//Final : chỉ tác dụng trên vùng nhớ STACK
		//Chỉ sử dụng với kiểu nghuyên thủy
		
		//Khi thêm từ khóa final vào trước phần khai báo biến
		//VD: final int a; final Iem x;
		//-->Thì không thể dùng toán tử bằng để gán 1 giá trị 
		//khác cho a hay x nữa
		
		//KDL nguyên thủy - pimitive type
		
		int digit = 18;
		final int age = 28;
		
//		age = digit;
		
		//KDL đối tượng
		final Item it1 = new Item(123,"A",252f);
		Item it2 = new Item(234,"B",363f);
		
		it1.id = 474;
		
		System.out.print(it1);
	}
}
