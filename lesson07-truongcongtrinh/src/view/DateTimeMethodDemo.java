package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import common.DayOfWeekAsText;

public class DateTimeMethodDemo {
	private static final Scanner sc = new Scanner(System.in);
	private static final Calendar c = Calendar.getInstance();
	private static final DayOfWeekAsText[] dows = DayOfWeekAsText.values();

	public static void main(String[] args) {
		// 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
		System.out.println("1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ");
		System.out.println(TimeZone.getDefault().getID() + " " + format(c, "dd/MM/yyyy HH:mm:ss"));
		System.out.println("\n===================================================================\n");
		// 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
		System.out.println("2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).");
		System.out.println("Last Day Of Current Month: " + format(getLastDayOfCurrentMonth(c), "dd/MM/yyyy"));

		System.out.println("\n===================================================================\n");
		// 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
		System.out.println("3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.");
		System.out.println("First Day Of Current Week: " + format(getFirstAndLastDayOfCurrentWeek(c)[0], "dd/MM/yyyy"));
		System.out.println("Last Day Of Current Week : " + format(getFirstAndLastDayOfCurrentWeek(c)[1], "dd/MM/yyyy"));

		System.out.println("\n===================================================================\n");
		// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		System.out.println("4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.");
		System.out.println(format(c, "dd/MM/yyyy") + " is in Week " + getWeekInMonthOfCurrentDay(c) + " out of "
				+ c.getActualMaximum(Calendar.WEEK_OF_YEAR) + " in " + c.get(Calendar.YEAR));

		System.out.println("\n===================================================================\n");
		// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
		System.out.println("5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.");
		System.out.println("Day after 20 days from current day: " + format(getDayAfter20(c), "dd/MM/yyyy") + " "
				+ dows[getDayAfter20(c).get(Calendar.DAY_OF_WEEK) - 1]);

		System.out.println("\n===================================================================\n");
		// 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu
		// ngày.
		System.out.println("6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.");
		System.out.println(getDayExisted("your Birthday", "dd/MM/yyyy"));
	}

	public static String getDayExisted(String content, String format) {
		Date inputDate;
		do {
			System.out.print("Enter " + content + " (" + format + ")" + ": ");
			String inputDayAsString = sc.nextLine();
			DateFormat df = new SimpleDateFormat(format);
			try {
				inputDate = df.parse(inputDayAsString);

				if (inputDate.after(c.getTime())) {
					throw new IllegalArgumentException(
							content + " Should Not Exceed Current Time --> " + df.format(c.getTime()));
				}

				break;
			} catch (ParseException e) {
				System.out.println("Invalid Format Date " + "(" + format + ")!");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (true);

		Calendar inputCalendar = Calendar.getInstance();
		inputCalendar.setTime(inputDate);

		boolean birthday = false;
		if (inputCalendar.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_MONTH)
				&& inputCalendar.get(Calendar.MONTH) == c.get(Calendar.MONTH)) {
			birthday = true;
		}
		long timeInMillis = (c.getTimeInMillis() - inputDate.getTime());
		long daysExisted = TimeUnit.MILLISECONDS.toDays(timeInMillis);

		if (birthday) {
			return "Happy Birthday To You!\nYou lived " + daysExisted + " days!\n" + "Your birthdate (" + format
					+ ") was on a " + dows[inputCalendar.get(Calendar.DAY_OF_WEEK) - 1] + ".";
		} else {
			return "You lived " + daysExisted + " days!\n" + "Your birthdate (" + format + ") was on a "
					+ dows[inputCalendar.get(Calendar.DAY_OF_WEEK) - 1] + ".";
		}
	}

	private static String format(Calendar c, String format) {
		DateFormat df = new SimpleDateFormat(format);
		return df.format(c.getTime());
	}

	private static Calendar getLastDayOfCurrentMonth(Calendar c) {
		int maxDays = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		Calendar c1 = ((Calendar) c.clone());
		c1.add(Calendar.DAY_OF_MONTH, (maxDays - c.get(Calendar.DAY_OF_MONTH)));
		return c1;
	}

	private static Calendar[] getFirstAndLastDayOfCurrentWeek(Calendar c) {
        Calendar[] result = new Calendar[2];
        result[0] = (Calendar) c.clone();
        result[1] = (Calendar) c.clone();
        result[0].set(Calendar.DAY_OF_WEEK, result[0].getFirstDayOfWeek());
        result[1].set(Calendar.DAY_OF_WEEK, result[1].getActualMaximum(Calendar.DAY_OF_WEEK));
        return result;
    }

	private static Calendar getDayAfter20(Calendar c) {
		Calendar c1 = (Calendar) c.clone();
		c1.add(Calendar.DAY_OF_MONTH, 20);
		return c1;
	}

	private static int getWeekInMonthOfCurrentDay(Calendar c) {
		return c.get(Calendar.WEEK_OF_YEAR);
	}

}
