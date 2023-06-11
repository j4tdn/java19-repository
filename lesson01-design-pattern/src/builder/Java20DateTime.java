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

	public Java20DateTime withYear(int year) {
		this.year = year;
		return new Java20DateTime();
	}

	public int getMonth() {
		return month;
	}

	public Java20DateTime withMonth(int month) {
		this.month = month;
		return new Java20DateTime();
	}

	public int getDay() {
		return day;
	}

	public Java20DateTime withDay(int day) {
		this.day = day;
		return new Java20DateTime();
	}

	public int getHour() {
		return hour;
	}

	public Java20DateTime withHour(int hour) {
		this.hour = hour;
		return new Java20DateTime();
	}

	public int getMinute() {
		return minute;
	}

	public Java20DateTime withMinute(int minute) {
		this.minute = minute;
		return new Java20DateTime();
	}

	public int getSecond() {
		return second;
	}

	public Java20DateTime withSecond(int second) {
		this.second = second;
		return new Java20DateTime();
	}
	@Override
	public String toString() {
		return "Java20DateTime [year=" + year + ", month=" + month + ", day=" + day + ", hour=" + hour + ", minute="
				+ minute + ", second=" + second + "]";
	}
	
}
