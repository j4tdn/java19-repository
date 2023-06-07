package datetime;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

// Ex03 : Tìm các ngày chủ nhật trong tháng hiện tại
// 			String[], Date[], Calendar[]

public class Ex03SundayCounter {
	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		calendar.set(2023, Calendar.JULY,8);
		
		for(Calendar c : getSundays(calendar)) {
			System.out.println(df.format(c.getTime()));
		}
	}
	private static Calendar[] getSundays(Calendar c) {
		Calendar[] result = new Calendar[5];
		
		Calendar firstDayOfMonth = (Calendar)c.clone();
		firstDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
		
		Calendar endDayOfMonth = (Calendar)c.clone();
		endDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH)+1);
		
		Calendar running = Calendar.getInstance();
		running.setTime(firstDayOfMonth.getTime());
		int counter =0;
		while(running.before(endDayOfMonth)) {
			if(running.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				result[counter++] = (Calendar)running.clone();
				running.add(Calendar.WEEK_OF_MONTH, 1);
				continue;
			}
			running.add(Calendar.DAY_OF_MONTH, 1);
		}
		return Arrays.copyOfRange(result, 0, counter);
	}
}
