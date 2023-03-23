package view;
import bean.Car;

public class Ex02CarDemoStaticAttribute {
	public static void main(String[] args) {
		Car.model = "Audi";
		//Tạo 3 đối tượng Car chứa giá trị bất kì
		Car c1 = new Car("C1", "Black",5000);
		Car c2 = new Car("C2", "White",8000);
		Car c3 = new Car("C3", "Red",3000);
		
		//Khu yêu cầu tất cả xe có Model có cùng giá trị
		//Nếu lưu biến Model riêng trên mỗi đối tượng
		// +Tốn vùng nhớ cho việc trùng giá trị
		// +Có thể sai (những đối tượng có thể mạng giá trị model # nhau)
		Car.model = "MG";
		//Giải pháp
		// + Biến biến model trổ thành là thuộc tính dùng chung(gái trị, ô nhớ) cho tất cả các đối tượng của Class Car
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
