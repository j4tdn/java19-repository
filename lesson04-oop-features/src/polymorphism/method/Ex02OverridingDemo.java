package polymorphism.method;

//2 hay N phuong thuc dduowc goi la overriding neu
//co phuong thuc o lop cha duoc override lai trong
// 1 hoac N lop con -----> overriding
public class Ex02OverridingDemo {
	
	//mac dinh khi tao ra mot doi tuong tu class hien tai
	//se co thuoc tinh value == 99
	private int value = 99;
	
	public static void main(String[] args) {
		Ex02OverridingDemo demo = new Ex02OverridingDemo();
		System.out.println(demo);
	}
	
	//demo.tostring(); H1(value = 99)
	
	//@ laf annotation optional (co cung duoc khong cung duoc)
	//@ interface duoc tao ra de dua ra quy tac gi do
	@Override
	public String toString() {
		return "" + value;
	}
}
