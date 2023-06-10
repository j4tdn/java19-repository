package datetime;

/**
 * KDL đối tượng, cho phép chứa tập hợp các phần tử, thường là phần tử ko đổi
 * VD: ErrorCode --> Internal, Success, NotFound
 *   : Status    --> Success, Fail, Sending
 *
 */
public enum DayOfWeek {
	// DayOfWeek MONDAY = new DayOfWeek();
	// DayOfWeek MONDAY = new DayOfWeek("Thứ Hai");
	
	// MONDAY là biến, đồng thời cũng là giá trị của enum
	// Không thể khởi tạo thêm phần tử, giá trị mới cho enum bên ngoài
	// Mặc định private constructor
	
	SUNDAY("Chủ Nhật"), MONDAY("Thứ Hai"), TUESDAY("Thứ Tư"), 
	WEDNESDAY("Thứ Tư"), THURSDAY("Thứ Năm"), FRIDAY("Thứ Sáu"), 
	SATURDAY("Thứ Bảy");
	
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