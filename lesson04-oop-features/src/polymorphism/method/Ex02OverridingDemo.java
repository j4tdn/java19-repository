package polymorphism.method;

// 2 hay N phương thức được gọi là overriding nếu 
// có một phương thức ở lớp cha được override lại trong 
// 1 hoặc nhiều lớp con -- overriding
public class Ex02OverridingDemo {
	// Mặc định khi tạo ra 1 đối tượng từ class
	// hiện tại thì 
	private int value = 99;
public static void main(String[] args) {
	Ex02OverridingDemo demo = new Ex02OverridingDemo();
	System.out.println("demo -> " + demo);
	
}
@Override
public String toString() {
	return "" + value;
}
}
