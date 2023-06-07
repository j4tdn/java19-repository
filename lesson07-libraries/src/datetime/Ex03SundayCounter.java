package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

//Ex03: Tim cac ngay chu nhat trong thang hien tai
//    : String[], Date[], Calendar[]

public class Ex03SundayCounter {
    private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	
    public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(2023, Calendar.JULY, 8);
		
		for(Calendar cal: getSundays(c)) {
			System.out.println(df.format(c.getTime()));
		}
	} 
    private static Calendar[] getSundays(Calendar c) {
    	Calendar[] result = new Calendar[5];
    	
    	Calendar firstDayOfMonth = Calendar.getInstance();
    	firstDayOfMonth.setTime(c.getTime());
    	firstDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
    	
    	Calendar endDayOfMonth = Calendar.getInstance();
    	endDayOfMonth.setTime(c.getTime());
    	endDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
    	endDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
    	
    	Calendar running = Calendar.getInstance();
    	running.setTime(firstDayOfMonth.getTime());
    	
    	int counter = 0;
    	while(running.before(endDayOfMonth)) {
    		if (running.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
    			result[counter++] = (Calendar)running.clone();
    			continue;
    		}
    		running.add(Calendar.DAY_OF_MONTH, 1);
    	}
    	return Arrays.copyOfRange(result, 0, counter);
    }
}
