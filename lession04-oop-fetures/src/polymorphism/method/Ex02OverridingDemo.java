package polymorphism.method;

/* 
 * 2 hay nhiều phương thức được gọi là overriding nếu 
 * có 1 phương thức ở lớp cha được overriding lại trong
 * 1 hoặc nhiều lớp con --> overriding
*/
public class Ex02OverridingDemo {
	
	// mặc định khi tạo ra 1 đối tượng từ class hiện tại thì sẽ có thuộc tính value = 99
	private int value = 99;
	
	//anotation : optional(để hoặc không cũng được)
	//interface : được tạo ra để đưa ra 1 quy tắc nào đó
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(value);
	}
	
	public static void main(String[] args) {
		Ex02OverridingDemo demo = new Ex02OverridingDemo();
		System.out.println("demo : " + demo);
	}
}
