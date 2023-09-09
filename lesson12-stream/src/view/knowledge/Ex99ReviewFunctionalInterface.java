package view.knowledge;

import java.util.Arrays;

interface demo {
	void run();
}

public class Ex99ReviewFunctionalInterface {
	public static void main(String[] args) {

		System.out.println("StringBuilder --> Mutable\n");

		StringBuilder sb = new StringBuilder("ádasd");
		System.out.print(sb + " --> ");
		System.out.println(System.identityHashCode(sb));
		sb = sb.reverse();
		System.out.print(sb + " --> ");
		System.out.println(System.identityHashCode(sb));

		System.out.println("\n========================================\n");

		System.out.println("String --> Immutable\n");
		String s = "ádasd";
		System.out.print(s + " --> ");
		System.out.println(System.identityHashCode(s));
		s = s.toUpperCase();
		System.out.print(s + " --> ");
		System.out.println(System.identityHashCode(s));

		System.out.println("\n========================================\n");

		String s1 = "string";
		System.out.print(s1 + " s1 --> ");
		System.out.println(System.identityHashCode(s1));
		StringBuilder sb1 = new StringBuilder(s1);
		System.out.print(sb1 + " --> ");
		System.out.println(System.identityHashCode(sb1));
		sb1 = sb1.reverse();
		System.out.print(sb1 + " --> ");
		System.out.println(System.identityHashCode(sb1));
		s1 = sb1.toString();
		System.out.print(s1 + " s1 --> ");
		System.out.println(System.identityHashCode(s1));

	}

}
