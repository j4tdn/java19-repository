package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Ex03SundayCounter {
	public static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		for(Calendar c1 : getSunday(c)) {
			System.out.println(df.format(c1.getTime()));
		}
			
	}
	public static Calendar[] getSunday(Calendar c) {
		Calendar[] rs = new Calendar[5];
		
		Calendar first = (Calendar)c.clone();
		first.set(Calendar.DAY_OF_MONTH,1);
		
		Calendar end = (Calendar)c.clone();
		end.set(Calendar.DAY_OF_MONTH,end.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);
		
		Calendar running = (Calendar)first.clone();
		
		int counter = 0;
		while(running.before(end)) {
			if(running.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				rs[counter++] = (Calendar)running.clone();
				running.add(Calendar.WEEK_OF_MONTH, 1);
				continue;
			}
			running.add(Calendar.DAY_OF_MONTH,1);
		}
		return Arrays.copyOfRange(rs, 0, counter);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	