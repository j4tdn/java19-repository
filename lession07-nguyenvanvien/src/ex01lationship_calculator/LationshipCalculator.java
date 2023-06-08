package ex01lationship_calculator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import enu.custom.DayOfWeek;
import exception.custom.DateValidator;
import exception.custom.NumberValidator;

public class LationshipCalculator {
	public static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		handleCal();
	}
	public static void handleCal() {
		Calendar startdateC = handleParseDate("\nPlease enter date start dating (dd/MM/yyyy): ");
		System.out.print("\nAre you still in love? (Y/N) : ");
		String answer = sc.nextLine();
		Calendar endDateC = null;
		while(true) {
			if(answer.equals("N")) {
				endDateC = handleParseDate("\nPlease enter date end (dd/MM/yyyy): ");
				break;
			}
			else if(answer.equals("Y")) {
				endDateC = Calendar.getInstance();
				break;
			}
			else {
				System.out.print("\nPlease enter 'Y' or 'N' : ");
				answer = sc.nextLine();
			}
		}
		System.out.println("============ Calculator ============");
		
		int dowAsInt = startdateC.get(Calendar.DAY_OF_WEEK);
		DayOfWeek[] dowAsEnum = DayOfWeek.values();
		System.out.println("Ngày bắt đầu hẹn hò là ngày : " + dowAsEnum[dowAsInt-1]);
		
		long milliseconds = endDateC.getTimeInMillis() - startdateC.getTimeInMillis();

        int years = (int) (milliseconds / (1000L * 60 * 60 * 24 * 365));
        int months = (int) (milliseconds / (1000L * 60 * 60 * 24 * 30) % 12);
        int days = (int) (milliseconds / (1000L * 60 * 60 * 24) % 30);
        int hours = (int) (milliseconds / (1000L * 60 * 60) % 24);
        int minutes = (int) (milliseconds / (1000L * 60) % 60);
        int seconds = (int) (milliseconds / 1000L % 60);

        System.out.println("Mối tinh đã bắt đầu được : \n");
        System.out.println("Số năm: " + years);
        System.out.println("Số tháng: " + months);
        System.out.println("Số ngày: " + days);
        System.out.println("Số giờ: " + hours);
        System.out.println("Số phút: " + minutes);
        System.out.println("Số giây: " + seconds);
	}
	
	public static Calendar handleParseDate(String script) {
		Date dateOut = enterDate(script);
		Calendar startdateC = null;
		if(dateOut != null)
		{
			startdateC = Calendar.getInstance();
			startdateC.setTime(dateOut);
		}
		return startdateC;
	}
	public static Date enterDate(String script) {
		DateValidator dateValidator = new DateValidator();
		Date dateF = new Date();
		while(true) {
			System.out.print(script);
			String date= sc.nextLine();
			try {
				if(dateValidator.isValidDate(date)) {
					dateF = df.parse(date);
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dateF;
	}
}
