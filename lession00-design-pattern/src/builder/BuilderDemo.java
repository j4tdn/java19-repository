package builder;


/**
 * 
 * Lý thuyết : 
 * 
 * Builder pattern là 1 kĩ thuật dể khởi tạo những đối tượng phức tạp
 * 	+ đối tượng có rất nhiều thông tin và thuộc tính >= 5
 * 
 * --> giúp mình thay vì gọi hàm khởi tạo nhiều tham số dễ nhầm lẫn khi mà gán giá trị cho thuộc tính
 * --> giúp thay thế phần setter gọn hơn
 * 
 * */

public class BuilderDemo {
	public static void main(String[] args) {
		Java20DateTime java20DateTime = Java20DateTime.of()
				.withYear(2023)
				.withMonth(3)
				.withDay(19)
				.withHour(20)
				.withMinute(45)
				.withSecond(33);
		java20DateTime.withDay(23);
		System.out.println("Java20DateTime " + java20DateTime);
	}
}
