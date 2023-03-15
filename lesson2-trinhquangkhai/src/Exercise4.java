import java.util.Random;
import java.lang.Math;

public class Exercise4 {
	public static void main(String[] args) {
		Random();

	}

	private static void Random() {

		Random rd = new Random();
		int Random1 = 10 + rd.nextInt(10);
		Exercise3.factorialcaculus(Random1);
		
		int Random2 = 10 + rd.nextInt(10);
		Exercise3.factorialcaculus(Random2);
		
		int Random3 = 10 + rd.nextInt(10);
		Exercise3.factorialcaculus(Random3);
		
		int Random4 = 10 + rd.nextInt(10);
		Exercise3.factorialcaculus(Random4);
		
		double sum;
		sum = Random1 + Random2 + Random3 + Random4;
		System.out.println("Tổng gia thừa là: " + sum);
	}

}
