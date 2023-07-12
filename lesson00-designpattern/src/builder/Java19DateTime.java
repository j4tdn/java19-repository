package builder;

// --> Lombok: @Annotation @Getter, @Setter
// --> Compile: Auto generate constructor, getter, setter

public class Java19DateTime {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int second;

	private Java19DateTime() {
	}

	private Java19DateTime(Builder builder) {
		this.year = builder.year;
		this.month = builder.month;
		this.day = builder.day;
		this.hour = builder.hour;
		this.minute = builder.minute;
		this.second = builder.second;
	}
	
	public static Builder builder() {
		return new Builder();
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

	@Override
	public String toString() {
		return "Java19DateTime [year=" + year + ", month=" + month + ", day=" + day + ", hour=" + hour + ", minute="
				+ minute + ", second=" + second + "]";
	}

	/**
	 * Builder of own class --> Java19DateTime
	 */
	public static class Builder {
		private int year;
		private int month;
		private int day;
		private int hour;
		private int minute;
		private int second;
		
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
			return new Java19DateTime(this);
		}

	}
}