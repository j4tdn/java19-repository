package view;

import bean.Car;

public class Ex02CarDemo {
	public static void main(String[] args) {
		// Create 3 object Car contain value random 
		Car.modle = "Audi";
		Car c1 = new Car("C1", "Black", 5000);
		Car c2 = new Car("C2", "White", 7000);
		Car c3 = new Car("C3", "Orange", 5400);
		Car c4 = new Car("C4", "Orange", 4220);
		Car c5 = new Car("C5", "Orange", 8800);
		Car c6 = new Car("C6", "Orange", 1400);
		Car c7 = new Car("C7", "Orange", 8000);
		
		Car.modle = "MG";
		
		System.out.println("C1 --> " + c1);
		System.out.println("C2 --> " + c2);
		System.out.println("C3 --> " + c3);
		System.out.println("C4 --> " + c4);
		System.out.println("C5 --> " + c5);
		System.out.println("C6 --> " + c6);
		System.out.println("C7 --> " + c7);
		
		
	}
}
