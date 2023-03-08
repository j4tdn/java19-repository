package view;

import datastructure.object.custom.Student;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		//final
		//VD: final int a;   final Student stu;
		//--> Thì mình k thể dùng toán tử = để gán giá thì khác cho a hay stu nữa
		
		//primitive type
		final int digit = 9;
		int age = 23;
		
		age = digit;
		
		//object type
		final Student stu = new Student(1,"A",23,"ABC");
		stu.setName("Thành Đạt");
		System.out.println(stu);
	}
	
}
