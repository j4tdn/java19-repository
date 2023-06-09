package builder;

public class Java20DateTime {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int second;
	
	public Java20DateTime() {
	}
	
	public static Java20DateTime of() {
		return new Java20DateTime();
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public Java20DateTime withYear(int year) {
		this.year = year;
		return this;
	}

	public Java20DateTime withMonth(int month) {
		this.month = month;
		return this;
	}

	public Java20DateTime withDay(int day) {
		this.day = day;
		return this;
	}

	public Java20DateTime withHour(int hour) {
		this.hour = hour;
		return this;
	}

	public Java20DateTime withMinute(int minute) {
		this.minute = minute;
		return this;
	}

	public Java20DateTime withSecond(int second) {
		this.second = second;
		return this;
	}
	
	
	
}
