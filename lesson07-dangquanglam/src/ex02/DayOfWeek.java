package ex02;

public enum DayOfWeek {
	Sunday("Chủ Nhật"), Monday("Thứ Hai"), Tuesday("Thứ Tư"), Wednesday("Thứ Tư"), Thusday("Thứ Năm"),
	Friday("Thứ Sáu"), Saturday("Thứ Bảy");

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
