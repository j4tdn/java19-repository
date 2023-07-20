package bai4.view;

import java.util.Arrays;

import bai4.funtional.StringComparator;

public class Ex04 {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

		// ASC
		bubbleSort(strings, (s1, s2) -> {
			if (s1 == null && s2 != null) {
				return true;
			}
			if (s2 == null) {
				return false;
			}
			if (s1.equals("Special") && !s2.equals("Special")) {
				return false;
			}
			if (s2.equals("Special")) {
				return true;
			}
			if (s1.matches("-?\\d+(\\.\\d+)?") && s2.matches("-?\\d+(\\.\\d+)?")) {
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);
				return a > b;
			}
			if (s1.matches("-?\\d+(\\.\\d+)?") && !s2.matches("-?\\d+(\\.\\d+)?")) {
				return false;
			}
			if (s2.matches("-?\\d+(\\.\\d+)?")) {
				return true;
			}
			return s1.compareTo(s2) > 0;
		});
		System.out.println("ASC: " + Arrays.toString(strings));

		// DESC
		bubbleSort(strings, (s1, s2) -> {
			if (s1 == null && s2 != null) {
				return false;
			}
			if (s2 == null) {
				return true;
			}
			if (s1.equals("Special") && !s2.equals("Special")) {
				return true;
			}
			if (s2.equals("Special")) {
				return false;
			}
			if (s1.matches("-?\\d+(\\.\\d+)?") && s2.matches("-?\\d+(\\.\\d+)?")) {
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);
				return a < b;
			}
			if (s1.matches("-?\\d+(\\.\\d+)?") && !s2.matches("-?\\d+(\\.\\d+)?")) {
				return true;
			}
			if (s2.matches("-?\\d+(\\.\\d+)?")) {
				return false;
			}
			return s1.compareTo(s2) < 0;
		});
		System.out.println("DESC: " + Arrays.toString(strings));

	}

	private static void bubbleSort(String[] sequences, StringComparator comparator) {
		for (int i = 0; i < sequences.length; i++) {
			for (int j = 0; j < sequences.length - 1 - i; j++) {
				if (comparator.compareTo(sequences[j], sequences[j + 1])) {
					String temp = sequences[j];
					sequences[j] = sequences[j + 1];
					sequences[j + 1] = temp;
				}
			}
		}
	}
}
