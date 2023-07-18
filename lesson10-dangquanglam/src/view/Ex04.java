package view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {
	public static void main(String[] args) {
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};

        // Sắp xếp tăng dần
        Arrays.sort(strings, (s1, s2) -> compare(s1, s2));

        // In mảng đã sắp xếp
        for (String s : strings) {
            System.out.print(s + ", ");
        }

        System.out.println();

        // Sắp xếp giảm dần
        Arrays.sort(strings, (s1, s2) -> -1 * compare(s1, s2));

        // In mảng đã sắp xếp
        for (String s : strings) {
            System.out.print(s + ", ");
        }
    }

    private static int compare(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return 0;
        }
        if (s1 == null) {
            return 1;
        }
        if (s2 == null) {
            return -1;
        }

        // Xử lý Special
        if (s1.equals("Special")) {
            return -1;
        }
        if (s2.equals("Special")) {
            return 1;
        }

        // Xử lý số âm
        boolean s1IsNegative = s1.charAt(0) == '-';
        boolean s2IsNegative = s2.charAt(0) == '-';

        if (s1IsNegative && s2IsNegative) {
            try {
                return Integer.parseInt(s1) - Integer.parseInt(s2); // Sắp xếp số âm tăng dần
            } catch (NumberFormatException e) {
                return 1;
            }
        }
        if (s1IsNegative) {
            return -1;
        }
        if (s2IsNegative) {
            return 1;
        }

        // Xử lý số dương
        int s1Int, s2Int;
        try {
            s1Int = Integer.parseInt(s1);
            s2Int = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            return s1.compareTo(s2);
        }

        if (s1Int != s2Int) {
            return s1Int - s2Int; // Sắp xếp số dương tăng dần
        }

        // Xử lý chuỗi
        return s1.compareTo(s2); // Sắp xếp chuỗi tăng dần
    }
}