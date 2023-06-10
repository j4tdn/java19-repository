package builder;

/**
 * Lý thuyết về builder pattern
 * 
 * Builder Parttern: là kỹ thuật để khởi tọ những đối tượng phức tạp
 *  		+ đối tượng có rất nhiều thuộc tính >= 5
 *  
 *  	--> Giúp thay vì gọi hàm khởi tạo nhiều tham số, dễ nhầm lẫn khi gán giá trị cho thuộc tính
 *  	--> Giúp thay thế phân setters gọn hơn 
 *
 */
public class BuilderDemo {
	public static void main(String[] args) {
		Java20DateTime dt20 = Java20DateTime.of().withDay(20)
												 .withMonth(12)
												 .withYear(2022)
												 .withHour(10)
												 .withMinute(12);
		dt20.withMinute(50);
		System.out.println("dt20 ---> " + dt20);
	}
}
