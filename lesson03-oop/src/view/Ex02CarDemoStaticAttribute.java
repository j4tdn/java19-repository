package view;

import bean.Car;

public class Ex02CarDemoStaticAttribute {

	public static void main(String[] args) {
		// tạo 3 object Car chứa giá trị bất kì đầy đủ thông tin
		// Car c1 = new Car("C1", "Black", "Audi", 5000);
		// Car c2 = new Car("C2", "White", "Audi", 8000);
		// Car c3 = new Car("C3", "Red", "Audi", 3000);
		// Car c4 = new Car("C4", "Green", "Audi", 2000);
		// Car c5 = new Car("C5", "Blue", "Audi", 3200);
		// Car c6 = new Car("C6", "Violet", "Audi", 4300);
		// Car c7 = new Car("C7", "Gray", "Audi", 3300);
		Car c1 = new Car("C1", "Black", 5000);
		Car c2 = new Car("C2", "White", 8000);
		Car c3 = new Car("C3", "Red", 3000);
		Car c4 = new Car("C4", "Green", 2000);
		Car c5 = new Car("C5", "Blue", 3200);
		Car c6 = new Car("C6", "Violet", 4300);
		Car c7 = new Car("C7", "Gray", 3300);

		// Chủ sở hữu muốn đổi tên model thành MG
		// c3.setModel("MG");
		Car.model = "MG";
		// --> static
		// static: thuộc phạm vi của class
		// --> tất cả các đối tượng tạo ra có chung thuộc tính static
		// nên được gọi/ truy cập từ class

		// non-static: thuộc phạm vi của đối tượng
		// mỗi đối tượng sẽ lưu giữ giá trị riêng cho biến non-static đó
		System.out.println("Car1: " + c1);
		System.out.println("Car2: " + c2);
		System.out.println("Car3: " + c3);
		System.out.println("Car4: " + c4);
		System.out.println("Car5: " + c5);
		System.out.println("Car6: " + c6);
		System.out.println("Car7: " + c7);

	}

}
