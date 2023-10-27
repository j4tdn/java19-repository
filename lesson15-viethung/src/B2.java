package org.example;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi hiện tại của bạn: ");
        int age = sc.nextInt();

        System.out.print("Nhập thời gian đã ngủ trong ngày (giờ-phút)\n");
        System.out.print("Số giờ: ");
        int hoursSlept = sc.nextInt();
        System.out.print("Số phút: ");
        int minutesSlept = sc.nextInt();

        System.out.print("Nhập thời gian bắt đầu ngủ (định dạng 24H, vd: 23H): ");
        String startTime = sc.next();
        int startHour = Integer.parseInt(startTime.substring(0, startTime.length()-1));

        int minSleep = 0;
        if (age <= 3) {
            minSleep = 20;
        } else if (age <= 13) {
            minSleep = 10;
        } else if (age <= 17) {
            minSleep = 8;
        } else if (age <= 64) {
            minSleep = 7;
        } else {
            minSleep = 8;
        }

        int timeSleptMinutes = (hoursSlept * 60) + minutesSlept;
        int minSleepMinutes = minSleep * 60;

        int remainingMins = minSleepMinutes - timeSleptMinutes;

        int wakeUpHour = (startHour + remainingMins/60) % 24;
        int wakeUpMins = remainingMins % 60;

        System.out.println("Bạn nên thức dậy lúc: " + wakeUpHour + "H" + String.format("%02d", wakeUpMins));
    }
}
