package operator;

public class Ex02OperatorTest {
	public static void main(String[] args) {
		int x = 5;
		int y = 2;
		int z = 3;
		y += y + x++ + z++ + ++z + ++x - y-- + z;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
