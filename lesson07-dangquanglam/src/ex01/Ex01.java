package ex01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Calendar startDay = Calendar.getInstance();
		
		try {
			// Nhập ngày bắt đầu hẹn hò
			System.out.print("Nhập ngày bắt đầu hẹn hò của hai người (dd/MM/yyyy): ");
			String input1 = sc.nextLine();
			startDay.setTime(df.parse(input1));
		} catch (ParseException e) {
			startDay.setTime(new Date()); // Lấy thời gian hiện tại
		}

		// Nhập ngày chia tay (nếu có)
		Calendar endDay = Calendar.getInstance();
		System.out.print("Nhập ngày chia tay của hai người (nếu có) (dd/MM/yyyy): ");
		String input2 = sc.nextLine();
		if (!input2.isEmpty()) {
			try {
				endDay.setTime(df.parse(input2));
			} catch (ParseException e) {
				endDay.setTime(new Date()); // Lấy thời gian hiện tại
			}
		}

		// Tính số ngày giữa hai ngày
		long diff;
		if (endDay.after(startDay)) {
			diff = endDay.getTimeInMillis() - startDay.getTimeInMillis();
		} else {
			diff = startDay.getTimeInMillis() - endDay.getTimeInMillis();
		}
		long days = diff / (24 * 60 * 60 * 1000);
	

		DateFormat dayOfWeek = new SimpleDateFormat("EEEE");
		System.out.println("Ngày bắt đầu hẹn hò là ngày thứ: " + dayOfWeek.format(startDay.getTime()));
		System.out.println("Mối tình đã bắt đầu được " + days + " ngày.");
		System.out.println("time in love (s): " + (endDay.getTimeInMillis() - startDay.getTimeInMillis())/1000);
		System.out.println("time in love (min): " + (endDay.getTimeInMillis() - startDay.getTimeInMillis())/1000/60);
		System.out.println("time in love (h): " + (endDay.getTimeInMillis() - startDay.getTimeInMillis())/1000/60/60);
		System.out.println("time in love (days): " + Math.round((double)(endDay.getTimeInMillis() - startDay.getTimeInMillis())/1000/60/60/24));
		System.out.println("time in love (months): " + Math.round((double)(endDay.getTimeInMillis() - startDay.getTimeInMillis())/1000/60/60/24/30));
		System.out.println("time in love (years): " + Math.round((double)(endDay.getTimeInMillis() - startDay.getTimeInMillis())/1000/60/60/24/365));
	}
}
