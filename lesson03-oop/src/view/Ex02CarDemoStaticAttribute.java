package view;

import bean.Car;

public class Ex02CarDemoStaticAttribute {
	public static void main(String[] args) {
		//
		Car.model = "Audi";
		Car c1 = new Car("C1", "Black", 5000);
		Car c2 = new Car("C2", "White", 8000);
		Car c3 = new Car("C3", "Red", 3000);
		Car c4 = new Car("C4", "Black", 4000);
		Car c5 = new Car("C5", "White", 6000);
		Car c6 = new Car("C6", "Red", 7000);
		Car c7 = new Car("C7", "Red", 5000);

        Car.model = "MG";
		System.out.println("c1--> " + c1);
		System.out.println("c2--> " + c2);
		System.out.println("c3--> " + c3);
		System.out.println("c4--> " + c4);
		System.out.println("c5--> " + c5);
		System.out.println("c6--> " + c6);
		System.out.println("c7--> " + c7);

	}
}