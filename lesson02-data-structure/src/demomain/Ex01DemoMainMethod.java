package demomain;

public class Ex01DemoMainMethod {
	public static void main(String[] args) {
		//Comment - Chú thích
		//sout --> phím tắt
		//println --> In nội dung ra --> xuống hàng
		//println --> In ra và không xuống hàng
		System.out.println("1. Class name");
		System.out.println("2. Main method");
		
		System.out.println("\n=========\n");
		Ex01DemoMainMethod.printStarTriangle();
		
		System.out.println("\n=========\n");
		Ex01DemoMainMethod.prinfNumTriangle();
		
		System.out.println("\n=========\n");

	}
	private static void printStarTriangle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
	}
	private static void prinfNumTriangle() {
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
	
}
