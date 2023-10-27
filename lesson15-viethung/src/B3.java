package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi 1: ");
        String str1 = sc.nextLine();
        System.out.print("\nNhập chuỗi 2: ");
        String str2 = sc.nextLine();
        boolean isReverse = false;
        char[] c1 = str1.toCharArray();
        Arrays.sort(c1);
        char[] c2 = str2.toCharArray();
        Arrays.sort(c2);
        System.out.println(Arrays.toString(c1).equals(Arrays.toString(c2)));
    }
}
