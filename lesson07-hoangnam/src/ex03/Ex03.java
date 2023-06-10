package ex03;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;

public class Ex03 {

    public static void main(String[] args) {
        printCurrentDateTime("Asia/Ho_Chi_Minh");

        printLastDayOfMonth();

        printFirstAndLastDayOfWeek();

        printCurrentWeekNumber();

        printDateAfter20Days();

        calculateDaysAlive(2003, 11, 5);
    }

    public static void printCurrentDateTime(String timeZone) {
        LocalDateTime now = LocalDateTime.now(ZoneId.of(timeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Thời gian hiện tại ở " + timeZone + ": " + formattedDateTime);
    }

    public static void printLastDayOfMonth() {
        LocalDate today = LocalDate.now();
        LocalDate lastDayOfMonth = today.withDayOfMonth(today.lengthOfMonth());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = lastDayOfMonth.format(formatter);
        System.out.println("Ngày cuối cùng của tháng hiện tại: " + formattedDate);
    }

    public static void printFirstAndLastDayOfWeek() {
        LocalDate today = LocalDate.now();
        LocalDate firstDayOfWeek = today.with(DayOfWeek.MONDAY);
        LocalDate lastDayOfWeek = today.with(DayOfWeek.SUNDAY);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedFirstDay = firstDayOfWeek.format(formatter);
        String formattedLastDay = lastDayOfWeek.format(formatter);
        System.out.println("Ngày đầu tiên của tuần hiện tại: " + formattedFirstDay);
        System.out.println("Ngày cuối cùng của tuần hiện tại: " + formattedLastDay);
    }

    public static void printCurrentWeekNumber() {
        LocalDate today = LocalDate.now();
        int weekNumber = today.get(WeekFields.ISO.weekOfWeekBasedYear());
        System.out.println("Ngày hiện tại đang ở tuần thứ " + weekNumber + " trong năm");
    }

    public static void printDateAfter20Days() {
        LocalDate today = LocalDate.now();
        LocalDate after20Days = today.plusDays(20);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE");
        String formattedDate = after20Days.format(formatter);
        System.out.println("Sau 20 ngày nữa là ngày " + formattedDate);
    }

    public static void calculateDaysAlive(int year, int month, int day) {
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        long daysAlive = Duration.between(birthDate.atStartOfDay(), today.atStartOfDay()).toDays();
        System.out.println("Số ngày đã sống từ ngày sinh: " + daysAlive + " ngày");
    }
}

