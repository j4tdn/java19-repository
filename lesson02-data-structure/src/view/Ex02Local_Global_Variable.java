package view;

public class Ex02Local_Global_Variable {
	
	public static int gA = 950;
	
	public static void main(String[] args) {
		// cú pháp : [access modifier][static][final] data_type variable_name;
		int a = 9;
//		String text = "hello";
		test(a);
		System.out.println("gA" + gA);
	}
	
	private static void test(int input) {
		input = 10;
	}
	
	
}
