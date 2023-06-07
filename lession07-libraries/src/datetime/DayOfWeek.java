package datetime;

/**
 * KDL đối tượng cho phép chưa tập hợp các phần tử thường là phần tử không đổi
 * VD: ErrorCode --> Internal, Success, notFound
 * 		Status --> Success, Fail, Sending
 * 
 * */

public enum DayOfWeek {
	
	// Không thể khởi tạo thêm phần tử, giá trị mới cho enum từ bên ngoài
	// Mặc định private constructor
	SUNDAY ("Chủ Nhật"), 
	MONDAY ("Thứ Hai"), 
	TUESDAY ("Thứ Ba"), 
	WEDNESDAY ("Thứ Tư"), 
	THURSDAY ("Thứ Năm"), 
	FRIDAY ("Thứ Sáu"), 
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
