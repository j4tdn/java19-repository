package ex01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class Ex01_UltimateRelationshipCalculator {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calendar startDate = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            try {
                System.out.println("Nhập ngày bắt đầu hẹn hò của hai người (theo định dạng dd/MM/yyyy):");
                String input = scanner.nextLine();
                Date date = sdf.parse(input);
                startDate.setTime(date);
                Calendar endDate = Calendar.getInstance();
                if (startDate.compareTo(endDate) > 0) {
                    System.out.println("Ngày bắt đầu hẹn hò không thể lớn hơn ngày hiện tại. Vui lòng nhập lại.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại.");
            }
        }

        Calendar endDate = Calendar.getInstance();
        String endDateString = sdf.format(endDate.getTime());
        System.out.println("Ngày hiện tại là: " + endDateString);

//        long days = daysBetween(startDate, endDate);
//        System.out.println("Ngày bắt đầu hẹn hò là ngày thứ " + (days + 1));
        int dow = startDate.get(Calendar.DAY_OF_WEEK);
        DayOfWeek dayOfWeek = DayOfWeek.values()[dow - 1];
        System.out.println("Ngày bắt đầu hẹn hò là " + dayOfWeek.getText());

        long[] duration = durationBetween(startDate, endDate);
        System.out.printf("Mối tình đã bắt đầu được %d năm, %d tháng, %d ngày, %d giờ, %d phút, %d giây.\n",
                duration[0], duration[1], duration[2], duration[3], duration[4], duration[5]);
    }


    private static long[] durationBetween(Calendar startDate, Calendar endDate) {
        long startMillis = startDate.getTimeInMillis();
        long endMillis = endDate.getTimeInMillis();
        long diffMillis = endMillis - startMillis;

        long diffSeconds = diffMillis / 1000;
        long diffMinutes = diffSeconds / 60;
        long diffHours = diffMinutes / 60;
        long diffDays = diffHours / 24;

        long years = diffDays / 365;
        long months = (diffDays % 365) / 30;
        long days = (diffDays % 365) % 30;
        long hours = diffHours % 24;
        long minutes = diffMinutes % 60;
        long seconds = diffSeconds % 60;

        return new long[]{years, months, days, hours, minutes, seconds};
    }
}
