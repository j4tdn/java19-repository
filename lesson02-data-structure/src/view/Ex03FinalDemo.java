package view;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
public static void main(String[] args) {
	// Final 
	// Khi them từ khóa Final vào trước phần khai báo biến
	// VD: final int a; final Item x;
	// -> Mình không thể dùng toán tử = để gán giá trị khác cho a hay x nữa
	// KDl nguyên thủy - primitive type
	int digit = 18;
	int age = 28;
	//age = digit;
	Item it1 = new Item(123, 'A', 252f);
	Item it2 = new Item(234, 'B', 363f);
	it1.id = 474;
	System.out.println("it1 -> " + it1);
}
}
