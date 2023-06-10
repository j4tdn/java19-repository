package ex01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheUltimateRelationshipCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày bắt đầu hẹn hò (theo định dạng dd/MM/yyyy): ");
        String startDateStr = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate = LocalDate.parse(startDateStr, formatter);

        System.out.print("Bạn đã chia tay chưa? (Y/N): ");
        String breakupOption = scanner.nextLine();

        if (breakupOption.equalsIgnoreCase("Y")) {
            System.out.print("Nhập ngày chia tay (theo định dạng dd/MM/yyyy): ");
            String breakupDateStr = scanner.nextLine();
            LocalDate breakupDate = LocalDate.parse(breakupDateStr, formatter);

            Duration duration = Duration.between(startDate.atStartOfDay(), breakupDate.atStartOfDay());
            long years = duration.toDays() / 365;
            long months = (duration.toDays() % 365) / 30;
            long days = (duration.toDays() % 365) % 30;
            long hours = duration.toHours() % 24;
            long minutes = duration.toMinutes() % 60;
            long seconds = duration.getSeconds() % 60;

            System.out.println("Mối tình đã bắt đầu được: " + years + " năm, " + months + " tháng, " + days + " ngày, " + hours + " giờ, " + minutes + " phút, " + seconds + " giây.");
        } else {
            String dayOfWeek = startDate.getDayOfWeek().toString();
            System.out.println("Ngày bắt đầu hẹn hò là: " + dayOfWeek);
        }

        scanner.close();
    }
}

