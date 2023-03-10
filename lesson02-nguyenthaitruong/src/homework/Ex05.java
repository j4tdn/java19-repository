package homework;

import java.util.Scanner;

public class Ex05 {
	public static boolean isSymmetric(int n) {
        String numStr = Integer.toString(n);
        int len = numStr.length();
        
        for (int i = 0; i < len / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(len - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int n = sc.nextInt();

        if (isSymmetric(n)) {
            System.out.println(n + " là số đối xứng.");
        } else {
            System.out.println(n + " không là số đối xứng.");
        }
    }
}

