package view;

import bean.Car;

public class Ex02CarDemo {
	public static void main(String[] args) {
		// tạo 3 đối tượng car chứa giá trị bất kì
		// yêu cầu : tất cả đều thuộc model--> audi
		
		
		Car.model = "Audi";
		Car c1 = new Car("C1", "Black", "Audi", 5000);
		Car c2 = new Car("C2", "Red", "Audi", 6000);
		Car c3 = new Car("C3", "Pink", "Audi", 8000);
		Car c4 = new Car("C4", "Grey", "Audi", 8800);
		Car c5 = new Car("C5", "White", "Audi", 3800);
		Car c6 = new Car("C6", "Blue", "Audi", 7000);
		Car c7 = new Car("C7", "Violet", "Audi", 9000);
		
		
		Car.model = "MG";
		
		// chủ sở hữu muốn đổi tên model thành MG
		// lấy từng phần tử ra để set lại giá trị của model thành MG
		
		System.out.println("C1-->"+c1);
		System.out.println("C2-->"+c2);
		System.out.println("C3-->"+c3);
		System.out.println("C4-->"+c4);
		System.out.println("C5-->"+c5);
		System.out.println("C6-->"+c6);
		System.out.println("C7-->"+c7);
		
	}
	
}
