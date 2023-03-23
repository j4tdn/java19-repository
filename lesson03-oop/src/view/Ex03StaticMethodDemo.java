package view;

public class Ex03StaticMethodDemo {
public static void main(String[] args) {
	System.out.println("sum 1: " + Ex03StaticMethodDemo.sum(1, 2));
	System.out.println("sum 2: " + Ex03StaticMethodDemo.sum(2, 3));
	System.out.println("sum 3: " + Ex03StaticMethodDemo.sum(3, 4));
}
public static int sum(int a, int b) {
	return a + b;
}

	

}
