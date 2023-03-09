package view;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		//final
		//Khi them tu khoa final vao truoc phan khai bao bien VD: final int a; final int x;
		// thi minh khong the dung toan tu = de gan gia tri khac cho a hay x nua
		
		//KDL nguyen thuy- primitive type
		
		
		
		//KDL doi tuong
		final Item it1 = new Item(123, 'A', 252f);
		Item it2 = new Item(234, 'B', 263f);
		
		it1.id = 474;
		System.out.println("it1 --> " + it1);
		
	}
}
