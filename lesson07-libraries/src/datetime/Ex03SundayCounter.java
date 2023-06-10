package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class Ex03SundayCounter {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar[] sundays = getAllSundaysInMonth(c);
		for (Calendar calendar : sundays) {
			System.out.println(df.format(calendar.getTime()));
		}
	}

	private static Calendar[] getAllSundaysInMonth(Calendar c) {
		Calendar[] res = new Calendar[5];
		Calendar firstDayOfMonth = (Calendar) c.clone();
		firstDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);

		Calendar endDayOfMonth = (Calendar) c.clone();
		endDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);

		Calendar running = (Calendar) firstDayOfMonth.clone();

		int counter = 0;
		while (running.before(endDayOfMonth)) {
			if (running.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				res[counter++] = (Calendar) running.clone();
				running.add(Calendar.WEEK_OF_MONTH, 1);
				continue;
			}
			running.add(Calendar.DAY_OF_MONTH, 1);
		}
		return Arrays.copyOfRange(res, 0, counter);
	}

}
