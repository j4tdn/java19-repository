package view;

import bean.Car;

public class Ex02CarDemoStaticAttribute {
	public static void main(String[] args) {
		Car car1 = new Car("1", "black", 1500);
		Car car2 = new Car("2", "red", 1600);
		Car car3 = new Car("3", "blue", 2000);
		Car car4 = new Car("4", "violet", 3000);
		Car car5 = new Car("5", "grey", 2500);
		Car.setModel("MG");
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		System.out.println(car5);
	}
}
