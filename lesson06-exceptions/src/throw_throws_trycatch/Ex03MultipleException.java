package throw_throws_trycatch;

public class Ex03MultipleException {
	public static void main(String[] args) {
		
	}

	private static int inputAndDivide() {
		int a = input("")
	}
	
	private static int input(String prefix) {
		System.out.println(prefix + ": ");
		return Integer.parseInt(ip.nextLine()));
	}
	private static int divide(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("b should not be zero");
			//khi nem ngoaji le ra  --> doan code phia sau se khong dc thuc thi
		}
		return a / b;
	}
	
}
