package datetime;

//KDl đối tượng, cho phép chứa tập hợp các phần tử, thường là ptu ko đổi 
//VD: ErrorCode -> Internal, Success
//  : Status	  -> Success, Fail
public enum DayOfWeek {
	// Monday là biến, đồng thời là giá trị của enum
	// Không thể tạo thêm ptu, giá trị mới cho enum bên ngoài
	// Mặc định private constructor

	SUNDAY("Chủ Nhật"), MONDAY("Thứ Hai"), TUESDAY("Thứ Ba"), WEDNESDAY("Thứ Tư"), THURSDAY("Thứ Năm"),
	FRIDAY("Thứ Sáu"), SATURDAY("Thứ Bảy");

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
