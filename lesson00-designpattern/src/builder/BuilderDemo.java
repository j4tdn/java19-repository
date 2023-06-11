package builder;

/**
 * Ly thuyet ve builder pattern
 * 
 * Builder Pattern: la ky thuat de khoi tao nhung doi tuong phuc tap
 * 	doi tuong co rat nhieu thuoc tinh >= 5
 * 
 * --> giup minh thay vi goi ham khoi tao nhieu tham so, de nham lan khi gan gia tri cho thuoc tinh
 * --> giup minh thay the phan setter gon hon
 * 
 * + thuc thi:
 *  --> su dung 1 nested builder class de tao ra instance cho current class
 *  . Builder: khoi tao doi tuong, set gia tri vao
 *  . Class: lưu trữ, sử dụng giá trị
 *	
 *
 */
public class BuilderDemo {
	public static void main(String[] args) {
		Java20DateTime jv20 = Java20DateTime.of()
				.withDay(20)
				.withHour(12)
				.withMinute(30)
				.withMonth(5)
				.withSecond(40)
				.withYear(2023);
		System.out.println(jv20);
	}

}
