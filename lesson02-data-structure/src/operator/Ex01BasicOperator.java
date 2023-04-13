package operator;

import javax.sound.midi.Soundbank;

public class Ex01BasicOperator {
	public static void main(String[] args) {
		// toan tu gan --> convention - quy tac

		int a = 6;
		a += 2;// a = a + 2
		a *= 2;// a = a * 2
		// System.out.println("a --> " + a);

		// toan tu 1 ngoi
		a++; // a = a + 1;
		a--; // a = a - 1;

		int x = 5;
		int y = 2;
		int z = 3;
		y += y + x++ + z++ + ++z + ++x - y-- + z;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
