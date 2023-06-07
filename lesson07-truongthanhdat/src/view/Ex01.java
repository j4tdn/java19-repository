package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày bắt đầu hẹn hò (yyyy-MM-dd): ");
        String startDateString = scanner.nextLine();

        System.out.print("Có đã chia tay? (y/n): ");
        String breakupInput = scanner.nextLine();

        Calendar startDate = Calendar.getInstance();
        startDate.setTime(parseDate(startDateString));

        Calendar now = Calendar.getInstance();
        Calendar endDate;

        if (breakupInput.equalsIgnoreCase("y")) {
            System.out.print("Nhập ngày chia tay (yyyy-MM-dd): ");
            String endDateString = scanner.nextLine();
            endDate = Calendar.getInstance();
            endDate.setTime(parseDateTime(endDateString));
        } else {
            endDate = Calendar.getInstance();
        }

        long days = daysBetween(startDate, endDate);
        int years = yearsBetween(startDate, endDate);
        int months = monthsBetween(startDate, endDate);
        int hours = hoursBetween(startDate, endDate);
        int minutes = minutesBetween(startDate, endDate);
        int seconds = secondsBetween(startDate, endDate);

        DateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.getDefault());
        System.out.println("Ngày bắt đầu hẹn hò là ngày thứ " + dateFormat.format(startDate.getTime()));
        System.out.println("Mối tình đã bắt đầu được " + years + " năm, " + months + " tháng, " +
                days + " ngày, " + hours + " giờ, " + minutes + " phút, " +
                seconds + " giây");

        scanner.close();
    }

    private static Date parseDate(String dateString) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Date parseDateTime(String dateTimeString) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateTimeString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static long daysBetween(Calendar startDate, Calendar endDate) {
        long startTime = startDate.getTimeInMillis();
        long endTime = endDate.getTimeInMillis();
        return (endTime - startTime) / (24 * 60 * 60 * 1000);
    }

    private static int yearsBetween(Calendar startDate, Calendar endDate) {
        int startYear = startDate.get(Calendar.YEAR);
        int endYear = endDate.get(Calendar.YEAR);
        return endYear - startYear;
    }

    private static int monthsBetween(Calendar startDate, Calendar endDate) {
        int startMonth = startDate.get(Calendar.MONTH);
        int startYear = startDate.get(Calendar.YEAR);
        int endMonth = endDate.get(Calendar.MONTH);
        int endYear = endDate.get(Calendar.YEAR);
        return (endYear - startYear) * 12 + (endMonth - startMonth);
    }

    private static int hoursBetween(Calendar startDate, Calendar endDate) {
        long startTime = startDate.getTimeInMillis();
        long endTime = endDate.getTimeInMillis();
        return (int) ((endTime - startTime) / (60 * 60 * 1000));
    }

    private static int minutesBetween(Calendar startDate, Calendar endDate) {
        long startTime = startDate.getTimeInMillis();
        long endTime = endDate.getTimeInMillis();
        return (int) ((endTime - startTime) / (60 * 1000));
    }

    private static int secondsBetween(Calendar startDate, Calendar endDate) {
        long startTime = startDate.getTimeInMillis();
        long endTime = endDate.getTimeInMillis();
        return (int) ((endTime - startTime) / 1000);
    }
}