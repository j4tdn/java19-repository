package builder;



/*
 Lý thuyết về builder
 Builder pattern: là một kĩ thuật để khởi tạo những đối tượng phức tạp 
 + đối tượng có rất nhiều thông tin và thuộc tính >= 5
--> giúp mình thay vì gọi hàm khởi tạo nhiều tham số, dễ nhẫm lẫn khi gán giá trị cho thuộc tính 
--> thay thế phần setter gọn hơn 
 */


public class BuilderDemo {
	public static void main(String[] args) {
		Java20DateTime dt20 = Java20DateTime.of().withDay(20).withMonth(1).withYear(1);
	}
}
