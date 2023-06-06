package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex03SundayCounter {
	public static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		for (Calendar cal : getSunday(c)) {
			System.out.println(df.format(cal.getTime()));
		}

	}

	private static Calendar[] getSunday(Calendar c) {
		Calendar[] result = new Calendar[5];

		Calendar firstdayofmonth = Calendar.getInstance();
		firstdayofmonth.setTime(c.getTime());
		firstdayofmonth.set(Calendar.DAY_OF_MONTH, 1);

		Calendar enddayofmonth = Calendar.getInstance();
		enddayofmonth.setTime(c.getTime());
		enddayofmonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);

		Calendar running = Calendar.getInstance();
		running.setTime(firstdayofmonth.getTime());

		int counter = 0;
		while (running.before(enddayofmonth)) {
			if (running.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				result[counter++] = (Calendar)running.clone();
				running.add(Calendar.WEEK_OF_MONTH, 1);
				continue;
			}
			running.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println(counter);
		
		return Arrays.copyOfRange(result, 0, counter);
	}
}
