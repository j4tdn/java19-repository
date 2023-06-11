package builder;

public class BuilderDemo {
	
	/*
	 Lý thuyết về builder Pattern
	 
	 Builder pattern: là kỹ thuật để khởi tạo những đối tượng phức tạp 
	 	+ Đối tượng có rất nhiều thuộc tính >=5
	 -> giúp mình thay vì gọi hàm khởi tạo nhiều tham số, dễ nhầm lẫn khi gán giá trị cho thuộc tính 
	 -> giúp mình thay thế phần setter gọn hơn 
	 -> chỉ khởi tạo giá trị builder cho instance 1 lần ban đầu 
	  		muốn set lại giá trị -> không được 
	 
	 Thực thi: 
	  -> Sử dụng 1 nested builder class để tạo ra instance cho current class
	  Builder: khởi tạo đối tượng, set giá trị vào 
	  Class	 : lưu trữ, sử dụng giá trị 
	 */
public static void main(String[] args) {
	Java20DateTime dt20 = Java20DateTime.of()
			.withDay(20)
			.withMonth(12)
			.withYear(2022)
			.withHour(10)
			.withMinute(12);
	dt20.withMinute(50);
	System.out.println("dt20 -> " + dt20);
	
}
}
