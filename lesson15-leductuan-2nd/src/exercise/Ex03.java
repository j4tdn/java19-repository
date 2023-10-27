package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Tuổi của bạn: ");
        int age = scanner.nextInt();

        System.out.print("Thời gian đã ngủ (giờ): ");
        int hours = scanner.nextInt();

        System.out.print("Thời gian đã ngủ (phút): ");
        int minutes = scanner.nextInt();

        System.out.print("Thời gian bắt đầu ngủ (giờ): ");
        int startHour = scanner.nextInt();

        int recommendedSleepTime = getRecommendedSleepTime(age);
        int remainingSleepTime = recommendedSleepTime - hours;
        int remainingMinutes = 60 - minutes;
        int wakeUpHour = (startHour + remainingSleepTime) % 24;
        int wakeUpMinutes = remainingMinutes % 60;

        System.out.println("Bạn nên thức dậy lúc: " + wakeUpHour + "H" + wakeUpMinutes);
    }

    public static int getRecommendedSleepTime(int age) {
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
}
