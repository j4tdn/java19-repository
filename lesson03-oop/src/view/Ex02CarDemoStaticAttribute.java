package view;

import bean.Car;

public class Ex02CarDemoStaticAttribute {
	public static void main(String[] args) {
		
		int a = 5;
		
		// Tạo N đối tượng Car chứa giá trị bất kỳ(đầy đủ thông tin)
		// Yêu cầu: tất cả đều thuộc model --> Audi
		Car.model = "Audi";
		Car c1 = new Car("C1", "Black", 5000); // H1
		Car c2 = new Car("C2", "White", 8000); // H2
		Car c3 = new Car("C3", "Red", 3000);   // H3
		Car c4 = new Car("C4", "Green", 8000); // H4
		Car c5 = new Car("C5", "Blue", 3200);  // H5
		Car c6 = new Car("C6", "Violet", 4800);// H6
		Car c7 = new Car("C7", "Gray", 6400);  // H7
		
		// Chủ sở hữu muốn đổi tên model thành MG
		// Lấy từng phần tử ra để set lại giá trị của model thành MG
		Car.model = "MG";
		// c2.model = "MG"; --> dễ hiểu nhầm cập nhật giá trị của đối tượng c2
		
		// Khi yêu cầu tất cả xe có model cùng giá trị
		// Nếu lưu biến model riêng trên mỗi đối tượng
		// + Tốn vùng nhớ cho việc trùng giá trị
		// + Có thể sai(những đối tượng có thể mang giá trị model # nhau) dữ liệu
		
		// Giải pháp
		// + Biến thuộc tính model trở thành là thuộc tính dùng chung(giá trị, ô nhớ) cho tất cả các đối tượng
		// của classs Car
		
		// Thuộc tính
		
		// static: thuộc phạm vi của class
		//       : nên được gọi truy cập từ class
		//       : tất cả các đối tượng tạo ra từ class này để có chung
		//         giá trị của thuộc tính static
		
		// non-static: thuộc phạm vi của đối tượng
		//           : nên được gọi truy cập từ đối tượng
		//           : mỗi đối tượng sẽ lưu trữ giá trị riêng
		//             cho biến non-static đó
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		System.out.println("c5 --> " + c5);
		System.out.println("c6 --> " + c6);
		System.out.println("c7 --> " + c7);
	}
}