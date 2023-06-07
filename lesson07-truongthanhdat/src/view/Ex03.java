package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03 {
    public static void main(String[] args) {
        displayCurrentTime("Asia/Ho_Chi_Minh");
        displayLastDayOfMonth();
        displayFirstAndLastDayOfWeek();
        displayCurrentWeekOfYear();
        displayDateAfterNdays(20);
        calculateDaysAlive();
    }

    public static void displayCurrentTime(String timeZone) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
        Date currentDate = new Date();
        String currentTime = dateFormat.format(currentDate);
        System.out.println("Thời gian hiện tại ở " + timeZone + ": " + currentTime);
    }

    public static void displayLastDayOfMonth() {
        Calendar calendar = Calendar.getInstance();
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        String lastDayOfMonth = String.format("%02d/%02d/%04d", lastDay, month, year);
        System.out.println("Ngày cuối cùng của tháng hiện tại: " + lastDayOfMonth);
    }

    public static void displayFirstAndLastDayOfWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String firstDayOfWeek = dateFormat.format(calendar.getTime());
        calendar.add(Calendar.DAY_OF_WEEK, 6);
        String lastDayOfWeek = dateFormat.format(calendar.getTime());
        System.out.println("Ngày đầu tiên của tuần hiện tại: " + firstDayOfWeek);
        System.out.println("Ngày cuối cùng của tuần hiện tại: " + lastDayOfWeek);
    }

    public static void displayCurrentWeekOfYear() {
        Calendar calendar = Calendar.getInstance();
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Tuần hiện tại trong năm: Tuần thứ " + weekOfYear);
    }

    public static void displayDateAfterNdays(int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, n);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy, EEEE");
        String dateAfterNdays = dateFormat.format(calendar.getTime());
        System.out.println("Sau " + n + " ngày là ngày: " + dateAfterNdays);
    }

    public static void calculateDaysAlive() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
        String birthDateString = scanner.nextLine();
        Date birthDate = parseDate(birthDateString);
        if (birthDate == null) {
            System.out.println("Ngày tháng năm sinh không hợp lệ.");
            return;
        }

        Calendar currentDate = Calendar.getInstance();
        Calendar birthDateCalendar = Calendar.getInstance();
        birthDateCalendar.setTime(birthDate);

        long millisecondsAlive = currentDate.getTimeInMillis() - birthDateCalendar.getTimeInMillis();
        long daysAlive = millisecondsAlive / (24 * 60 * 60 * 1000);
        System.out.println("Bạn đã sống được " + daysAlive + " ngày.");
        System.out.println("Bạn đã sống được " + millisecondsAlive + " mili giây.");

        scanner.close();
    }

    private static Date parseDate(String dateString) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
        } catch (ParseException e) {
            return null;
        }
    }
}
