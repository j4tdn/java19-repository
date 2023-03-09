package datastructure.object.custom;

// tạo ra KDL --> tạo ra 1 class
public class Item {
	// thuộc tính (biến toàn cục)
	public int id;
	public char name;
	public float price;
	
	// hàm khởi tạo mặc định(rỗng)
	public Item() {
		
	}
	
	public Item(int id, char name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	// phương thức
	// biến bên trong phương thức --> biến cục bộ
	
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price;
	}
	
}
