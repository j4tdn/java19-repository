package demomain;

public class Ex01DemoMainMethod {
public static void main(String[] args) {
	System.out.println("1.Class name");
	System.out.println("2.Main Method");
	System.out.println("\n============\n");
	Ex01DemoMainMethod.printStarTriangle();
	System.out.println("\n============\n");
	Ex01DemoMainMethod.printNumberTriangle();
	}
public static void printStarTriangle() {
	System.out.println("*");
	System.out.println("**");
	System.out.println("***");
	System.out.println("****");
	System.out.println("*****");
}
private static void printNumberTriangle() {
	System.out.println("1");
	System.out.println("1 2");
	System.out.println("1 2 3");
	System.out.println("1 2 3 4");
	System.out.println("1 2 3 4 5");

}
}
