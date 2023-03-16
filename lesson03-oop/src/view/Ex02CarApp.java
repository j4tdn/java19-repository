package view;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		Car x1 = new Car("white");
		Car x2 = new Car("Black");
		Car x3 = new Car("Red");
		Car xk = new Car("Red");
		Car x100 = new Car("Red");
		
		Car.model = "Mazda";
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);		
		System.out.println("xk: " + xk);		
		System.out.println("x100: " + x100);		
	}
}
