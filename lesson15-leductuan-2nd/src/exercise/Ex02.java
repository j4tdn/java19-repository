package exercise;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int age = inputAge();
		int[] sleepTime = inputSleepTime();
		int sleepStartHour = inputSleepStartHour();

		int[] recommendedWakeUpTime = calculateRecommendedWakeUpTime(age, sleepTime, sleepStartHour);
		printWakeUpTime(recommendedWakeUpTime);
	}

	private static int inputAge() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Tuổi của bạn: ");
		int age = scanner.nextInt();
		return age;
	}

	private static int[] inputSleepTime() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Số giờ đã ngủ: ");
		int hours = scanner.nextInt();
		System.out.print("Số phút đã ngủ: ");
		int minutes = scanner.nextInt();
		return new int[] { hours, minutes };
	}

	private static int inputSleepStartHour() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Thời gian bắt đầu ngủ (giờ): ");
		int sleepStartHour = scanner.nextInt();
		return sleepStartHour;
	}

	private static int[] calculateRecommendedWakeUpTime(int age, int[] sleepTime, int sleepStartHour) {
		int recommendedSleepDuration = getRecommendedSleepDuration(age);
		int sleepDurationMinutes = sleepTime[0] * 60 + sleepTime[1];
		int remainingSleepMinutes = recommendedSleepDuration * 60 - sleepDurationMinutes;

		int wakeUpHour = sleepStartHour + remainingSleepMinutes / 60;
		int wakeUpMinute = remainingSleepMinutes % 60;

		return new int[] { wakeUpHour, wakeUpMinute };
	}

	private static int getRecommendedSleepDuration(int age) {
		if (age >= 1 && age <= 3) {
			return 20;
		} else if (age >= 4 && age <= 13) {
			return 10;
		} else if (age >= 14 && age <= 17) {
			return 8;
		} else if (age >= 18 && age <= 64) {
			return 7;
		} else if (age >= 65) {
			return 7;
		} else {
			return 0;
		}
	}

	private static void printWakeUpTime(int[] wakeUpTime) {
		int wakeUpHour = wakeUpTime[0];
		int wakeUpMinute = wakeUpTime[1];

		System.out.println("Bạn nên thức dậy lúc: " + wakeUpHour + "H" + String.format("%02d", wakeUpMinute));
	}
}
