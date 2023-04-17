package polymorphism.method;


// 2 hay N phương thức được gọi là overriding nếu có 1 phuonwg thức ở lớp cha
// được override lại trong 1 hoặc N lớp con --> overriding

public class Ex02OverridingDemo {
	
	//mặc định khi tạo ra đối tượng từ class hiện tại thì sẽ có giá trị của value là 99
	private int value = 99;
	
	
	public static void main(String[] args) {
		Ex02OverridingDemo demo = new Ex02OverridingDemo();
		System.out.println("demo -> " + demo);
	}
	
	//annotation: (optional)
	//@interface được tạo ra để đưa ra quy tắc gì đó
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
}
