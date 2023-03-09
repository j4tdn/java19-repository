package demomain;

public class Ex01DemoMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, Java!");
		System.out.println("============");
		printStarTriangle();
		System.out.println("============");
		printNumberTriangle();
	}
	
	public static void printHelloWorld() {
		System.out.println("Hello World!");
	}
	
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
	}

	public static void printNumberTriangle() {
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
