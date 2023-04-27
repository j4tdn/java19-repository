package exam;

public class Bai1 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
	}

	public static boolean isPowerOf(Integer input1, Integer input2) {
		double checkResult1;
		double checkResult2;
		checkResult1 = Math.log(input1) / Math.log(input2);
		checkResult2 = Math.log(input2) / Math.log(input1);

		return (checkResult1 == (int) checkResult1) || (checkResult2 == (int) checkResult2);
	}
}
