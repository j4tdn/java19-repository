package view;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {

	public static void main(String[] args) {
		// Final
		//Khi thêm từ khóa final vào trước phần khai báo biến
		//VD: final int a;
		//Thì mình k thể dùng toán tử = để gán giá trị khác cho a nữa
		
		// KDL nguyên thủy - primitive type
		final int digit =18;
		int age=28;
		//KDL đối tượng
		Item it1 =new Item(123,'A',252f);
		Item it2 =new Item(125,'B',672f);
		it1.id=474;
		System.out.println("it1-->"+it1);
		
	}

}
