package exercise;

import java.util.Date;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ex02
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final Calendar c = Calendar.getInstance();
        final SimpleDateFormat checkInput = new SimpleDateFormat("dd MM yyyy");
        int day;
        int month;
        int year;
        while (true) {
            System.out.println("Input time: ");
            day = sc.nextInt();
            month = sc.nextInt();
            year = sc.nextInt();
            try {
                checkInput.parse(String.valueOf(day) + " " + month + " " + year);
            }
            catch (InputMismatchException | ParseException ex2) {
                final Exception ex;
                System.out.println("Re-enter !!");
                continue;
            }
            break;
        }
        final Date d = new Date(year - 1900, month - 1, day);
        c.setTime(d);
        final SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");
        final DayOfWeek1[] dayOfWeekEnum = DayOfWeek1.values();
        final int dayOfWeek = c.get(7);
        System.out.println(String.valueOf(df.format(d)) + " is a " + dayOfWeekEnum[dayOfWeek - 1]);
        final int doY = c.get(6);
        final int dayLeft = c.getActualMaximum(6) - doY;
        final MonthOfYear[] monthInEnum = MonthOfYear.values();
        System.out.println("Addition facts:");
        System.out.println("\t- It is number " + doY + " of the year, " + dayLeft + " days left.");
        System.out.println("\t- It is " + dayOfWeekEnum[dayOfWeek - 1] + " number " + c.get(3) + " out of " + c.getActualMaximum(3) + " in " + c.get(1) + ".");
        final Calendar firstDayOfMonth = Calendar.getInstance();
        final Calendar lastDayOfMonth = Calendar.getInstance();
        firstDayOfMonth.setTime(d);
        lastDayOfMonth.setTime(d);
        firstDayOfMonth.set(5, 1);
        lastDayOfMonth.set(5, lastDayOfMonth.getActualMaximum(5));
        int weekCount = 0;
        int monthWeek = 0;
        final Calendar i = firstDayOfMonth;
        while (!i.after(lastDayOfMonth)) {
            if (c.get(7) == i.get(7)) {
                ++monthWeek;
                if (!i.after(c)) {
                    ++weekCount;
                }
            }
            i.add(5, 1);
        }
        System.out.println("\t- It is " + dayOfWeekEnum[dayOfWeek - 1] + " number " + weekCount + " out of " + monthWeek + " in " + monthInEnum[c.get(2)] + " " + c.get(1));
        System.out.println("\t- Year " + c.get(1) + " has " + c.getActualMaximum(6) + " days");
        System.out.println("\t- " + monthInEnum[c.get(2)] + " " + c.get(1) + " has " + c.getActualMaximum(5) + " days");
    }
}