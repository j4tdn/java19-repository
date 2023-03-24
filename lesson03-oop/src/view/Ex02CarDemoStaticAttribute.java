package view;

import bean.Car;

public class Ex02CarDemoStaticAttribute {
	public static void main(String[] args) {
		Car.model = "Audi";
		Car c1 = new Car("c1", "black"  , 1000);
		Car c2 = new Car("c2", "white", 2000);
		Car c3 = new Car("c3", "red" , 3000);
		Car c4 = new Car("c4", "green" , 4000);
		Car c5 = new Car("c5", "blue" , 5000);
		Car c6 = new Car("c6", "violet" , 6000);
		Car c7 = new Car("c7", "gray" , 7000);
		
		Car.model = "MG";		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c5.toString());
		System.out.println(c6.toString());
		System.out.println(c7.toString());
	}
}
