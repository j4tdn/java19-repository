package view;

import bean.Car;

public class Ex02CarDemoStaticAttribute {
	public static void main(String[] args) {
		Car car1 = new Car("1", "blue", 200000);
		Car car2 = new Car("2", "black", 100000);
		Car car3 = new Car("3", "while", 400000);
//		Car car4 = new Car("4", "red",300000);
//		Car car5 = new Car("5", "gray",500000);
//		Car car6 = new Car("6", "green",700000);
		
		Car.model = "Honda";
		Car.model = "Audi";
		System.out.println(car1 + "\n" + car2 + "\n" + car3);
	}
}
