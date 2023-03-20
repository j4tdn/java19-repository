package view;

import bean.Car;

public class Ex02CarDemoStaticAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.model= "Audi";
		Car c1 = new Car("c1", "yellow", 1000);
		Car c2 = new Car("c2", "blue", 1000);
		Car c3 = new Car("c3", "red", 1000);
		Car c4 = new Car("c4", "green", 1000);
		Car c5 = new Car("c4", "violet", 1000);
		Car c6 = new Car("c4", "gray", 1000);
		Car c7 = new Car("c4", "black", 1000);
		Car.model = "MG";
		
		System.out.println("c1 -->" +c1);
		System.out.println("c2 -->" +c2);
		System.out.println("c3 -->" +c3);
		System.out.println("c4 -->" +c4);
	}

}
