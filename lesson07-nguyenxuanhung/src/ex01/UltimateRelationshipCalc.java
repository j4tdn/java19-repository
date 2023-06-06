package ex01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UltimateRelationshipCalc {
	private static Scanner scanner = new Scanner(System.in);
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		executeCalc();
	}

	private static void executeCalc() {

		System.out.println("input fisrt day (dd/MM/yyyy): ");
		Date firstDay = null;

		while (true) {
			try {
				String firstDayString = scanner.nextLine();
				firstDay = df.parse(firstDayString);
				break;
			} catch (ParseException e) {
				System.out.println("Invalid input format. Please try again.");
			}
		}

		System.out.println("in love(1) or broken up(0)");
		int inLove = -1;
		while (true) {
			inLove = Integer.parseInt(scanner.nextLine());
			if (inLove == 1 || inLove == 0) {
				break;
			}
			System.out.println("input again:");
		}

		Date brokenUpDay = null;
		if (inLove == 0) {
			System.out.println("Input broken up day (dd/MM/yyyy): ");
			while (true) {
				try {
					String brokenUpDayString = scanner.nextLine();
					brokenUpDay = df.parse(brokenUpDayString);
					break;
				} catch (ParseException e) {
					System.out.println("Invalid input format. Please try again.");
				}
			}
		}
		
		System.out.println(firstDay + " " + inLove + " " + brokenUpDay);
		
		Calendar firstDayCalendar = Calendar.getInstance();
		firstDayCalendar.setTime(firstDay);
		DayOfWeek[] dowAsEnum = DayOfWeek.values();
		System.out.println("first day: " + dowAsEnum[firstDayCalendar.get(Calendar.DAY_OF_WEEK) - 1 ]);
		long duration = Long.MIN_VALUE;
		if(inLove == 1) {
			duration = Calendar.getInstance().getTimeInMillis() - firstDayCalendar.getTimeInMillis();
		}
		else {
			Calendar brokenUpDayCalendar = Calendar.getInstance();
			brokenUpDayCalendar.setTime(brokenUpDay);
			duration = brokenUpDayCalendar.getTimeInMillis() - firstDayCalendar.getTimeInMillis();
		}
		int seconds = (int) (duration / 1000) % 60;
        int minutes = (int) ((duration / (1000 * 60)) % 60);
        int hours = (int) ((duration / (1000 * 60 * 60)) % 24);
        int days = (int) (duration / (1000 * 60 * 60 * 24));
        
        System.out.println("Duration");
        System.out.println("Day: " + days);
        System.out.println("Hour: " + hours);
        System.out.println("Minute: " + minutes);
        System.out.println("Second: " + seconds);

	}
}
