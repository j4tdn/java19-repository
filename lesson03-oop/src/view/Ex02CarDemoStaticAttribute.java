package view;

import bean.Car;

public class Ex02CarDemoStaticAttribute {
public static void main(String[] args) {
	// Tạo 3 đối tượng Car chứa giá trị bất kỳ(đầy đủ thông tin)
	// 
	Car.model = "Audi";
	Car c1 = new Car("C1", "Black",  5000);
	Car c2 = new Car("C2", "White", 8000);
	Car c3 = new Car("C3", "Red", 3000);
	Car c4 = new Car("C3", "Green", 8000);
	Car c5 = new Car("C3", "Blue", 3200);
	Car c6 = new Car("C3", "Violet", 4800);
	Car c7 = new Car("C3", "Gray", 6400);
	Car.model = "MG";
	System.out.println("c1 -> " +c1);
	System.out.println("c2 -> " +c2);
	System.out.println("c3 -> " +c3);
	System.out.println("c4 -> " +c4);
	System.out.println("c5 -> " +c5);
	System.out.println("c6 -> " +c6);
	System.out.println("c7 -> " +c7);
}
}
