package demomain;

public class Ex01DemoMainMethod {
	public static void main(String[] args) {
		Ex01DemoMainMethod.printStarTriangle();
		Ex01DemoMainMethod.printNumTriangle();
	}

	private static void printStarTriangle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
	}
	private static void printNumTriangle() {
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
