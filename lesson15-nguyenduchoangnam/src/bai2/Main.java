package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bước 1: Nhập tuổi hiện tại của bạn: ");
        int tuoi = scanner.nextInt();

        System.out.print("Bước 2: Nhập giờ đã ngủ trong ngày: ");
        int gioDaNgu = scanner.nextInt();

        System.out.print("Bước 2: Nhập phút đã ngủ trong ngày: ");
        int phutDaNgu = scanner.nextInt();

        System.out.print("Bước 3: Nhập thời gian bắt đầu ngủ (giờ): ");
        int gioBatDau = scanner.nextInt();

        int gioNenThucDayMin = 0;
        int gioNenThucDayMax = 0;

        if (tuoi >= 1 && tuoi <= 3) {
            gioNenThucDayMin = gioBatDau + 20 - gioDaNgu;
            gioNenThucDayMax = gioBatDau + 20 - gioDaNgu;
        } else if (tuoi >= 4 && tuoi <= 13) {
            gioNenThucDayMin = gioBatDau + 10 - gioDaNgu;
            gioNenThucDayMax = gioBatDau + 12 - gioDaNgu;
        } else if (tuoi >= 14 && tuoi <= 17) {
            gioNenThucDayMin = gioBatDau + 8 - gioDaNgu;
            gioNenThucDayMax = gioBatDau + 10 - gioDaNgu;
        } else if (tuoi >= 18 && tuoi <= 64) {
            gioNenThucDayMin = gioBatDau + 7 - gioDaNgu;
            gioNenThucDayMax = gioBatDau + 9 - gioDaNgu;
        } else if (tuoi >= 65) {
            gioNenThucDayMin = gioBatDau + 7 - gioDaNgu;
            gioNenThucDayMax = gioBatDau + 8 - gioDaNgu;
        }

        if (gioNenThucDayMin >= 24) {
            gioNenThucDayMin -= 24;
        }
        if (gioNenThucDayMax >= 24) {
            gioNenThucDayMax -= 24;
        }

        System.out.println("Bước 4: Thời gian bạn nên thức dậy nằm trong khoảng từ " + gioNenThucDayMin + " giờ " + phutDaNgu + " phút đến " + gioNenThucDayMax + " giờ " + phutDaNgu + " phút.");
    }
}





