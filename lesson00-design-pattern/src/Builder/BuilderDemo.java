package Builder;
/**
 * Builder Pattern
 * 
 * là 1 kĩ thuật để khởi tạo obj phức tạp:
 * 		+ obj có rất nhiều thuộc tính (>= 5 )
 * --> giúp mình thay vì gọi hàm khởi tạo nhiều tham số, dễ nhầm khi gán giá trị cho thuộc tính
 * --> giúp mình thay thế phần setter gọn hơn
 * --> chỉ khởi tạo builder cho instance 1 lần ban đầu
 * 				Muốn set lại giá trị --> không được (Java19DateTime)
 * 
 * 		+Thực thi:
 * 			--> dùng nested builder class để tạo ra instance cho current class
 * private constructor
 * 
 * 		Builder: khởi tạo đối tượng, set giá trị vào
 * 		Class: lưu trữ, sử dụng giá trị
 * 		
 * @author Admin
 *
 */
public class BuilderDemo {

	public static void main(String[] args) {
//		Java19DateTime dt = new Java19DateTime(2023,10, 8 , 20, 18, 20);
		Java19DateTime dt19 = Java19DateTime.builder()
				.withDay(20)
				.withMonth(10)
				.withDay(8)
				.withHour(20)
				.withMinute(18)
				.withSecond(20)
				.build();
		System.out.println("dt19: " + dt19);
		
		
		Java20DateTime dt20 = Java20DateTime.of()
				.withDay(20)
				.withMonth(10)
				.withDay(8)
				.withHour(20)
				.withMinute(18)
				.withSecond(20);
		
		dt20.withMinute(50);
				
		System.out.println("dt20: " + dt20);
		
	}

}
