package view.sorting.zdemo;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02Sort_String {

	public static void main(String[] args) {

		String[] sequences = { "a", "z", "b", "f", "c", "k", "d" };

		System.out.println("sequences --> " + Arrays.toString(sequences));

		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				//Phương thức này nhận hai chuỗi s1 và s2 để so sánh và trả về một số nguyên
				return s2.compareTo(s1);
			}
		});

		System.out.println("sequences sorted --> " + Arrays.toString(sequences));
	}
}
