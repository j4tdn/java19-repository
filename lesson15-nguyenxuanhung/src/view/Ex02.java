package view;

import java.time.LocalTime;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input your age: ");
		int age = scanner.nextInt();

		System.out.println("time was asleep:");
		System.out.print("hours: ");
		int hoursSlept = scanner.nextInt();
		System.out.print("minutes: ");
		int minutesSlept = scanner.nextInt();

		System.out.println("Starting sleep time: ");
		System.out.print("hours: ");
		int startingSleepTimeHours = scanner.nextInt();
		System.out.print("minutes: ");
		int startingSleepTimeMinutes = scanner.nextInt();

		
		double recommendedSleepHours = recommendedSleepHours(age);
		double totalSleptMinutes = (hoursSlept * 60) + minutesSlept;
		double remainingSleepMinutes = (recommendedSleepHours * 60) - totalSleptMinutes;
		
		LocalTime startedSleepTime = LocalTime.of(startingSleepTimeHours, startingSleepTimeMinutes);
		LocalTime wakeUpTime = startedSleepTime.plusMinutes((long) remainingSleepMinutes);
		
		System.out.println("You should wake up at: " + wakeUpTime.getHour() + "H" + wakeUpTime.getMinute());
	}

	public static double recommendedSleepHours(int age) {
		if (age >= 1 && age <= 3) {
			return 20.0;
		} else if (age >= 4 && age <= 13) {
			return 11.5;
		} else if (age >= 14 && age <= 17) {
			return 9.0;
		} else if (age >= 18 && age <= 64) {
			return 8.0;
		} else {
			return 7.5;
		}
	}
}
