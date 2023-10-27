package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Tuổi của bạn: ");
		int age = scanner.nextInt();

		System.out.println("Thời gian đã ngủ:");

		System.out.print("+ Số giờ: ");
		int hours = scanner.nextInt();

		System.out.print("+ Số phút: ");
		int minutes = scanner.nextInt();

		System.out.print("Thời gian bắt đầu ngủ (giờ): ");
		int bedtime = scanner.nextInt();

		double recommendedSleepHours;
		if (age >= 1 && age <= 3) {
			recommendedSleepHours = 20.0;
		} else if (age >= 4 && age <= 13) {
			recommendedSleepHours = 11.0;
		} else if (age >= 14 && age <= 17) {
			recommendedSleepHours = 9.0;
		} else if (age >= 18 && age <= 64) {
			recommendedSleepHours = 8.0;
		} else {
			recommendedSleepHours = 7.5;
		}

		double totalSleepMinutes = (recommendedSleepHours - hours) * 60 - minutes;
		int wakeUpTime = bedtime * 60 + (int) totalSleepMinutes;
		int wakeUpHours = wakeUpTime / 60;
		wakeUpHours = wakeUpHours - 24;
		int wakeUpMinutes = wakeUpTime % 60;

		System.out.println("Bạn nên thức dậy lúc: " + wakeUpHours + "H" + wakeUpMinutes + " sáng");
	}
}
