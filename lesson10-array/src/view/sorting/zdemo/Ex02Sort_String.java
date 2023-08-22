package view.sorting.zdemo;

import java.util.Arrays;

public class Ex02Sort_String {
public static void main(String[] args) {
	String[] sequences = {"a", "z", "b", "f", "c", "k", "d"};
	System.out.println("sequence -> " + Arrays.toString(sequences));
	Arrays.sort(sequences);
	System.out.println("sequence sorted  -> " + Arrays.toString(sequences));

}
}
