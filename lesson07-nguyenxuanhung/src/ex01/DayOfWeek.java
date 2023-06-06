package ex01;

public enum DayOfWeek {

	SUNDAY("SUNDAY"), MONDAY("MONDAY"), TUESDAY("TUESDAY"), 
	WEDNESDAY("WEDNESDAY"), THURSDAY("THURSDAY"), FRIDAY("FRIDAY"), 
	SATURDAY("SATURDAY");
	
	private String text;
	
	DayOfWeek(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	@Override
	public String toString() {
		return text;
	}
}
