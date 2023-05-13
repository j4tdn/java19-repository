package polymorphism.method;
// 2 hay N phương thức được gọi là overriding nếu 
// có phương thức ở lớp cha được overriding lại trong 
// 1 hoặc N lớp con ---> overrding
public class Ex02OverridingDemo {
	// mặc định khi tạo ra 1 đối tượng từ class
	// hiện tại thì sẽ có thuộc tính value = 99
	private int value = 99;

	public static void main(String[] args) {
		Ex02OverridingDemo demo = new Ex02OverridingDemo();
		System.out.println("demo ----> " + demo);
	}

	@Override
	public String toString() {
		return "" + value;
	}

}
