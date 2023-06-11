package builder;
/**
 * Builder pattern: la ky thuat de khoi tao doi tuong phuc tap
 * 	+ co it nhat 5 attributes
 * --> giup minh thay vi goi ham khoi tao nhieu tham so,
 * de nham
 * --> giup minh thay the phan setter se gon hon
 * 
 * 	Thuc thi
 * --> su dung 1 nested builder class de tao ra instance cho current class
 * 	.Builder: khoi tao doi tuong, set gia tri vao
 * 	.Class: luu tru , su dung gia tri
 * 
 */
public class BuilderDemo {
	public static void main(String[] args) {
		
		
		Java20DateTime dt20= Java20DateTime.of()
				.withDay(20)
				.withMonth(12)
				.withYear(2022)
				.withHour(10)
				.withMinute(12);

		dt20.withMinute(50);
		System.out.println("dt20 " + dt20);
		
	}
	

}


