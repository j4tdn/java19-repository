package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;

// tim cac ngay chu nhat trong thang hien tai
//String[] , Date[] , Calendar[]
public class Ex03 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Calendar c = Calendar.getInstance();
		c.set(2023,Calendar.JUNE,8);

		Calendar[] sundays = getSundays(c);
		for (Calendar sunday : sundays) {
				String formattedDate = df.format(sunday.getTime());
				System.out.println("Sunday: " + formattedDate);
		}
	}

	private static Calendar[] getSundays(Calendar c) {
		Calendar[] result = new Calendar[5];

		Calendar firstDayOfMonth = (Calendar) c.clone();//1.6.2023
		firstDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);

		Calendar endDayOfMonth = (Calendar) c.clone();//30.6.2023
		endDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		Calendar running =  firstDayOfMonth;//H1
		int counter = 0;
		while (running.before(endDayOfMonth)) {
			if (running.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				result[counter++] = (Calendar) running.clone();
				running.add(Calendar.WEEK_OF_MONTH, 1);
				continue;
			}
			running.add(Calendar.DAY_OF_MONTH, 1);
		}
		return Arrays.copyOfRange(result,0, counter); 
	}
}
