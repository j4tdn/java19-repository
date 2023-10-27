package bai2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Nhập tuổi hiện tại
        System.out.print("Tuổi: ");
        int age = sc.nextInt();

        // Nhập thời gian đã ngủ
        System.out.println("Thời gian đã ngủ");
        System.out.print("+ Số giờ: ");
        int hoursSlept = sc.nextInt();
        System.out.print("+ Số phút: ");
        int minutesSlept = sc.nextInt();

        // Nhập thời gian bắt đầu ngủ
        System.out.print("Thời gian bắt đầu ngủ: ");
        int startHour = sc.nextInt();

        int totalSleepMinutesRequired = getSleepTimeInMinutes(age);
        int totalSleptMinutes = hoursSlept * 60 + minutesSlept;
        int sleepDeficit = totalSleepMinutesRequired - totalSleptMinutes;

        int wakeUpHour = (startHour + ((totalSleptMinutes + sleepDeficit) / 60)) % 24;
        int wakeUpMinute = (minutesSlept + sleepDeficit) % 60;

        System.out.println("Bạn nên thức dậy lúc: " + wakeUpHour + "H" + (wakeUpMinute < 10 ? "0" : "") + wakeUpMinute);
    }

	 public static int getSleepTimeInMinutes(int age) {
	        if (age >= 1 && age <= 3) {
	            return 20 * 60;
	        } else if (age >= 4 && age <= 13) {
	            return 10 * 60; 
	        } else if (age >= 14 && age <= 17) {
	            return 8 * 60;
	        } else if (age >= 18 && age <= 64) {
	            return 7 * 60;
	        } else if (age >= 65) {
	            return 7 * 60;
	        }
	        return 0;
	    }
	}