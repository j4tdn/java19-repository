package exercise;

import java.util.Scanner;
import java.util.Calendar;

public class Ex01
{
    public static void main(final String[] args) {
        final Calendar startLove = Calendar.getInstance();
        final Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thoi gian bat dau hen ho: ");
        startLove.set(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        boolean breakUP = false;
        System.out.println("Hai ban da chia tay chua (Nhap 0 neu da chia tay hoac 1 neu dang yeu nhau): ");
        breakUP = (sc.nextLine() == "0");
        if (breakUP) {
            final Calendar breakTime = Calendar.getInstance();
            System.out.println("Nhap thoi gian hai ban chia tay: ");
            breakTime.set(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        if (breakUP) {
            final DayOfWeek1[] doW = DayOfWeek1.values();
            startLove.get(7);
        }
    }
}