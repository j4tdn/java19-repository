package view;

public class Ex03StaticMethodDemo {
       public static void main(String[] args) {
		System.out.println("sum1 --> " + Ex03StaticMethodDemo.sum(10, 20));
		System.out.println("sum2 --> " + Ex03StaticMethodDemo.sum(1, 22));

	}
       public static int sum(int a, int b) {
    	   return a + b;
       }
}
