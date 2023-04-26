package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
//		double[] input = {1d, 2d, 3d, 4d};
//		double total = sum(input);
		
		double total = sum(1d, 2d, 3d, 4d);
		System.out.println("total: " +total);

	}
	//+ Khác
	//KDL TRUYỀN VÀO CỦA THAM SỐ
	//Số lượng tham số truyền vào 
	
	
	private static double sum(/*double[]*/ double... numbers) {
		double result = 0d;
		for(double number:numbers) {
			result += number;
		}
		return result;
	}

	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static float sum(float a, float b) {
		return a + b;
	}
}