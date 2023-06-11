package ex01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập ngày bắt đầu hẹn hò (theo định dạng dd-MM-yyyy HH:mm:ss):");
		String startDateString = scanner.nextLine();

		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date startDate;
		try {
			startDate = dateFormat.parse(startDateString);
		} catch (ParseException e) {
			System.out.println("Định dạng ngày không hợp lệ. Hãy thử lại với định dạng dd-MM-yyyy HH:mm:ss.");
			return;
		}

		Calendar startCalendar = Calendar.getInstance();
		startCalendar.setTime(startDate);

		Calendar endCalendar = Calendar.getInstance();

		System.out.println("Bạn đã chia tay chưa? (Y/N)");
		String breakupOption = scanner.nextLine();

		if (breakupOption.equalsIgnoreCase("Y")) {
			System.out.println("Nhập ngày chia tay (theo định dạng dd-MM-yyyy HH:mm:ss):");
			String endDateString = scanner.nextLine();

			Date endDate;
			try {
				endDate = dateFormat.parse(endDateString);
			} catch (ParseException e) {
				System.out.println("Định dạng ngày không hợp lệ. Hãy thử lại với định dạng dd-MM-yyyy HH:mm:ss.");
				return;
			}

			endCalendar.setTime(endDate);
		}

		long milliseconds = endCalendar.getTimeInMillis() - startCalendar.getTimeInMillis();
		long seconds = milliseconds / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;
		long days = hours / 24;
		long months = days / 30;
		long years = months / 12;

		System.out.println("Ngày bắt đầu hẹn hò là ngày thứ " + startCalendar.get(Calendar.DAY_OF_WEEK) + ".");
		System.out.println("Mối tình đã bắt đầu được " + years + " năm, " + (months % 12) + " tháng, " + (days % 30)
				+ " ngày, " + (hours % 24) + " giờ, " + (minutes % 60) + " phút, " + (seconds % 60) + " giây.");
	}

}
