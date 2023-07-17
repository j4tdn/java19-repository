package view;

import functional.Operator;

public class Ex02Numberator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		
//		process(x, y, (a , b) -> {
//			return a + b;
//		});
		
		System.out.println("add --> " + process(x, y, (a , b) -> a + b));
		System.out.println("subtract --> " + process(x, y, (a , b) -> a - b));
		System.out.println("add --> " + process(x, y, Ex02Numberator::sum));

	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	private static int process(int a, int b, Operator operator) {
		return operator.operate(a, b);
	}

}
