package builder;

//Lombok: @Annotation @Setter @Setter
//--> Compile: Auto generate constructor, getter, setter
public class Java19DateTime {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int second;
	
//	hàm tạo builder
	public static Builder builder() {
		return new Builder();
	}
	
	public Java19DateTime() {
	
	}

//	public Java19DateTime(int year, int month, int day, int hour, int minute, int second) {
//		super();
//		this.year = year;
//		this.month = month;
//		this.day = day;
//		this.hour = hour;
//		this.minute = minute;
//		this.second = second;
//	}
	
	public Java19DateTime(Builder builder) {
		this.year = builder.year;
		this.month = builder.month;
		this.day = builder.day;
		this.hour = builder.hour;
		this.minute = builder.minute;
		this.second = builder.second;
	}

	public int getYear() {
		return year;
	}

//	public void setYear(int year) {
//		this.year = year;
//	}

	public int getMonth() {
		return month;
	}

//	public void setMonth(int month) {
//		this.month = month;
//	}

	public int getDay() {
		return day;
	}

//	public void setDay(int day) {
//		this.day = day;
//	}

	public int getHour() {
		return hour;
	}

//	public void setHour(int hour) {
//		this.hour = hour;
//	}

	public int getMinute() {
		return minute;
	}

//	public void setMinute(int minute) {
//		this.minute = minute;
//	}

	public int getSecond() {
		return second;
	}

//	public void setSecond(int second) {
//		this.second = second;
//	}

	@Override
	public String toString() {
		return "Java19DateTime [year=" + year + ", month=" + month + ", day=" + day + ", hour=" + hour + ", minute="
				+ minute + ", second=" + second + ", getYear()=" + getYear() + ", getMonth()=" + getMonth()
				+ ", getDay()=" + getDay() + ", getHour()=" + getHour() + ", getMinute()=" + getMinute()
				+ ", getSecond()=" + getSecond() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	/**
	 * Builder of it own class (Java19DateTime)
	 * @author Admin
	 *
	 */
	public static class Builder {
		private int year;
		private int month;
		private int day;
		private int hour;
		private int minute;
		private int second;
		
//		private constructor
		private Builder() {
		}

		public Builder withYear(int year) {
			this.year = year;
			return this;
		}

		public Builder withMonth(int month) {
			this.month = month;
			return this;
		}

		public Builder withDay(int day) {
			this.day = day;
			return this;
		}

		public Builder withHour(int hour) {
			this.hour = hour;
			return this;
		}

		public Builder withMinute(int minute) {
			this.minute = minute;
			return this;
		}

		public Builder withSecond(int second) {
			this.second = second;
			return this;
		}
		
		public Java19DateTime build() {
			return new Java19DateTime();
		}
		
		
	}
}