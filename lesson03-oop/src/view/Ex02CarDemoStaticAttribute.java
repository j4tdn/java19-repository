package view;

import bean.Car;

public class Ex02CarDemoStaticAttribute {

	public static void main(String[] args) {
		// tao 3 doi tuong Car chua gia tri bat ky (day du thong tin)
		Car car1 = new Car("C1", "Black", 10000f);
		Car car2 = new Car("C2", "Gray", 8000f);
		Car car3 = new Car("C3", "Brown", 5000f);
		
		Car.model = "Audi";
		
		System.out.println("c1 --> " + car1.toString());
		System.out.println("c2 --> " + car2.toString());
		System.out.println("c3 --> " + car3.toString());
	}

}
