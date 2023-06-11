package builder;

import java.math.BigDecimal;

import builder.Java19DateTime.Builder;

/**
 
 Lý thuyết về builder pattern
 
 Builder Patter: là kỹ thuật để khởi tạo những đối tượng phức tạp
   + đối tượng có rất nhiều thuộc tính >= 5 tt
 
	 --> giúp mình thay vì gọi hàm khởi tạo nhiều tham số, dễ nhầm
	 lẫn khi gán giá trị cho thuộc tính
	 --> giúp mình thay thế phần setter gọn hơn
 	 --> chỉ khởi tạo buildr cho instance 1 lần ban đầu
 	     muốn set lại giá trị --> không được
 	
   + thực thi
     --> Sử dụng 1 nested builder class để tạo ra instance cho current class
     . Builder: khởi tạo đối tượng, set giá trị vào
     . Class : lưu trữ, sử dụng giá trị
     
 */
public class BuilderDemo {
	public static void main(String[] args) {
		// 2023.10.08 20:18:20
		
		// Java19DateTime dt = new Java19DateTime(2023, 10, 8, 20, 18, 20);
		
		Java19DateTime dt19 = Java19DateTime.builder()
								.withDay(20)
								.withMonth(12)
								.withYear(2022)
								.withHour(10)
								.withMinute(12)
								.build();
		System.out.println("dt19" + dt19);
		
		System.out.println("\n==========================\n");
		
		Java20DateTime dt20 = Java20DateTime.of()
								.withDay(20)
								.withMonth(12)
								.withYear(2022)
								.withHour(10)
								.withMinute(12);
		
		dt20.withMinute(50);
		
		System.out.println("dt20" + dt20);
	}
}
