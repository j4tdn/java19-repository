package polymorphism.method;

import java.util.Iterator;

import javax.naming.spi.DirStateFactory.Result;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		sum(1,2);
		double total = sum(2d,4d);
		System.out.println("total: " + total);
	}
	
	private static double sum(double... numbers) {
		double result = 0d;
		for (double d : numbers) {
			result += d;
		}
		return result;
	}
	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

	private static float sum(float a, float b) {
		return a + b;
	}

}
