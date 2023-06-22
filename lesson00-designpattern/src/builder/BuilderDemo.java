package builder;
/*
 * --lombok
 */
public class BuilderDemo {
/*
 lý thuyết về builder pattern 
 là kỹ thuật để khởi tạo những đối tượng phức tạp 
 +đối tượng có rất nhiều thuộc tính >5 tt
 --> giúp mình thay vì gọi hàm khỏi tạo nhiều tham số, dễ nhầm lẫn khi gán giá trị cho thuộc tính
 -->giúp mình thay thế phần setter gọn hơn
 --> chỉ khởi tạo builder cho instance 1 lần ban đầu
 muốn set lại giá trị --> không được
 Thực thi --> Sử dụng 1 nested builder class để tạo ra instance cho curent class
 --> builder có nhiệm vụ khởi tạo đối tượng, set  giá trị vào
 class: lưu trữ, sử dụng giá trị
 
  */
	public static void main(String[] args) {
		Java20DateTime dt20 =Java20DateTime.of()
					.withYear(2023)
					.withMonth(10)
					.withDay(23)
					.withHour(10)
					.withMinute(11)
					.withSecond(12);
		System.out.println("dt20-->"+dt20);
		
					

	}

}
