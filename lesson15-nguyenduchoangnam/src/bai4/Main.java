package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();

        int[] demKiTu = new int[26]; 

        for (char kiTu : chuoi.toLowerCase().toCharArray()) {
            if (Character.isLetter(kiTu)) {
                int index = kiTu - 'a';
                demKiTu[index]++;
            }
        }

        int maxSoLanXuatHien = 0;

        for (int soLan : demKiTu) {
            if (soLan > maxSoLanXuatHien) {
                maxSoLanXuatHien = soLan;
            }
        }

        if (maxSoLanXuatHien > 0) {
            System.out.print("Ký tự có số lần xuất hiện nhiều nhất: ");
            for (int i = 0; i < demKiTu.length; i++) {
                if (demKiTu[i] == maxSoLanXuatHien) {
                    char kiTu = (char) (i + 'a');
                    System.out.print("\"" + kiTu + "\", ");
                }
            }
            System.out.println("xuất hiện " + maxSoLanXuatHien + " lần.");
        } else {
            System.out.println("Chuỗi không chứa ký tự.");
        }
    }
}



