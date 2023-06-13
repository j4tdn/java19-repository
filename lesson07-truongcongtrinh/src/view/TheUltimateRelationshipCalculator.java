package view;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static utils.DateUtils.*;

public class TheUltimateRelationshipCalculator {

	private static final Scanner sc = new Scanner(System.in);
	private static final Calendar currentDate = Calendar.getInstance();

	public static void main(String[] args) {

		Date startDate = parseDateFormat("Start Dating Date", "dd/MM/yyyy HH:mm:ss",1);

		Date endDate;
		while (true) {
			System.out.println("Are you break up? (y/n): ");
			String confirm = sc.nextLine();
			if (confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("Y")) {
				endDate = parseDateFormat("Break-up Date", "dd/MM/yyyy HH:mm:ss",1);
				if (endDate.before(startDate)) {
					System.out.println("Your Break-up Date Should Exceed Your Start Dating Date!");
					continue;
				}
				break;
			}

			if (confirm.equalsIgnoreCase("n") || confirm.equalsIgnoreCase("N")) {
				endDate = currentDate.getTime();
				break;
			}

			else
				System.out.println("Your input must be [y,Y] or [n/N]!");
		}

		System.out.println("Ngày bắt đầu hẹn hò là ngày " + getDayOfWeek(startDate));
		System.out.println("Your Dating Time's Duration: ");
		System.out.println(getDurationBetween(startDate, endDate));
	}

	

	

}
