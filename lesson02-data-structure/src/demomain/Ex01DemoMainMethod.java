package demomain;

public class Ex01DemoMainMethod {
	public static void main(String[] args) {
		System.out.println("1. Class name");
		System.out.println("2. Main method");
		
		printStarTriangle();		
		printNumberTriangle();
	}
	
	public static void printStarTriangle() {
		System.out.println("\n=================================\n");
		
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
	}
	
	public static void printNumberTriangle() {
		System.out.println("\n=================================\n");
		
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
