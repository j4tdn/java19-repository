package JDKLessThan8.bai4;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Bai4Demo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2022, 6, 7);
		solve(c);
	}
	
	public static void solve(Calendar c) {
		int count = 0;
		while(count <= 110) {
			if(c.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				count++;
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(c.getTime()) );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
